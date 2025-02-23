package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        try
        {
            a = sc.nextInt();
            processInput(a);
        }
        catch(InputMismatchException e){
            System.out.println("Enter an integer only!");
        }
    }

    static void processInput(int a){
        double reci;

        try
        {
            reci = (double) 1 / a;
            System.out.println("Reciprocal of "+a+" is "+reci);
        }

        catch(ArithmeticException e){
            System.out.println("Here you go, an Arithmetic exception");
        }


    }
}
