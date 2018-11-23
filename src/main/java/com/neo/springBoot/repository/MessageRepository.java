package com.neo.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.springBoot.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{

	Message findById(long id);

	Message deleteById(long id);
}
