package com.project.medics.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CriteriaM {


    /* 검색 키워드 */
    private String searchCode;
    private String searchName;
    private String searchNum;
    private String startDate;
    private String endDate;


}
