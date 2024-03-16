package com.project.medics.command;

import java.time.LocalDateTime;

public class RentalcVO {
    
    private String itemName1;
    private String selectedItemCode1;
    private String customerName1;
    private int quantity1;
    private LocalDateTime rentalDateTime1;
    private String phoneNumber1;

  
    private LocalDateTime searchDateTime2;
    private String itemName2;
    private String itemDescription2;
    private int itemQuantity2;
    private String customerName2;
    private LocalDateTime rentalDateTime2;
    private LocalDateTime returnDateTime2;
    private String rentalStatus2;

   
    private String itemName3;
    private String itemDescription3;
    private int itemQuantity3;

    public String getItemName1() {
        return itemName1;
    }

    public void setItemName1(String itemName1) {
        this.itemName1 = itemName1;
    }

}
