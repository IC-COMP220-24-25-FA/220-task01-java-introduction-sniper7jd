package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.Test;

public class TriangleTest {
    
    @Test
    public void calcAreaTest(){
        Triangle t1 = new Triangle(10, 20);
        assertEquals(100, t1.calcArea(), 0.0001);
    }

    @Test
    public void longestLineWithinTest(){
        Triangle t1 = new Triangle(12,5);
        assertEquals(13, t1.longestLineWithin(), 0.001, "The longest line in the right triangle is  hypotenuse.");
    }

    @Test
    public void doubleSizeTest() {
        Triangle t1 = new Triangle(4,10);
        t1.doubleSize();
        assertEquals(80, t1.calcArea(), 0.001, "The area should be doubled.");
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0,10));
    }
    
        

 }
