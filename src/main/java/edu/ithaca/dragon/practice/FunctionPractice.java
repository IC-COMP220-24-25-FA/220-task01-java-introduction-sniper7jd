package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if ((first < 0) || (second < 0) || (third < 0)){
            throw new IllegalArgumentException();
        }
        int m = first;
        if (second > m){
            m = second;
        }

        if (third > m){
            m = third;
        }
        return m;
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        return (1 - discountPercent/100) * originalPrice + salesTax;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if((fetchedThePaperToday == true) && (daysSinceShoesChewed > 5) && (yearsOld > 3)){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        int x = -1;
        int index = -1;
        for (int i = 0; i < numbers.size(); i++){
            int y = numbers.get(i);
            if (y > x){
                x = y;
                index = i;
            }
        }
        return index;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> number){
        int x = -1;
        int index = -1;
        for (int i = 0; i < number.size(); i++){
            int y = number.get(i);
            if (y >= x){
                x = y;
                index = i;
            }

        }

        return index;
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    // public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
    //     int count = 0;
        
    //     for(int i = 0 ; i < words.size(); i++){
    //         for(int j = 0; j < i; j++){
    //             char[] array = new char[words.get(j)];
                
    //         }
    //     }
    // }


}
