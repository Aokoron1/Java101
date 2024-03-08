// Practicum 14 (The Enhanced for Loop in Java)
// (TO COMPLETE)

// This program will add up all the integers in a given array.

import java.util.Scanner;

public class Prac14 {

    public static void main(String[] args) {

        // array declaration
        // declares an array of size 6 initialized
        // with the provided values
        int[] nums = {5, 24, 36, 54, 65, 72};
     
        // provide an enhanced for loop that adds up all
        // values in array nums with the result in variable sum
        int sum = 0;

        // enhanced for loop (complete)
        for (int num : nums) {
            sum += num;
        }

        // display results
        System.out.println("Sum = " + sum);

    }
}