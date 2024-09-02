package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.Test;

public class TriangleTest {
    
    @Test
    public void calcAreaTest(){
        Triangle t1 = new Triangle(10, 20);
        assertEquals(200.0, rect.calcArea(), 0.0001);
    }

    @Test
    public void longestLineWithinTest(){
        Rectangle rect = new Rectangle(12,5);
        assertEquals(13, rect.longestLineWithin(), 0.001, "The longest line within the rect should be diagonal.");
    }

    @Test
    public void doubleSizeTest() {
        Rectangle rect = new Rectangle(4,10);
        rect.doubleSize();
        assertEquals(160, rect.calcArea(), 0.001, "The radius should be doubled.");
    }
        

 }
