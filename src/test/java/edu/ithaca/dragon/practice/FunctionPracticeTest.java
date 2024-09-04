package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.*;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(109, FunctionPractice.calcSalePrice(100, 10, 19));
        assertEquals(170, FunctionPractice.calcSalePrice(200, 20, 10));
        assertEquals(11, FunctionPractice.calcSalePrice(10, 10, 2));
    }

    @Test
    public void isGoodDog(){
        assertTrue(FunctionPractice.isGoodDog(4, 6, true));
        assertFalse(FunctionPractice.isGoodDog(2, 3, true));
        assertFalse(FunctionPractice.isGoodDog(4, 6, false));


    }

    @Test
    public void findFirstLargestTestOne(){
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(10);
        assertEquals(1, FunctionPractice.findFirstLargest(nums));
        nums.add(20);
        assertEquals(1, FunctionPractice.findFirstLargest(nums));
    }

    @Test
    public void findLastLargestTestTwo(){
        List<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(20);
        num.add(10);
        assertEquals(1, FunctionPractice.findLastLargest(num));
        num.add(20);
        assertEquals(3, FunctionPractice.findLastLargest(num));
    }
    
    @Test
    public void findFirstMostOccurencesOfLetterTest(){
        List<String> wordsList = new ArrayList<String>();
        wordsList.add("This");
        wordsList.add("That");
        wordsList.add("Trello");
        wordsList.add("Trick");
        wordsList.add("Recommendation");
        assertEquals("Trello", FunctionPractice.findFirstMostOccurencesOfLetter(wordsList, 'l'));
        assertEquals("That", FunctionPractice.findFirstMostOccurencesOfLetter(wordsList, 't'));
        assertEquals("Recommendation", FunctionPractice.findFirstMostOccurencesOfLetter(wordsList, 'm'));
    }
}
