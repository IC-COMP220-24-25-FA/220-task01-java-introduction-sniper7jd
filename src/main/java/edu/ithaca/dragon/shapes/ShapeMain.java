package edu.ithaca.dragon.shapes;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        List<Rectangle> rectangles = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int width = random.nextInt(31);
            int height = random.nextInt(31);
            rectangles.add(new Rectangle(width, height));
            System.out.println(rectangles.get(i).calcArea());
            System.out.println(rectangles.get(i).longestLineWithin());
        }
        
    
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 time
        for (int i = 0; i < 5; i++) {
            System.out.println(rectangles.get(i));

            System.out.println("Choose from 0 to 4");
            int index = scanner.nextInt();
            if (index >= 0 && index < rectangles.size()) {
                Rectangle chosenRectangle = rectangles.get(index);
                chosenRectangle.doubleSize();
                System.out.println("Size of rectangle at index " + index + " has been doubled.");
            } else {
                System.out.println("Wrong Index");
            }

            System.out.println(rectangles);
        }

        scanner.close();
    }
}
