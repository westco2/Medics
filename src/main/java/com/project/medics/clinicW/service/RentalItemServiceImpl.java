
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
    
    @Override
    public void saveRentalApp(RentalVO rental) {
        rentalJYMapper.insertRentalApp(rental);
        rentalJYMapper.insertRentalApp2(rental);
        rentalJYMapper.decreaseQuantity(rental);
    }

	@Override
	public void insertRentalApp(RentalVO rental) {
		rentalJYMapper.insertRentalApp(rental); // RentalVO 객체를 DB에 저장하는 메소드 호출
	    // 해당 수량 감소 메소드 호출
	    rentalJYMapper.decreaseQuantity(rental);
	}
	
	@Override
    public void sarental(RentalVO rental) {
        rentalJYMapper.appolist(rental);
    }
	
	@Override
    public void sarebds(RentalVO rental) {
        rentalJYMapper.apprabs(rental);
    }

	@Override
	public void appolist(RentalVO rental) {
		rentalJYMapper.appolist(rental);
		rentalJYMapper.listapp(rental);
	}

	@Override
	public void listapp(RentalVO rental) {
		rentalJYMapper.listapp(rental);
		
	}
		
	public void listplusapp (RentalVO rental) {
		rentalJYMapper.listplusapp(rental);
	}
    


}

