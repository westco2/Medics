package com.project.medics.clinicW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

<<<<<<< HEAD
public class RentalItemService {
=======
public interface RentalItemService {
    List<RentalVO> getAllItems();
    List<RentalVO> getItemById();
    List<RentalVO> updateItem();

}
>>>>>>> 3483abd (안되면 뒤졌다)

}