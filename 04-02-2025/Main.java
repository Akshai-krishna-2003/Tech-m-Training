
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student(1, "Naveen","naveen@gmail.com");
        Student s3 = new Student(2, "Kevin","kevin@gmail.com");
        Student s4 = new Student(3, "Sarah","sarah@gmail.com");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println("Enter student id:");
        int id = sc.nextInt();
        System.out.println("Enter student name: ");
        String name = sc.next();
        System.out.println("Enter student email: ");
        String email = sc.next();

        students.add(new Student(id, name, email));


    }for (Student student : students) {
        student.displayDetails();
    }
}

class Student {
    int rollno;
    String name;
    String email;

    Student(){
        rollno = 100;
        name = "John";
        email = "john@gmail.com";
    }

    Student(int rollno, String name, String email) {
        this.rollno = rollno;
        this.name = name;
        this.email = email;
    }

    void displayDetails(){
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println(" ");
    }
}