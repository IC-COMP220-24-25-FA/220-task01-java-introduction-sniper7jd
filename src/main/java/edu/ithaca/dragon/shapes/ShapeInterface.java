package edu.ithaca.dragon.shapes;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class ShapeInterface {
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        Random random = new Random();
        // List<Rectangle> rectangles = new ArrayList<>();
        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int shape = random.nextInt(3);  // 0 = Circle, 1 = Rectangle, 2 = Triangle

            if (shape == 0) {
                shapes.add(new Circle(random.nextInt(10) + 1));
            } else if (shape == 1) {
                shapes.add(new Rectangle(random.nextInt(10) + 1, random.nextInt(10) + 1));
            } else if (shape == 2) {
                shapes.add(new Triangle(random.nextInt(10) + 1, random.nextInt(10) + 1));
            }
        }

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println();
        }
        
        System.out.println("Doubling size of shapes:");
        for (Shape shape : shapes) {
            shape.doubleSize();
            System.out.println(shape.toString());
            System.out.println();
        }
    
        
        
    }
}
