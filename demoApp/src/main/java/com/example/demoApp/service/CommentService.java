package com.example.demoApp.service;

import com.example.demoApp.model.Comment;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CommentService {
    void postComment(String postId, Comment comment);


   List<Comment> getCommentByPostId(String postId);

    List<Comment> getALLComment(String commentId);
}
