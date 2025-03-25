package oopsPrograms;


//Exceptions handling
public class ErrorHandling {
    //ArithmeticException
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        //System.out.println(a / b);


        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 30;
        numbers[2] = 90;
        numbers[3] = 110;
        numbers[4] = 100;
        //System.out.println(numbers[5]);


        // Null Pointer Exception (NullPointerException)
        //Occurs when you try to access an object reference that is null.

        String str = null;
       // System.out.println(str.length());

        String strTwo = "Ganga";
        //System.out.println(strTwo.charAt(6));

        String s = "abe"; // "its should be 123 (numbers)
        int num = Integer.parseInt(s); // Runtime error
        System.out.println(num);
    }

}
