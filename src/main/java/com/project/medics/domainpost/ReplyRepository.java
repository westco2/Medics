package com.project.medics.domainpost;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository  extends JpaRepository<Reply, Long> {
    // 생성일자 기준 내림차순 정렬
    List<Reply> findAllByPostIdOrderByCreatedAtDesc(long postId);
}
