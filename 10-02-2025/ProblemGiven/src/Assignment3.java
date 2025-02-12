import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        ArrayList<Object> ob1 =  useScanner(s);

        System.out.println("For useScanner(): ");
        for (Object o : ob1) {
            System.out.println(o);
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Object> ob2 =  useBuffer(br);

        System.out.println("For useBuffer(): ");
        for (Object o : ob2) {
            System.out.println(o);
        }
    }

    static ArrayList<Object> useScanner(Scanner s) {

        ArrayList<Object> e = new ArrayList<>();
        System.out.println("Enter a name: ");
        String name = s.nextLine();
        e.add(name);

        System.out.println("Enter age: ");
        int age = s.nextInt();
        e.add(age);

        System.out.println("Enter marks: ");
        float marks = s.nextFloat();
        e.add(marks);

        return e;
    }

    static ArrayList<Object> useBuffer(BufferedReader bs) throws IOException {

        ArrayList<Object> e = new ArrayList<>();
        System.out.println("Enter a song name: ");
        String sname = bs.readLine();
        e.add(sname);

        System.out.println("Enter age: ");
        int x = Integer.parseInt(String.valueOf(bs.readLine()));
        e.add(x);

        return e;
    }
}
