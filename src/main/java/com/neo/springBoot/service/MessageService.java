package com.neo.springBoot.service;

import java.util.List;

import com.neo.springBoot.model.Message;

public interface MessageService {
	
	public List<Message> getMessageList();

    public Message findMessageById(long id);

    public void save(Message message);

    public void edit(Message message);

    public void delete(long id);
}
