package com.project.medics.clinicW.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.medics.command.RentalVO;

@Mapper
public interface RentalJYMapper {

    public List<RentalVO> rentallist();
    public List<RentalVO> rentalapp();
    public List<RentalVO> appovalc();


}
