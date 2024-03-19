package com.project.medics.command;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClinicWVO {
	//Regist 테이블
	private int cli_ntc_sn; //번호
    private String cli_clsf_nm; //분류
    private String cli_ntc_ttl; //제목
    private String cli_ntc_cn; //내용
    private String cli_use_plc_nm; //장소
    private Date cli_ntc_ymd; //날짜
    private String cli_prgrs_hr; //진행시간
    private int cli_now_nope; //현재인원
    private int cli_max_nope; //최대인원
    private String cli_instr_nm; //진행자
    private String cli_rmrk_cn; //비고
    
    //Apply 테이블
    private int cli_sn; //신청번호
    private	String cli_status; //상태
    
    //Review 테이블
    private String cli_wri_ttl; //제목
    private String cli_wri_cn; //내용
    private String cli_wri_yn; //여부
    
    //가데이터
    private String studentid;
}