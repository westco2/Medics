package com.project.medics.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RentalVO {

    private String key;
    private String proNo;
    private String field;
    private String key2;
    private Date resYMD;
    private String loanStatus;
    private String appStatus;
    private Long studentId;
    private String proQty;
    private String proNm;
    private String resCnt;
    
}


