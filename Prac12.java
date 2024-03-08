// Practicum 12 (Yes/No Program)
// (TO WRITE)

// This program should prompt the user to enter "yes" or
// "no" and output their response. The user should be allowed to
// enter their response with either upper or lower case characters
// (e.g., "yes", "Yes", "YES").

// REQUIRED OUTPUT:
// The program MUST display the results exactly as shown below:
// "User entered yes"
// "User entered no"
//
// (TO COMPLETE)

import java.util.Scanner;

public class Prac12 {
    public static void main(String[] args) {
        
      System.out.println("Hello World");
      System.out.println("Enter 'yes' or 'no': ");
      Scanner input = new Scanner(System.in);

      String userInput = input.next().toLowerCase();

      if (userInput.equals("yes")) {
        System.out.println("User entered yes");
    } else if (userInput.equals("no")) {
        System.out.println("User entered no");
    } else {
        System.out.println("Try again.");
    }

    input.close();


    }

}