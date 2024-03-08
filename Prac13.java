// Practicum 13 (while and for loops)
// (TO COMPLETE)


import java.util.Scanner;

public class Prac13 {

    public static void main(String[] args) {

        // var declarations
        int n, sum1, sum2;
     
        Scanner input = new Scanner(System.in);

        // prompt user for value of n to sum up to
        System.out.print("Enter a value of n to sum up to: ");
        n = input.nextInt();
        // if then enter 5, should add up 1 to 5 (equal to 15)
       

        // use a for loop to sum up the values and assign to sum1
        
         for (int i = 1; i <= n; i++) {
            sum1 += i;
        }


        // use a while loop to sum up the values and assign to sum2
        int j = 1;
        while (j <= n) {
            sum2 += j;
            j++;
        }

        // display results
        System.out.println(
          "Sum of 1.." + n + " by use of for loop is " + sum1);

        System.out.println(
          "Sum of 1.." + n + " by use of while loop is " + sum2);

          input.close();
    }

}