import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int[] a = {1,22,3,45,5};
        ArrayList<Integer> list = new ArrayList<>();

        for (int j : a) {
            list.add(j);
        }

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}