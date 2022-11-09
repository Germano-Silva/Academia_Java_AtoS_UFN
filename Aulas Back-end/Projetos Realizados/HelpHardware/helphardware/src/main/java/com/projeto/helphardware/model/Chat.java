package com.projeto.helphardware.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Chat {
	
	@Id //@NotEmpty
	private String nomeChat;
	
	//@NotEmpty
	private String mensagemChat;
	
	@ManyToOne
	private Assistencia assistencia;

	public String getNomeChat() {
		return nomeChat;
	}

	public void setNomeChat(String nomeChat) {
		this.nomeChat = nomeChat;
	}

	public String getMensagemChat() {
		return mensagemChat;
	}

	public void setMensagemChat(String mensagemChat) {
		this.mensagemChat = mensagemChat;
	}

	public Assistencia getAssistencia() {
		return assistencia;
	}

	public void setAssistencia(Assistencia assistencia) {
		this.assistencia = assistencia;
	}

	
}
