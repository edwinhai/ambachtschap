package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.parttypes.Casing;
import com.fontys.softwarecraftsmanship.parttypes.Memory;
import com.fontys.softwarecraftsmanship.parttypes.Motherboard;
import com.fontys.softwarecraftsmanship.parttypes.Part;
import com.fontys.softwarecraftsmanship.parttypes.Processor;
import com.fontys.softwarecraftsmanship.wrapper.PartsCollection;
import java.util.*;

public class Computer {
    
    PartsCollection parts = new PartsCollection();
    
    public int NumberOfParts() {
        int count = 0;
        for (Part part : parts.parts) { 
            count++;
        }
        return count;
    }
    
    public void AddPart(Part part) {
        List<Part> usedParts = parts.parts;
        if(part != null){
            usedParts.add(part);
        }
    }
    
    public double GetPrice() {
        double price = 0.0;
        List<Part> usedParts = parts.parts;
        for (int integer = 0; integer < NumberOfParts(); integer++) {
            Part part = usedParts.get(integer);
            price += part.GetPrice();
        }
        
        return price;
    }
    
    public boolean IsComplete() {
        boolean hasCasing = false;
        boolean hasProcessor = false;
        boolean hasMemory = false;
        boolean hasMotherboard = false;
        
        for (Part part : parts.parts) {
            if(part instanceof Casing) {
                hasCasing = true;
                continue;
            }
            if(part instanceof Processor) {
                hasProcessor = true;
                continue;
            }
            if(part instanceof Memory) {
                hasMemory = true;
                continue;
            }
            if(part instanceof Motherboard) {
                hasMotherboard = true;
            }

        }
        
        return !(!hasCasing || !hasProcessor || !hasMemory || !hasMotherboard);
    }
    
    private void validateComputer() {
        
    }
}
