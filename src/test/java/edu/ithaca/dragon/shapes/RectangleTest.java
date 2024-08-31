package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    
    @Test
    public void calcAreaTest(){
        Rectangle rect = new Rectangle(10, 20);
        assertEquals(200.0, rect.calcArea(), 0.0001);
    }

    @Test
    public void longestLineWithinTest(){
        Rectangle rect = new Rectangle(12,5);
        assertEquals(13, rect.longestLineWithin(), 0.001, "The longest line within the rect should be diagonal.");
    }

    // @Test
    // public void doubleSizeTest() {
    //     Circle myCircle = new Circle(4);
    //     myCircle.doubleSize();
    //     assertEquals(8.0, myCircle.getRadius(), 0.001, "The radius should be doubled.");
    // }
        
        // myCircle = new Circle(5.5);
        // assertEquals(95.0331, myCircle.calcArea(), 0.0001);

        // myCircle = new Circle(0.001);
        // assertEquals(0.00000314159, myCircle.calcArea(), 0.0000000001);
    

//     @Test
//     public void longestLineWithinTest(){
//         Circle myCircle = new Circle(3);
//         assertEquals(6, myCircle.longestLineWithin(), 0.001, "The longest line within the circle should be twice the radius.");
//     }

//     @Test
//     public void doubleSizeTest() {
//         Circle myCircle = new Circle(4);
//         myCircle.doubleSize();
//         assertEquals(8.0, myCircle.getRadius(), 0.001, "The radius should be doubled.");
//     }

//     @Test
//     public void TestConstructorError(){
//         assertThrows(IllegalArgumentException.class, () -> new Circle(0));
//     }


 }
