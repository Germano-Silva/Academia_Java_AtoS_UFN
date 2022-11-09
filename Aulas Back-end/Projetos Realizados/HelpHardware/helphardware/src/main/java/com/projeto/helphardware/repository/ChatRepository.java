package com.projeto.helphardware.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projeto.helphardware.model.Assistencia;
import com.projeto.helphardware.model.Chat;

@Repository
public interface ChatRepository extends CrudRepository<Chat, String>{
	Iterable<Chat> findByAssistencia(Assistencia assistencia);
	Chat findByNomeChat(String nomeChat);
}
