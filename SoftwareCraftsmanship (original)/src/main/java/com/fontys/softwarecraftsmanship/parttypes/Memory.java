/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship.parttypes;

import com.fontys.softwarecraftsmanship.wrapper.Size;
import com.fontys.softwarecraftsmanship.wrapper.SubType;

/**
 *
 * @author Edwin    
 */
public class Memory extends Part {
    
    private SubType _subtype = new SubType(null);
    private Size _size = new Size(-1);

    public Memory(String title, double price, String subtype, int size) {
        super(title, price);
        _subtype = new SubType(subtype);
        _size = new Size(size);
    }
    
    
    
}
