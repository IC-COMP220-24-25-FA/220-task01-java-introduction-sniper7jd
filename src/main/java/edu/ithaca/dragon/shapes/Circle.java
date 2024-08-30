package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
    if (radius <= 0){
        throw new IllegalArgumentException("Radius must be positive");
    }
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return this.radius * this.radius * Math.PI;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius *= 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return this.radius * 2;
    }

    public double getRadius() {
        return this.radius;
    }
}
