package com.projeto.helphardware.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projeto.helphardware.model.Assistencia;

@Repository
public interface AssistenciaRepository extends CrudRepository<Assistencia, String>{
	Assistencia findByCodigo(long codigo);
}
