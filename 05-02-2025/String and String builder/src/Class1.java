import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Normal String
        String str1 = "Hello World 1";
        String str2 = "Hello World 2";

        System.out.println(str1);
        System.out.println(str2);

        str1 = "Hello World 3";
        System.out.println(str1);

        // String Buffer --> Modifies same object
        // Thread synchronization is here
        // Thread safe
        StringBuffer sb = new StringBuffer("Hello World 4");
        System.out.println(sb.toString());
        sb.append(" ");
        sb.append(str1);
        System.out.println(sb.toString());
        //

        // String Builder --> Creates new object every modification
        // Thread synchronization not here
        // Thread unsafe
        StringBuilder sb1 = new StringBuilder("This is SString builder");  // This is string builder for 1
        System.out.println(sb1.toString());
        sb1.append(" ");
        sb1.append(str1);
        System.out.println(sb1.toString());
        sb1 = new StringBuilder(sc.next());
        sb1.insert(1, str1);
        System.out.println(sb1.toString());
        sb1.replace(1,3,"ab");
        System.out.println(sb1.toString());


    }
}