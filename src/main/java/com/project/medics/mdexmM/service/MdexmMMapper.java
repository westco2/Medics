package com.project.medics.mdexmM.service;

import com.project.medics.command.*;
import com.project.medics.util.CriteriaM;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MdexmMMapper {
    public void regdss(List<DssVO> vo);
    public List<DssVO> getdssList(CriteriaM cri);
    public void dssdel(String dss_no);
    public void regmdcn(MdcnVO vo);
    public void regflctn(MdcnVO vo);
    public List<MdcnVO> getTherapyList(CriteriaM cri);
    public List<MdcnVO> getWrhsList(CriteriaM cri);
    public void delmdcn(FlctnVO vo);
    public void updatemdcn(FlctnVO co);
    public List<FlctnVO> getflctnList();
    public void changeflctn(FlctnVO vo);
    public List<StudentVO> getstdInfo(CriteriaM cri);
    public int regChart (MdexmMVO vo);

    public void mdexmFlctnreg(FlctnVO vo);

    public void updateMdcns(FlctnVO vo);

    public List<StudentVO> getusrInfo(CriteriaM cri);


    public List<MdexmMVO> getmdx(StudentVO vo);
    public List<FlctnVO> getfll(FlctnVO vo);

    public List<TotalMVO> weekvi();
    public List<TotalMVO> mdcnbest();
    public List<TotalMVO> totalInfo();
    public List<FlctnVO> getflctnwr(CriteriaM cri);

}
