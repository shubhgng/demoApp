package com.example.demoApp.service;

import com.example.demoApp.Repository.PostRepostory;
import com.example.demoApp.model.Comment;
import com.example.demoApp.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommentServiceImp implements CommentService{
    Map<String, Comment> commentMap = new HashMap<>();


    private PostRepostory postRepostory = PostRepostory.getPostRepostory();

    @Override
    public void postComment(String postId, Comment comment) {
        Map<String, Post> postMap = postRepostory.getAllPost();
        if(!postMap.containsKey(postId)){
            System.out.println("Id doesn't exits");
        }
        Post post = postMap.get(postId);
        List<Comment> commentList = post.getCommentList();
        Comment newComment = new Comment(comment.getCommentId(), comment.getCommentText());
        commentList.add(newComment);
        post.setCommentList(commentList);
        commentMap.put(comment.getCommentId(), newComment);
        postMap.put(postId, post);
    }

    @Override
    public List<Comment> getCommentByPostId(String postId) {
        Map<String, Post> postMap = postRepostory.getAllPost();
        if(!postMap.containsKey(postId)){
            System.out.println("Id doesn't exits");
        }
        Post post = postMap.get(postId);
        return post.getCommentList();
    }

    @Override
    public List<Comment> getALLComment(String commentId) {
        List<Comment> commentList = new ArrayList<>();
        for(Map.Entry<String, Comment> mapEle : commentMap.entrySet()){
            commentList.add(mapEle.getValue());
        }
        return  commentList;
    }


}
