package oopsPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        try{
            c = a / b;
        }catch (InputMismatchException ie){
            System.out.println(ie);
        }
        catch (ArithmeticException ae){
            System.out.println(ae);
        }
        System.out.println(c);
    }
}
