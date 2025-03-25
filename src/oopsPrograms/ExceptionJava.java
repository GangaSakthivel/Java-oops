package oopsPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionJava {
    public static void main(String[] args) {
        //Asks the user to enter two numbers.
        //
        //Divides the first number by the second.
        //
        //Catches any ArithmeticException that occurs if the second number is zero and
        // prints an error message instead of crashing.

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter two numbers: ");
            int numberOne = sc.nextInt();
            int numberTwo = sc.nextInt();

            int result = numberOne / numberTwo; // Division inside try block
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException ae){
            System.out.println("Exception handled: " + ae);
        }
        catch (InputMismatchException ie){
            System.out.println("Exception handles: " + ie);
        }
        finally {
            System.out.println("(Finally block) Always going to execute");
        }

    }
}
