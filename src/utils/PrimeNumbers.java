package utils;

import java.util.*;

public abstract class PrimeNumbers {
    // I changed to abstract because I won't instance this class

    public static ArrayList<Integer> linearPrimeNumbers(int number) {
        ArrayList<Integer> num = new ArrayList<>();
        // Here I instaced the ArrayList to create a flexible Array

        if(number <= 1) return null;
        else {
            if(number == 2){
                num.add(2);
                return num;
            }
            if(number > 2) {
                num.add(2);
                num.add(3);
                for(int i = 4; i <= number; i++){
                    if(i % 2 != 0 && i % 3 != 0) num.add(i);
                }
            }
        }
        
        return num;
    }

    public static List<Integer> recursivePrimeNumbers(Set list, int number) {
        if(number <= 1) return null; // Validate to input a number > 1
        else {
            if(number == 2) list.add(2);
            if(number > 2 && number % 2 != 0 && number % 3 != 0) {
                list.add(2);
                list.add(3);
                list.add(number);
            }
            if(number > 2) recursivePrimeNumbers(list, number - 1); // Calling recursive method
        }

        ArrayList<Integer> primeNumbers = new ArrayList<>(list);
        Collections.sort(primeNumbers);
        // Tranforming the Set list to ArrayList for organize

        return primeNumbers;
    }
}