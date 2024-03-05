// Practicum 11 (Largest of Three Program)
// (TO COMPLETE)

import java.util.Scanner;

import java.util.Scanner;

public class Prac11 {

    public static void main(String[] args) {

        // var declarations
        double num1, num2, num3, largest;

        // prompt user for three numbers
       Scanner input = new Scanner(System.in);
       System.out.println("Enter 3 numbers: ");

       num1 = input.nextDouble();
       num2 = input.nextDouble();
       num3 = input.nextDouble();


        // determine largest and assign to variable largest

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        

        // display results
        System.out.println("The largest of " + num1 + ", " + num2 +
                           ", " + num3 + " is " + largest);
    }
}