package com.project.medics.mdexmM.service;

import com.project.medics.command.*;
import com.project.medics.util.CriteriaM;

import java.util.List;

public interface MdexmMService {
    //질병 등록
    public void regdss(List<DssVO> vo);
    //질병 리스트
    public List<DssVO> getdssList(CriteriaM cri);
    //질병 삭제
    public void dssdel(String dss_no);

    //처치물품 등록
    public void regmdcn (MdcnVO vo);
    //처치물품 리스트
    public List<MdcnVO> getTherapyList(CriteriaM cri);
    public List<MdcnVO> getWrhsList(CriteriaM cri);
    public List<FlctnVO> getflctnList();

    //의약품 업데이트 및 삭제
    public void delmdcn(FlctnVO vo);
    public void updatemdcn(FlctnVO vo);
    //의약품 입고 기록
    public void regflctn(MdcnVO vo);

    public void changeflctn(FlctnVO vo);
    public List<StudentVO> getstdInfo(CriteriaM cri);
    public List<StudentVO> getursInfo(CriteriaM cri);

    public int regChart(MdexmMVO vo, List<FlctnVO> list);

    public List<MdexmMVO> getmdx(StudentVO vo);
    public List<FlctnVO> getfll(FlctnVO vo);
}
