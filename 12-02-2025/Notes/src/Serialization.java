import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException {
        try {
            //Creating the object
            Student s1 = new Student(211, "ravi");
            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Student implements Serializable{

    int rno;
    String name;
    public Student(int id, String name) {
        this.rno = id;
        this.name = name;
    }
}
