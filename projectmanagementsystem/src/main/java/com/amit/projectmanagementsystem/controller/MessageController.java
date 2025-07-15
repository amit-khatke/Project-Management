package com.amit.projectmanagementsystem.controller;

import com.amit.projectmanagementsystem.model.Chat;
import com.amit.projectmanagementsystem.model.Message;
import com.amit.projectmanagementsystem.model.User;
import com.amit.projectmanagementsystem.request.CreateMessageRequest;
import com.amit.projectmanagementsystem.service.MessageService;
import com.amit.projectmanagementsystem.service.ProjectService;
import com.amit.projectmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private UserService userService;

    @Autowired
    private ProjectService projectService;

    @PostMapping("/send")
    public ResponseEntity<Message> sendMessage(@RequestBody CreateMessageRequest request) throws Exception{

        User user=userService.findUserById(request.getSenderId());

        Chat chats=projectService.getProjectById(request.getProjectId()).getChat();
        if(chats==null) throw new Exception("chats not found");
        Message sentMessage= messageService.sendMessage(request.getSenderId(),
                request.getProjectId(), request.getContent());

        return ResponseEntity.ok(sentMessage);
    }

    @GetMapping("/chat/{projectId}")
    public ResponseEntity<List<Message>> getMessageByChatId(@PathVariable Long projectId) throws Exception{
        List<Message> messages=messageService.getMessagesByProjectId(projectId);
        return ResponseEntity.ok(messages);
    }
}
