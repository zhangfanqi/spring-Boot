package com.neo.springBoot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.springBoot.model.Message;
import com.neo.springBoot.repository.MessageRepository;
import com.neo.springBoot.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	private MessageRepository messageRepository;
	
	@Override
	public List<Message> getMessageList() {
		return messageRepository.findAll();
	}

	@Override
	public Message findMessageById(long id) {
		return messageRepository.findById(id);
	}

	@Override
	public void save(Message message) {
		messageRepository.save(message);
	}

	@Override
	public void edit(Message message) {
		messageRepository.save(message);
	}

	@Override
	public void delete(long id) {
		messageRepository.deleteById(id);
	}

}
