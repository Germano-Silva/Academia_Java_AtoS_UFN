package com.sexy.Surfistinha.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sexy.Surfistinha.Models.Produto;

// Criando um repositório para a classe Produto.
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}

