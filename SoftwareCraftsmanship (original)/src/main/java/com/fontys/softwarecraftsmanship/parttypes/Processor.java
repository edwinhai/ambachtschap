/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship.parttypes;

import com.fontys.softwarecraftsmanship.wrapper.Size;
import com.fontys.softwarecraftsmanship.wrapper.Speed;
import com.fontys.softwarecraftsmanship.wrapper.SubType;

/**
 *
 * @author Edwin    
 */
public class Processor extends Part {
    public Speed _speed = new Speed(-1.0);
    

    public Processor(String title, double price, Double speed) {
        super(title, price);
        _speed = new Speed(speed);
    }
    
    
    
}
