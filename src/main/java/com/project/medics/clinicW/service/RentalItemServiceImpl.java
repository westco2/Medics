<<<<<<< HEAD
//package com.project.medics.clinicW.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.project.medics.command.RentalVO;
//
//@Service
//public class RentalItemServiceImpl implements RentalItemService {
//
//    private List<RentalVO> itemList = new ArrayList<>();
//
//    @Override
//    public List<RentalVO> getAllItems() {
//        return itemList;
//    }
//
//    @Override
//    public RentalVO getItemById(Long itemId) {
//        for (RentalVO item : itemList) {
//            if (item.getStudentId().equals(itemId)) {
//                return item;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void addItem(RentalVO item) {
//        itemList.add(item);
//    }
//
//    @Override
//    public void updateItem(RentalVO item) {
//        for (RentalVO currentItem : itemList) {
//            if (currentItem.getStudentId().equals(item.getStudentId())) {
//                itemList.remove(currentItem);
//                itemList.add(item);
//                return;
//            }
//        }
//    }
//
//    @Override
//    public void deleteItem(Long itemId) {
//        itemList.removeIf(item -> item.getStudentId().equals(itemId));
//    }
//}
=======
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
>>>>>>> 3483abd (안되면 뒤졌다)
