package com.project.medics.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReplyRequestDto {
    private Long postId;
    private String content;
    private String writer;
}