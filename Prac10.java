// Practicum  (Even or Odd Program)
// (TO COMPLETE)
import java.util.Scanner;

public class Prac10 {
    public static void main(String[] args) {

        
        
        Scanner input = new Scanner(System.in);
// This program will prompt the user for an integer value
        System.out.print("Enter integer value: ");
        int n = input.nextInt();
// and display whether it is even or odd.
        
// REQUIRED OUTPUT:
// The program MUST display the results exactly as shown below:
// <n> is odd
// <n> is even
// --------------------------------------------------------------
        boolean odd;

            odd = (n % 2 != 0);
    
           

// (TO COMPLETE)
     




// (MUST KEEP THESE LINES)
if(odd)
  System.out.println(n + " is odd");
else
  System.out.println(n + " is even");
    }
}