package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape{
    private double length;
    private double width;
    

    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive values.");
        }
        this.length = length;
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

     public double getLength(){
        return length;
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

    public String toString(){
        return "Rectangle \n" + "length: " + length + "\n" + "width: " + width;
    }

}

    
    
