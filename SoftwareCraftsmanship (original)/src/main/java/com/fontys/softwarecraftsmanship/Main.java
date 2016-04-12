package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.parttypes.Casing;
import com.fontys.softwarecraftsmanship.parttypes.Memory;
import com.fontys.softwarecraftsmanship.parttypes.Motherboard;
import com.fontys.softwarecraftsmanship.parttypes.Part;
import com.fontys.softwarecraftsmanship.parttypes.Processor;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        
        PrintStream stream = System.out;
        Computer c = new Computer();
        c.AddPart(new Casing("Cooler Master Centurion 6",49.50,"Midi tower"));
        c.AddPart(new Processor("Intel i7-4790",295.0, 3.6));
        c.AddPart(new Memory("G.SKILL Ripjaws X Series",99.99,"DDR3", 16));
        c.AddPart(new Motherboard("MSI H97 PC MATE - Socket 1150 - ATX", 89.0));      
        
        if (c.IsComplete()) {
            String string = "Total price is EUR " + c.GetPrice();
            stream.println(string);
            return;
        }
        stream.println("Your computer is not ready yet...");
    }
}
