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
	public ArrayList<ClinicWVO> getList() {
		return clinicWMapper.getList();
	}
	
	@Override
	public ClinicWVO getDetail(int cli_ntc_sn) {
		return clinicWMapper.getDetail(cli_ntc_sn); 
	}
	
	@Override
	public int update(ClinicWVO vo) {
		return clinicWMapper.update(vo);
	}
	
	@Override
	public void deletewu(int cli_ntc_sn) {
		clinicWMapper.deletewu(cli_ntc_sn);
	}
	
	@Override
	public void deletews(int cli_sn) {
		clinicWMapper.deletews(cli_sn);
	}
	
	@Override
	public void deletewr(int cli_sn) {
		clinicWMapper.deletewr(cli_sn);
	}
	
	@Override
	public int apply(ClinicWVO vo) {
		return clinicWMapper.apply(vo);
	}
	
	@Override
	public ArrayList<ClinicWVO> getStatus() {
		return clinicWMapper.getStatus();
	}
	
	@Override
	public ArrayList<ClinicWVO> getReview() {
		return clinicWMapper.getReview();
	}
	
	
}
