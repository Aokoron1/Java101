// Practicum 7 (Use of a Debugger)

// ----------------------------------------------------------
// This program will convert Fahrenheit to Celsius
// ----------------------------------------------------------
import java.util.Scanner;

public class Prac7 {
    public static void main(String[] args) {
      
      // init
      Scanner scanner = new Scanner(System.in);
      
      // program greeting
      System.out.println(
        "\nConverts temperatures in Fahrenheit to Celsius\n");
  
      // prompt for input
      System.out.println("Enter temperature (in Fahrenheit): ");
      double fah_temp = scanner.nextDouble();
  
      // display results
      System.out.println(fah_temp + " Fahrenheit = " + 
                        (double) convertToCelsius(fah_temp) +
                         " degrees Celsius");
    
    }
  
    public static double convertToCelsius(double fah_temp) {
      return (fah_temp - 32) * 5/9;
    }
    
  }