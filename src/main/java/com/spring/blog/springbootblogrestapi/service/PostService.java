package com.spring.blog.springbootblogrestapi.service;

import com.spring.blog.springbootblogrestapi.payload.PostDto;
import com.spring.blog.springbootblogrestapi.payload.PostResponse;

public interface PostService {

    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(Long postId);

    PostDto updatePost(PostDto postDto, Long postId);

    Void deletePostById(long postId);
}
