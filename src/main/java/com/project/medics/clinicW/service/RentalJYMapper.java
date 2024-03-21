package com.project.medics.clinicW.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.project.medics.command.RentalVO;

@Mapper
public interface RentalJYMapper {

    public List<RentalVO> rentallist();
    public List<RentalVO> rentalapp();
    public List<RentalVO> appovalc();
    public void insertRentalApp(RentalVO rental);
    void decreaseQuantity(RentalVO vo);
    public void appolist (RentalVO rental);
    void updateRentalApp (RentalVO vo);
    public void apprental (RentalVO rental);
    void listapp (RentalVO vo);
	public void apprabs(RentalVO rental);
    }

