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
public class Casing extends Part {
    
    private SubType _subtype = new SubType(null);

    public Casing(String title, double price, String subtype) {
        super(title, price);
        _subtype = new SubType(subtype);
    }
    
    
    
    
}
