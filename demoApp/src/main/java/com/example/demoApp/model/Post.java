package com.example.demoApp.model;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Post {
    private String id;


    List<Comment> commentList;


    public Post(String id){
        this.id = id;
        commentList = new ArrayList<>();
    }
}
