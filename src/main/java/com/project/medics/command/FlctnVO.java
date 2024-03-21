package com.project.medics.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FlctnVO {

    private Integer flctn_no;
    private String mdcn_code;
    private String flctn_tp;
    private Integer mdexm_no;
    private Integer flctn_qty;
    private LocalDateTime flctn_ymd;
    private String flctn_rsn;
    private String mdcn_nm;
    private String mdcn_tp;


    private Integer hidden_qty;

}
