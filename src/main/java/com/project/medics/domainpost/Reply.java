package com.project.medics.domainpost;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.project.medics.domain.Timestamped;
import com.project.medics.domaindto.ReplyRequestDto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Reply extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String writer;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(nullable = false)
    private Long postId;

    public Reply(ReplyRequestDto requestDto){
        this.content = requestDto.getContent();
        this.writer = requestDto.getWriter();
        this.postId = requestDto.getPostId();
    }

    public void update(ReplyRequestDto requestDto){
        this.content = requestDto.getContent();
    }
}