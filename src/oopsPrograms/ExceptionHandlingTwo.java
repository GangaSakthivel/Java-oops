package oopsPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
//        try{
//            int number = sc.nextInt();//block which throws an error
//        }
//        catch (Exception e){//block which shows what kind of error and prints it
//            System.out.println(e);
//        }

//        try{
//        int num = 10 / 0;
//        }
//
//        catch (Exception e){
//            System.out.println(e);
//        }
//        System.out.println("Program Ended. ");

        try{
            int number = sc.nextInt();
            int b = 100/0;
        }
        catch (ArithmeticException ae){
            System.out.println(ae);
        }
        System.out.println("Program ended");

    }
}
