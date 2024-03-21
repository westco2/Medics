
package com.project.medics.clinicW.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.medics.command.RentalVO;

@Service(value="rentalService")
public class RentalItemServiceImpl implements RentalItemService {

	@Autowired
	private RentalJYMapper rentalJYMapper; 
    
    @Override
    public List<RentalVO> getAllItems() {
        return rentalJYMapper.rentallist();
    }
    
    @Override
    public List<RentalVO> getItemById() {
    	return rentalJYMapper.rentalapp();
    }

    @Override
    public List<RentalVO> updateItem() {
        return rentalJYMapper.appovalc();
    }



}

