package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.parttypes.Casing;
import com.fontys.softwarecraftsmanship.parttypes.Memory;
import com.fontys.softwarecraftsmanship.parttypes.Motherboard;
import com.fontys.softwarecraftsmanship.parttypes.Part;
import com.fontys.softwarecraftsmanship.parttypes.Processor;
import com.fontys.softwarecraftsmanship.wrapper.PartsCollection;
import java.util.*;
import java.util.stream.Stream;

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
        List<Part> currentParts = parts.parts;

        return (getNumberOfParts(currentParts,"Casing") > 0
                && getNumberOfParts(currentParts,"Processor") > 0
                && getNumberOfParts(currentParts,"Memory") > 0 
                && getNumberOfParts(currentParts,"Motherboard") > 0);
    }
    
    public long getNumberOfParts(List<Part> parts, String type) {
        Stream<Part> partStream = parts.stream();
        Stream<Part> newStream = null;
        switch(type) {
            case "Casing":
                newStream = partStream.filter(x -> x instanceof Casing);
                break;
            case "Processor":
                newStream = partStream.filter(x -> x instanceof Processor);
                break;
            case "Memory":
                newStream = partStream.filter(x -> x instanceof Memory);
                break;
            case "Motherboard":
                newStream = partStream.filter(x -> x instanceof Motherboard);
                break;
        }
        return newStream.count();
    }

}
