package com.project.medics.clinicW.service;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;
import com.project.medics.command.ClinicWVO;
@Mapper
public interface ClinicWMapper {
	public int regist(ClinicWVO vo);
	public ArrayList<ClinicWVO> getList();
	public ClinicWVO getDetail(int cli_ntc_sn);
	public int update(ClinicWVO vo);
	public void deletewu(int cli_ntc_sn);
	public void deletews(int cli_sn);
	public void deletewr(int cli_sn);
	
	public int apply(ClinicWVO vo);
	public ArrayList<ClinicWVO> getStatus();
	public ArrayList<ClinicWVO> getReview();
}