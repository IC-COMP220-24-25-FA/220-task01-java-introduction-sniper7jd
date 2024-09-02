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
            int width = random.nextInt(6);
            if (width==0){          
                width++;
              }
            int length = random.nextInt(6);
            if (length==0){          
                length++;
              }
            rectangles.add(new Rectangle(width, length));
            System.out.println("Rectangle " + (i+1));
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
            System.out.println("Area: "+ rectangles.get(i).calcArea());
            System.out.println("Diagonal: "+ rectangles.get(i).longestLineWithin());
            System.out.println();
        }
        
    
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 time
        for (int i = 0; i < 5; i++) {
            System.out.println("Choose from 1 to 5");
            int index = scanner.nextInt();
            if (index > 0 && index <= 5) {
                Rectangle chosenRectangle = rectangles.get(index - 1);
                chosenRectangle.doubleSize();
                System.out.println("Size of rectangle" + index + " has been doubled.");
            } else {
                System.out.println("Wrong Index");
            }

            System.out.println();

            for (int j = 0; j < 5; j++){
                System.out.println("Rectangle " + (j+1));
                System.out.println("Length: " + rectangles.get(j).getLength());
                System.out.println("Width: " + rectangles.get(j).getWidth());
                System.out.println("Area: "+ rectangles.get(j).calcArea());
                System.out.println("Diagonal: "+ rectangles.get(j).longestLineWithin());
                System.out.println();
            }
        }

        

        scanner.close();
    }
}
