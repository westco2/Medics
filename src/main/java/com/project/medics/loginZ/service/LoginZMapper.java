package com.project.medics.loginZ.service;
import com.project.medics.command.LoginZVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginZMapper {

    void join(LoginZVO loginZVO);

    @Select("SELECT * FROM login_user_table WHERE username = #{username}")
    LoginZVO loginZVO(String username);
}

