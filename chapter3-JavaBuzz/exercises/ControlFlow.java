// what imports will you need?
import java.util.Scanner;
// can you remember how to set up your main function?

public class ControlFlow {
public static void main(String[] args){
  // find a way to read in user input
  System.out.println("Enter a number");
  Scanner sc = new Scanner(System.in);
  int number = sc.nextInt();
  // write a method that will check if a number is odd or even
  // (assume user only ever enters integers)
  if (number % 2 == 0){
    System.out.println(number + " is even");
  } else {
    System.out.println(number + " is odd");
  // print the answer to the console
  };
  };
};
