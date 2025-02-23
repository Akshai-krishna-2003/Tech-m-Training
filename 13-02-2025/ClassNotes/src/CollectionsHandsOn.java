import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Stack;

public class CollectionsHandsOn {
    public static void main(String[] args) {
        ArrayListDemo.Output();
        LinkedListDemo.Output();
        VectorDemo.Output();
        StackDemo.Output();
        StackExternallyDemo.Output();
    }
}

class ArrayListDemo {
    public static void Output() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(35);
        list1.add(23);
        list1.add(67);
        System.out.println("Number of elements in the list: "+list1.size());
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
        list1.remove(2);
//        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+list1);
    }
}
class LinkedListDemo {
    public static void Output() {
        List<Integer> list1 = new LinkedList<>();
        list1.add(35);
        list1.add(23);
        list1.add(67);
        System.out.println("Number of elements in the list: "+list1.size());
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
        list1.remove(2);
//        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+list1);
    }
}

class VectorDemo {
    public static void Output() {
        List<Integer> list1 = new Vector<>();
        list1.add(35);
        list1.add(23);
        list1.add(67);
        System.out.println("Number of elements in the list: "+list1.size());
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
        list1.remove(2);
//        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+list1);
    }
}

class StackDemo{
    public static void Output() {
        List<Integer> list1 = new Stack<>();
        list1.add(35);
        list1.add(23);
        list1.add(67);
        System.out.println("Number of elements in the list: "+list1.size());
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
        list1.remove(2);
//        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+list1);
    }
}

class StackExternallyDemo {
    public static void Output() {
        Stack<Integer> stack = new Stack<>();
        stack.push(35);
        stack.push(23);
        stack.push(67);
        System.out.println("Number of elements in the list: "+stack.size());
        stack.push(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+stack);
        System.out.println("The number of elements in the list: "+stack.size());
        stack.pop();
        stack.pop();
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+stack);
    }
}