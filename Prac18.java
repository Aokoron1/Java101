// Code for Practicum 18 (The Scanner Class)
// (TO COMPLETE)
import java.util.Scanner;

class Prac18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your age: ");
    int age = input.nextInt();
    
    System.out.print("Enter your first name: ");
    String first_name = input.next();
    System.out.print("Enter your last name: ");
    String last_name = input.next();

    System.out.println("Age = " + age);
    System.out.println("Name = " + first_name + " " +
                       last_name);
    
  }
}

