package com.amit.projectmanagementsystem.service;

import com.amit.projectmanagementsystem.model.Chat;
import com.amit.projectmanagementsystem.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService{

    @Autowired
    private ChatRepository chatRepository;

    @Override
    public Chat createdChat(Chat chat) {
        return chatRepository.save(chat);
    }
}
