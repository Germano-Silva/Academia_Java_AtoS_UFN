package com.projeto.helphardware.controller;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.projeto.helphardware.model.Chat;
import com.projeto.helphardware.model.Assistencia;
import com.projeto.helphardware.repository.AssistenciaRepository;
import com.projeto.helphardware.repository.ChatRepository;

@Controller
public class AssistenciaController {

	@Autowired
	private AssistenciaRepository ar;
	
	@Autowired
	private ChatRepository cr;
	
/**
  * Retorna a string "assistencia/formAssistencia" quando o usuário solicita a URL "/cadastrarAssistencia" usando
  * o método GET
  *
  * @return A página formAssistencia.
  */
	@RequestMapping(value="/cadastrarAssistencia", method=RequestMethod.GET)
	public String form(){
		return "assistencia/formAssistencia";
	}
	
/**
  * Recebe uma requisição do usuário, valida os dados, salva no banco de dados e retorna um
  * mensagem para o usuário
  *
  * @param assistencia o objeto que será utilizado para armazenar os dados inseridos pelo usuário.
  * @param resultado Este é o resultado da validação.
  * Atributos @param Este é um parâmetro que permite passar dados para a próxima requisição.
  * @return Uma string
  */
	@RequestMapping(value="/cadastrarAssistencia", method=RequestMethod.POST)
	public String form(@Validated Assistencia assistencia, BindingResult result, RedirectAttributes attributes){
		if(result.hasErrors()){
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/cadastrarAssistencia";
		}
		
		ar.save(assistencia);
		attributes.addFlashAttribute("mensagem", "Assistencia cadastrado com sucesso!");
		return "redirect:/cadastrarAssistencia";
	}
	
	/**
      * Retorna um objeto ModelAndView que contém uma lista de todos os assistencias do banco de dados
      *
      * @return Um objeto ModelAndView.
      */
    @RequestMapping("/assistencias")
	public ModelAndView listaAssistencias(){
		ModelAndView mv = new ModelAndView("listaAssistencias");
		Iterable<Assistencia> assistencias = ar.findAll();
		mv.addObject("assistencias", assistencias);
		return mv;
	}
	
/**
  * Recebe uma variável longa chamada codigo, que é o código do assistencia, e retorna um ModelAndView
  * objeto com os detalhes do assistencia
  *
  * @param codigo A variável que será passada na URL.
  * @return Um objeto ModelAndView.
  */
	@RequestMapping(value="/{codigo}", method=RequestMethod.GET)
	public ModelAndView detalhesAssistencia(@PathVariable("codigo") long codigo){
		Assistencia assistencia = ar.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("assistencia/detalhesAssistencia");
		mv.addObject("assistencia", assistencia);
		
		Iterable<Chat> chats = cr.findByAssistencia(assistencia);
		mv.addObject("chats", chats);
		
		return mv;
	}
	
	/**
      * Exclui um assistencia do banco de dados
      *
      * @param codigo o id do assistencia
      * @return Uma String
      */
    @RequestMapping("/deletarAssistencia")
	public String deletarAssistencia(long codigo){
		Assistencia assistencia = ar.findByCodigo(codigo);
		ar.delete(assistencia);
		return "redirect:/assistencias";
	}
	
	
	/**
      * Leva o codigo do assistencia, o chat, o resultado da validação e os atributos
      * do redirecionamento
      *
      * @param codigo o id do assistencia
      * @param chat é o objeto que será utilizado para armazenar os dados inseridos pelo usuário.
      * @param result O resultado da validação e vinculação e se falhou ou não.
      * @param atributos Este é um objeto RedirectAttributes. É usado para passar atributos para o próximo
      * solicitar.
      * @return Uma string
      */
    @RequestMapping(value="/{codigo}", method=RequestMethod.POST)
	public String detalhesAssistenciaPost(@PathVariable("codigo") long codigo, @Validated Chat chat,  BindingResult result, RedirectAttributes attributes){
		if(result.hasErrors()){
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/{codigo}";
		}
		Assistencia assistencia = ar.findByCodigo(codigo);
		chat.setAssistencia(assistencia);
		cr.save(chat);
		attributes.addFlashAttribute("mensagem", "Chat adicionado com sucesso!");
		return "redirect:/{codigo}";
	}
	
	/**
      * Exclui um chat do banco de dados e redireciona para a página do assistencia
      *
      * @param rg ID do chat
      * @return O retorno é um redirecionamento para a página do assistencia.
      */
    @RequestMapping("/deletarChat")
	public String deletarChat(String nomeChat){
		Chat chat = cr.findByNomeChat(nomeChat);
		cr.delete(chat);
		
		Assistencia assistencia = chat.getAssistencia();
		Long codigoLong = assistencia.getCodigo();
		String codigo = "" + codigoLong;
		return "redirect:/" + codigo;
	}
}