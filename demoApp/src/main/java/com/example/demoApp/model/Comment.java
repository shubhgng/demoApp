package com.example.demoApp.model;

import lombok.Data;

import java.util.List;

@Data
public class Comment {
    private String commentId;
    private String commentText;
    private User user;
    List<Comment> repliesList;

    public Comment(String commentId, String commentText) {
        this.commentId = commentId;
        this.commentText= commentText;
    }
}
