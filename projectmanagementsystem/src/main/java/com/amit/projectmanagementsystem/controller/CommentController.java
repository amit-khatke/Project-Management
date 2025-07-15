package com.amit.projectmanagementsystem.controller;

import com.amit.projectmanagementsystem.model.Comment;
import com.amit.projectmanagementsystem.model.Issue;
import com.amit.projectmanagementsystem.model.User;
import com.amit.projectmanagementsystem.request.CreateCommentRequest;
import com.amit.projectmanagementsystem.response.MessageResponse;
import com.amit.projectmanagementsystem.service.CommentService;
import com.amit.projectmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private UserService userService;

    @PostMapping("")
    public ResponseEntity<Comment> createComment(@RequestBody CreateCommentRequest req,
                                                 @RequestHeader("Authorization") String jwt) throws Exception{
        User user=userService.findUserProfileByJwt(jwt);
        Comment createComment=commentService.createComment(
                req.getIssueId(),
                user.getId(),
                req.getContent());
        return new ResponseEntity<>(createComment, HttpStatus.CREATED);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<MessageResponse> deleteComment(@PathVariable Long commentId,
                                                         @RequestHeader("Authorization") String jwt)throws Exception{
        User user=userService.findUserProfileByJwt(jwt);
        commentService.deleteComment(commentId, user.getId());
        MessageResponse res=new MessageResponse();
        res.setMessage("comment deleted Successfully");
        return new ResponseEntity<>(res,HttpStatus.OK);
    }

    @GetMapping("/{issueId}")
    public ResponseEntity<List<Comment>> getCommentsByIssueId(@PathVariable Long issueId) {
        List<Comment> comments = commentService.findCommentByIssueId(issueId);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }
}
