package com.project.medics.domain.dto;

import com.project.medics.domain.post.Reply;

import lombok.Getter;

@Getter
public class ReplyResponseDto {
    private Long id;
    private String content;
    private String writer;

    public ReplyResponseDto(Reply reply){
        this.id = reply.getId();
        this.content = reply.getContent();
        this.writer = reply.getWriter();
    }
}
