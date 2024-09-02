package edu.ithaca.dragon.shapes;

public class Triangle {
    private double side1;
    private double side2;
    

    public Triangle(double base, double height){
        if (base <= 0 || height <= 0){
            throw new IllegalArgumentException("Numbers should be positive");
        }
        side1 = base;
        side2 = height;
    }
    

    public double calcArea(){
       return 0.5 * side1 * side2;
    }

    public void doubleSize(){
        side1 *=2;
        side2 *= 2;
    }

    public double longestLineWithin(){ // hypotenuse (longest line of right triangle)
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }

}

    
    
