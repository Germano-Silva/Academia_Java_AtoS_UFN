package com.sexy.Surfistinha.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Uma anotação JPA que diz ao provedor JPA para mapear a classe "Produto" 
 * para uma tabela chamada `surfistinha` no
 * base de dados.
 * 
 * Produto é uma classe que representa um produto no sistema
 * @id = Uma anotação JPA que diz ao provedor JPA para mapear o campo `id` para a chave primária da tabela.
 * @GeneratedValue(strategy = GenerationType.IDENTITY) = Dizendo ao provedor JPA para usar o recurso de incremento automático do banco de dados para gerar um valor exclusivo para o campo `id`.
 * @Column(nullable = false, unique = true) = Dizendo ao provedor JPA para mapear o campo para uma coluna na tabela do banco de dados. O `anulável` atributo está informando ao provedor JPA que a coluna não pode ser nula. O atributo `único` é informando ao provedor JPA que a coluna deve ser exclusiva.
 */
@Entity
@Table(name="surfistinha")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id = null;
    @Column(nullable = false, unique = true)
    private String codigo;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false)
    private String categoria;
    @Column(nullable = false)
    private Float valor;
    @Column(nullable = false)
    private int quantidade;


    public Long getId() {
        return this.id;
    }


    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Float getValor() {
        return this.valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}

