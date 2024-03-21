package com.project.medics.clinicW.service;

import java.util.ArrayList;

import com.project.medics.command.ClinicWVO;

public interface ClinicWService {
	public int regist(ClinicWVO vo);
	public ArrayList<ClinicWVO> getList();
	public ClinicWVO getDetail(int cli_ntc_sn);
	public int update(ClinicWVO vo);
	public void delete(int cli_ntc_sn);
	
	public int apply(ClinicWVO vo);
	public ArrayList<ClinicWVO> getStatus();
	public ArrayList<ClinicWVO> getReview();
}


