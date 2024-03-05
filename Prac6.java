// Practicum 6 (Use of a Debugger)

// ----------------------------------------------------------
// This program will convert Celsius to Fahrenheit
// ----------------------------------------------------------
import java.util.Scanner;

public class Prac6 {
    public static void main(String[] args) {
      
      // init
      Scanner scanner = new Scanner(System.in);
      
      // program greeting
      System.out.println(
        "\nConverts temperatures in Celsius to Fahrenheit\n");
  
      // prompt for input
      System.out.println("Enter temperature (in Celsius): ");
      int cel_temp = scanner.nextInt();
  
      // display results
      System.out.println(cel_temp + " Celsius = " + 
                         convertToFahrenheit(cel_temp) +
                         " degrees Fahrenheit");
    
    }
  
    public static double convertToFahrenheit(int cel_temp) {
      return (9/5 * cel_temp) + 32;
    }
    
  }