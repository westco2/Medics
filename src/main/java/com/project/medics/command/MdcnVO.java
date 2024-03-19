package com.project.medics.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MdcnVO {

    private String mdcn_code;
    private String mdcn_nm;
    private Integer mdcn_qty;
    private String mdcn_tp;
}
