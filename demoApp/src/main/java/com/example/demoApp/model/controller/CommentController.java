package com.example.demoApp.model.controller;

import com.example.demoApp.model.Comment;
import com.example.demoApp.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/{postId}")
    public void postComment(@PathVariable String postId, @RequestBody Comment comment){
        commentService.postComment(postId, comment);
    }



    @GetMapping("post/{postId}")
    public List<Comment> getCommentByPostId(@PathVariable String postId){
        return commentService.getCommentByPostId(postId);
    }

    @
    GetMapping("{commentId}")
    public List<Comment> getAllComment(@PathVariable String commentId){
        return commentService.getALLComment(commentId);
    }
}
