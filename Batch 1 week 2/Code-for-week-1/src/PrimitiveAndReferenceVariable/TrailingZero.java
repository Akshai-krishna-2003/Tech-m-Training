package PrimitiveAndReferenceVariable;

import java.util.Scanner;

// This program wont work after 20 factorial
public class TrailingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        System.out.println("Factorial is "+factorial(a));
        System.out.println("Trialing zeros in "+a+"! is "+ trailingZero(factorial(a)));

    }

    static long factorial(int a){
        long res = 1;

        if (a == 0) return 1;
        else if (a == 1) return a;

        else{
            for (int i=2; i<=a; i++) {
                res = res*i;
            }
        }

        return res;
    }

    static int trailingZero(long a){
        int tZero = 0;
        long val = a;

        while (val > 0) {
            long singleElement = val % 10;
            if (singleElement == 0) tZero++;
            else return tZero;
            val = (long) val/10;
        }

        return tZero;
    }
}
