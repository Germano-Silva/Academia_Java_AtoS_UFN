package com.sexy.Surfistinha.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sexy.Surfistinha.Models.Produto;
import com.sexy.Surfistinha.Repositories.ProdutoRepository;

/**
 * É um controller REST que mapeia o endpoint /produtos para um método que retorna uma lista de todos os
 * produtos no banco de dados
 */
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> getprodutos() {
        return produtoRepository.findAll();
    }

/**
 * Pega um objeto JSON, converte em objeto Produto e salva no banco de dados
 *
 * @param produto O objeto que será salvo no banco de dados.
 * @return O objeto Produto está sendo retornado.
 */
    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public Produto adicionar(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

/**
 * Pega o id de um produto e retorna o produto com esse id
 *
 * @param id O id do produto a ser recuperado.
 * @return Um objeto Produto.
 */
    @GetMapping("/{id}")
    Produto getproduto(@PathVariable Long id) {

        return produtoRepository.findById(id).get();

    }

/**
 * Apaga um produto pelo seu id
 *
 * @param id O id do produto a ser excluído.
 */
    @DeleteMapping("/excluir/{id}")
    @ResponseStatus(HttpStatus.OK)
    void deleteproduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }

/**
 * Ele pega um novo produto e um id, encontra o produto com esse id e atualiza o produto com
 * os dados do novo produto
 *
 * @param novoProduto o novo produto
 * @param id o id do produto a ser atualizado
 * @return O produto está sendo devolvido.
 */
    @PutMapping("/alterar/{id}")
    Produto updateproduto(@RequestBody Produto novoProduto, @PathVariable Long id) {
        Produto p = produtoRepository.findById(id).get();
        if ((novoProduto.getCodigo() != null)) {
            p.setCodigo(novoProduto.getCodigo());
        }
        if (novoProduto.getNome() != null) {
            p.setNome(novoProduto.getNome());
        }
        p.setCategoria(novoProduto.getCategoria());
        p.setValor(novoProduto.getValor());
        p.setQuantidade(novoProduto.getQuantidade());
        return produtoRepository.save(p);

    }

}

