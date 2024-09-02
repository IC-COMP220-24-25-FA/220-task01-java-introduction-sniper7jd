package edu.ithaca.dragon.shapes;
import java.util.List;
import java.util.ArrayList;

public class Rectangle {
    private double length;
    private double width;
    

    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive values.");
        }
        this.length = length;
        this.width = width;
    }
    

    public double calcArea(){
       return length * width;
    }

    public void doubleSize(){
        this.length *=2;
        this.width *= 2;
    }

    public double longestLineWithin(){
        return Math.sqrt(length * length + width * width);
    }

}

    
    
