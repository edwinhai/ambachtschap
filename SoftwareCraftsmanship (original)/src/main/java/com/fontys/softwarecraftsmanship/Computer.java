package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.parttypes.Part;
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
        boolean hasCasing = parts.containsCasing();
        boolean hasProcessor = parts.containsProcessor();
        boolean hasMemory = parts.containsMemory();
        boolean hasMotherboard = parts.containsMotherboard();
        
        return !(!hasCasing || !hasProcessor || !hasMemory || !hasMotherboard);
    }
}
