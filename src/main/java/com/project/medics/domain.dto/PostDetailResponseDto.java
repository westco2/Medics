package com.project.medics.domain.dto;

import java.time.LocalDateTime;

import com.project.medics.domain.post.Post;

import lombok.Getter;

@Getter
public class PostDetailResponseDto {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String writer;

    public PostDetailResponseDto(Post post){
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.createdAt = post.getCreatedAt();
        this.writer = post.getWriter();
    }
}
