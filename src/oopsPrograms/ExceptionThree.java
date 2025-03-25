package oopsPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Enter first number: ");
                int numberOne = sc.nextInt();
                System.out.println("Enter second number: ");
                int numberTwo = sc.nextInt();
                int result = numberOne / numberTwo;
                System.out.println("Result: " + result);
                break;

            }catch (ArithmeticException ae){
                System.out.println("Exception handled: " + ae);
            }
            catch (InputMismatchException ie){
                System.out.println("Exception handled: " + ie);
            }
            finally {
                System.out.println("Program executed: ");
            }
        }
    }
}
