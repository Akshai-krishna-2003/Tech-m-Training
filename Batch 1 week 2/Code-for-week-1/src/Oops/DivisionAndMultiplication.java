package Oops;

import java.util.Scanner;

public class DivisionAndMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to multiply: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        // multiplication using +
        for (int i = 1; i <= a; i++) {
            result += b;
        }

        System.out.println("Multiplication result: "+result);

        System.out.println("Enter the number of elements you want to divide: ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int div = 0;
        int rem = c;

        while (rem > 0 && rem >= d) {
            div++;
            rem -= d;
        }

        System.out.println("Division result: "+div);
        System.out.println("Remainder result: "+rem);
    }
}

