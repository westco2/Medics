package com.project.medics.mdexmM.service;

import com.project.medics.command.*;
import com.project.medics.util.CriteriaM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "MdexmMService")
public class MdexmMServiceImpl implements MdexmMService{

    @Autowired
    private MdexmMMapper mdexmMMapper;


    @Override
    public void regdss(List<DssVO> vo) {
        mdexmMMapper.regdss(vo);
    }

    @Override
    public List<DssVO> getdssList(CriteriaM cri) {
        return mdexmMMapper.getdssList(cri);
    }

    @Override
    public void dssdel(String dss_no) {
        mdexmMMapper.dssdel(dss_no);
    }

    @Override
    public void regmdcn(MdcnVO vo) {
        mdexmMMapper.regmdcn(vo);
    }

    @Override
    public List<MdcnVO> getTherapyList(CriteriaM cri) {
        return mdexmMMapper.getTherapyList(cri);
    }

    @Override
    public List<MdcnVO> getWrhsList(CriteriaM cri) {
        return mdexmMMapper.getWrhsList(cri);
    }

    @Override
    public List<FlctnVO> getflctnList() {
        return mdexmMMapper.getflctnList();
    }

    @Override
    public void delmdcn(FlctnVO vo) {
        mdexmMMapper.delmdcn(vo);
    }

    @Override
    public void updatemdcn(FlctnVO vo) {
        mdexmMMapper.updatemdcn(vo);
    }

    @Override
    public void regflctn(MdcnVO vo) {
        mdexmMMapper.regflctn(vo);
    }

    @Override
    public List<FlctnVO> getflut(CriteriaM cri) {
        return mdexmMMapper.getflctnwr(cri);
    }

    @Override
    public void changeflctn(FlctnVO vo) {
        mdexmMMapper.changeflctn(vo);
    }

    @Override
    public List<StudentVO> getstdInfo(CriteriaM cri) {
        return mdexmMMapper.getstdInfo(cri);
    }
    public List<StudentVO> getursInfo(CriteriaM cri) {
        return mdexmMMapper.getusrInfo(cri);
    }

    @Override
    public int regChart(MdexmMVO vo, List<FlctnVO> list) {
        int result = mdexmMMapper.regChart(vo);
        list.forEach(data ->{
            mdexmMMapper.mdexmFlctnreg(data);
            mdexmMMapper.updateMdcns(data);
        });

        return result;
    }

    @Override
    public List<MdexmMVO> getmdx(StudentVO vo) {
        return mdexmMMapper.getmdx(vo);
    }

    @Override
    public List<FlctnVO> getfll(FlctnVO vo) {
        return mdexmMMapper.getfll(vo);
    }

    @Override
    public List<TotalMVO> weekvi() {
        return mdexmMMapper.weekvi();
    }

    @Override
    public List<TotalMVO> mdcnbest() {
        return mdexmMMapper.mdcnbest();
    }

    @Override
    public List<TotalMVO> totalInfo() {
        return mdexmMMapper.totalInfo();
    }
}
