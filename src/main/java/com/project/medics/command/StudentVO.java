package com.project.medics.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentVO {
    private String studentid; //학번
    private String scsbjt_nm; //학과
    private String grade; //학년
    private String korn_flnm; //이름
    private String gndr_nm; //성별
    private String student_age; //나이
    private String idfr_telno; //연락처
    private String lotno_daddr; //주소
    private String mbr_eml_addr; //이메일
    private String enrollment; // 학적상태
    private String user_brdt; //생년월일

}
