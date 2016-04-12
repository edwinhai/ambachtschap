package com.fontys.softwarecraftsmanship.parttypes;

import com.fontys.softwarecraftsmanship.wrapper.Price;
import com.fontys.softwarecraftsmanship.wrapper.Title;

public class Part {
    
    private final Title _title; //title part
    private final Price _price; // price part
    
    public Part(String title, double price) {
        _title = new Title(title);
        _price = new Price(price);
    }
    
    public String GetType() {
        return "Part";
    }
    
    public double GetPrice() {
        return _price.price;
    }
}
