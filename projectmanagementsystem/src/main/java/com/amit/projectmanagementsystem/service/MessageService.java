package com.amit.projectmanagementsystem.service;

import com.amit.projectmanagementsystem.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MessageService {

    Message sendMessage(Long senderId, Long chatId,String content) throws Exception;

    List<Message> getMessagesByProjectId(Long projectId) throws Exception;
}
