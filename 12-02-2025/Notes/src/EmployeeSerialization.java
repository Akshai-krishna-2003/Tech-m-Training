import java.io.*;

// Employee class implementing Serializable
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int Eno;
    private String Ename;
    private transient String email; // Marking email as transient (excluded from serialization)

    // Constructor
    public Employee(int Eno, String Ename, String email) {
        this.Eno = Eno;
        this.Ename = Ename;
        this.email = email;
    }

    // Display method
    public void display() {
        System.out.println("Employee Number: " + Eno);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Email (not serialized): " + email); // This will be null after deserialization
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Alice Johnson", "alice@example.com");

        // File to store serialized object
        String filename = "employee.ser";

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(emp);
            System.out.println("Employee object serialized successfully!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Employee deserializedEmp = (Employee) in.readObject();
            System.out.println("Deserialized Employee Object:");
            deserializedEmp.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
