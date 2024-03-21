package com.project.medics.loginZ.service;
import com.project.medics.command.LoginZVO;
import com.project.medics.command.MdexmMVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface LoginZMapper {

    void join(LoginZVO loginZVO);

    @Select("SELECT * FROM login_user_table WHERE username = #{username}")
    LoginZVO loginZVO(String username);

    @Select("SELECT * FROM mdexm LEFT JOIN dss ON mdexm.dss_no = dss.dss_no WHERE mdexm.STUDENTID = #{username}")
    ArrayList<MdexmMVO> mdexmMVOZ(String username);

    Integer checkIDZ(String username);
}


