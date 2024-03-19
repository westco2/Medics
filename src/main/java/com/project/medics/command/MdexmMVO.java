package com.project.medics.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MdexmMVO {
    private Integer mdexm_no;
    private LocalDateTime mdexm_ymd;
    private String excptn_mttr;
    private String studentid;
    private String mdexm_act;
    private String mdexm_cdt;
    private String dss_no;
    private  String dss_nm;



}
