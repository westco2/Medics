package com.project.medics.clinicW.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.medics.command.ClinicWVO;

@Service("clinicWService")
public class ClinicWServiceImpl implements ClinicWService{
	
	@Autowired
	private ClinicWMapper clinicWMapper;
	
	@Override
	public int regist(ClinicWVO vo) {
		return clinicWMapper.regist(vo);
	}
	
	@Override
	public ArrayList<ClinicWVO> getPage() {
		return clinicWMapper.getPage();
	}

//	@Override
//	public ClinicWVO getDetail(int cli_ntc_sn) {
//		return clinicWMapper.getDetail(cli_ntc_sn);
//	}
	
	@Override
	public ClinicWVO getClinicWUpdate(int cli_ntc_sn) {
		return clinicWMapper.getClinicWUpdate(cli_ntc_sn);
	}
	
	@Override
	public ArrayList<ClinicWVO> getStatus() {
		return clinicWMapper.getStatus();
	}
	
	public ArrayList<ClinicWVO> getReview() {
		return clinicWMapper.getReview();
	}
	
	@Override
	public void delete(int cli_sn) {
	}
	
}
