import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReaderClass {
    static void getInputUsingBufferedReaderClass() throws IOException
    {
        // Enter data using BufferReader
        BufferedReader r = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter the input:");
        // Reading data using readLine
        String s = r.readLine();

        // Printing the read line
        System.out.println("The given input:"+s);
    }
    static void getInputUsingScannerClass()
    {
        // Using Scanner for Getting Input from User
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input string :");
        String s1 = s.nextLine();
        System.out.println("You entered string " + s1);

        System.out.println("Enter the input integer :");
        int a = s.nextInt();
        System.out.println("You entered integer " + a);

        System.out.println("Enter the input float :");
        float b = s.nextFloat();
        System.out.println("You entered float " + b);
    }


}
