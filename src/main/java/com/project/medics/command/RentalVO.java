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

	private String pro_No;
    private String pro_Qty;
    private String pro_Nm;
    private Integer loan_No;
    private Date ret_YMD;
    private String loan_Status;
    private String app_Status;
    private String pro_No_Approval;
    private String studentId;
    private Integer ren_No;
    private String ren_Status;
    
}


