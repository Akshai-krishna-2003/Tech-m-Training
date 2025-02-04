
public class Customer {

    private static int cid;
    private static String name;
    private static String address;
    private static String phone;
    private static String email;

    public Customer(int cid, String name, String address, String phone, String email) {
        this.cid = cid;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public static void displayCustomer(){
        System.out.println("Customer ID: "+cid);
        System.out.println("Name of customer: "+name);
        System.out.println("Address residing: "+address);
        System.out.println("Phone number: "+phone);
        System.out.println("Email address: "+email);
    }
}

