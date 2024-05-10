package com.example.demoApp.Repository;

import com.example.demoApp.model.Post;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PostRepostory {


    private static PostRepostory postRepostory = new PostRepostory();
    Map<String, Post> postMap = new HashMap<>();


    public Map<String, Post> getAllPost(){
        postMap.put("1", new Post("1"));
        postMap.put("2", new Post("2"));
        return postMap;
    }


    public static PostRepostory getPostRepostory(){
        return postRepostory;
    }
}
