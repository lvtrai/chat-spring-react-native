package com.lvtrai18.chatspringreactnative.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvtrai18.chatspringreactnative.model.Message;
import com.lvtrai18.chatspringreactnative.repositiry.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageRepository messageRepository;

	@Override
	public Optional<Message> findLatestMessage(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Message message) {
		messageRepository.save(message);
	}

	@Override
	public void remove(Message message) {
		messageRepository.delete(message);

	}

	@Override
	public Optional<Message> findById(Long id) {
		return messageRepository.findById(id);
	}

	@Override
	public List<Message> findAll() {
		return (List<Message>) messageRepository.findAll();
	}

	@Override
	public List<Message> findByUsername(String username) {
		return messageRepository.find(username);
	}
}
