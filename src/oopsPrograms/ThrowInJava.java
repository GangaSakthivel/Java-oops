package oopsPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowInJava {


    public static void readFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data.txt"));

    }

    public static void main(String[] args) {
//       int age = 10;
//       if(age < 18){
//           throw new ArithmeticException("Not eligible to vote:");
//       }
//        System.out.println("You can vote.");

        try {
            readFile();

        }catch (FileNotFoundException fe){
            System.out.println("file not found");
        }
    }
}
