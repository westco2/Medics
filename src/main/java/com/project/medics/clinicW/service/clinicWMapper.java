package com.project.medics.clinicW.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.project.medics.command.ClinicWVO;


@Mapper
public interface ClinicWMapper {

	public int regist(ClinicWVO vo);
	public ArrayList<ClinicWVO> getPage();
	public ArrayList<ClinicWVO> getStatus();
	public ArrayList<ClinicWVO> getReview();
	public ClinicWVO getClinicWUpdate(int cli_ntc_sn);
//	public ClinicWVO getDetail(int cli_ntc_sn);
	public void delete(int cli_sn);
}