package com.project.medics.clinicW.service;

import com.project.medics.command.RentalVO;

import java.util.List;

public interface RentalItemService {
    List<RentalVO> getAllItems();
    RentalVO getItemById(Long itemId);
    void addItem(RentalVO item);
    void updateItem(RentalVO item);
    void deleteItem(Long itemId);
}

