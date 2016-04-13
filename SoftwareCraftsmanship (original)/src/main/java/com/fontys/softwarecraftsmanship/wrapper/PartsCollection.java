/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship.wrapper;

import com.fontys.softwarecraftsmanship.parttypes.Casing;
import com.fontys.softwarecraftsmanship.parttypes.Memory;
import com.fontys.softwarecraftsmanship.parttypes.Motherboard;
import com.fontys.softwarecraftsmanship.parttypes.Part;
import com.fontys.softwarecraftsmanship.parttypes.Processor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edwin
 */
public class PartsCollection {
    public List<Part> parts = new ArrayList<>();

    public PartsCollection() {
    }
    
    public boolean containsCasing() {
        for (Part part : parts) {
            if (part instanceof Casing) return true;            
        }
        
        return false;
    }
    
    public boolean containsProcessor() {
        for (Part part : parts) {
            if (part instanceof Processor) return true;            
        }
        
        return false;
    }
    
    public boolean containsMemory() {
        for (Part part : parts) {
            if (part instanceof Memory) return true;            
        }
        
        return false;
    }
    
    public boolean containsMotherboard() {
        for (Part part : parts) {
            if (part instanceof Motherboard) return true;            
        }
        
        return false;
    }
}
