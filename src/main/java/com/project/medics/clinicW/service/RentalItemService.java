package com.project.medics.clinicW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.medics.command.RentalVO;

import java.util.List;


public interface RentalItemService {
    List<RentalVO> getAllItems();
    List<RentalVO> getItemById();
    List<RentalVO> updateItem();
	void insertRentalApp(RentalVO rental);
	void saveRentalApp(RentalVO rental);
	void appolist(RentalVO rental);
	void sarental(RentalVO rental);
	void listapp(RentalVO rental);
	void sarebds(RentalVO rental);
}
