package com.project.medics.postY.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.project.medics.domaindto.ReplyRequestDto;
import com.project.medics.domaindto.ReplyResponseDto;
import com.project.medics.domainpost.Reply;
import com.project.medics.domainpost.ReplyRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ReplyService {
    private final ReplyRepository replyRepository;

    // Create Reply
    @Transactional
    public Long save(ReplyRequestDto requestDto){
        Reply reply = new Reply(requestDto);
        return replyRepository.save(reply).getId();
    }

    // Delete Reply
    @Transactional
    public void delete(Long replyId, String userId){
        Reply reply = replyRepository.findById(replyId).orElseThrow(
                ()->new IllegalArgumentException("해당 게시물이 없습니다. id = "+replyId));

        if (!reply.getWriter().equals(userId)) {
            throw new IllegalArgumentException("자신이 쓴 댓글만 삭제할 수 있습니다.");
        }
        replyRepository.deleteById(replyId);
    }


    // Read Reply List
    @Transactional
    public List<ReplyResponseDto> findReplyList(Long postId){
        // replyRepository.findAll()는 List<Post>를 반환하는데
        // 이를 List<ReplyResponseDto>로 바꿔서 반환
        return replyRepository.findAllByPostIdOrderByCreatedAtDesc(postId).stream()
                .map(reply -> new ReplyResponseDto(reply)).collect(Collectors.toList());
    }

    // Read One Post By Id
    @Transactional
    public ReplyResponseDto findById(Long id){
        Reply reply = replyRepository.findById(id).orElseThrow(
                ()->new IllegalArgumentException("해당 댓글이 없습니다. id = "+id));
        return new ReplyResponseDto(reply);
    }

    // Update Reply By Id
    @Transactional
    public Long update (Long id, ReplyRequestDto requestDto, String userId){
        Reply reply = replyRepository.findById(id).orElseThrow(
                ()->new IllegalArgumentException("해당 댓글이 없습니다. id = "+id));
        if (!reply.getWriter().equals(userId)) {
            throw new IllegalArgumentException("자신이 쓴 댓글만 수정할 수 있습니다.");
        }
        reply.update(requestDto);
        return id;
    }
}
