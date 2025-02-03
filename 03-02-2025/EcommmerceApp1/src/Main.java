import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    static HashMap<Integer, Customer> hm;
    static int cid = 1;
    static Scanner sc;
    static Product p1;
    static Product p2;
    static Product p3;
    static Product p4;
    static int oid = 0;
    static HashMap<Integer, Order> om;
    static HashMap<Integer, Product> pm;
//    static ArrayList<Product> pdts;

    public static void main(String[] args) {

        // I am hard coding it lol
        p1 = new Product(1,"Coconut oil","This is a hair oil",25,50);
        p2 = new Product(2,"Water Bottle","To store water",10,200);
        p3 = new Product(3,"Food","to eat food",500,5);
        p4 = new Product(4,"Phone","To make calls",2500,2);

        pm = new HashMap<>();

        // Since I hardcoded products I can do this way
        pm.put(1,p1);
        pm.put(2,p2);
        pm.put(3,p3);
        pm.put(4,p4);

        hm = new HashMap<>();
        om = new HashMap<>();


        int val = 0;
        int i = 0;
        sc = new Scanner(System.in);

        while (val != 3){

            System.out.println("Select an option: ");
            System.out.println("1. Go to customer ");
            System.out.println("2. Create customer");
            System.out.println("3. Exit");
            System.out.println("Select an option: ");
            val = sc.nextInt();

            switch (val){
                case 1:
                    goToCustomer();
                    break;
                case 2:
                    createCustomer();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }

    }

    private static void createCustomer(){
        Scanner j = new Scanner(System.in);


        System.out.println("Enter your name: ");
        String name = j.nextLine();
        System.out.println("Enter your address: ");
        String address = j.nextLine();
        System.out.println("Enter your phone number: ");
        String phone = j.nextLine();
        System.out.println("Enter your email: ");
        String email = j.nextLine();

        hm.put(cid, new Customer(cid, name, address, phone, email));

        System.out.println("Account created successfully ... Your customer ID is "+ cid);

        cid++;
    }

    private static void goToCustomer(){
        System.out.println("Enter your customer ID: ");
        int cid = sc.nextInt();

        if (hm.containsKey(cid)){

            int select = 0;

            while (select != 3) {
                System.out.println("Select an option: ");
                System.out.println("1. Make an order");
                System.out.println("2. View your order details");
                System.out.println("3. Exit");
                System.out.println("Select an option: ");
                select = sc.nextInt();

                if (select == 1) {
                    System.out.println("Enter Date: ");
                    String date = sc.next();
                    Customer c = hm.get(cid);
                    ArrayList<Product> a = makeOrder();
                    oid++;

                    om.put(oid, new Order(oid, date, c, a));

                    System.out.println("Your order ID is "+ oid + " placed successfully");
                }

                else if (select == 2) {
                    System.out.println("Enter Order ID: ");
                    int orderid = sc.nextInt();

                    if (om.containsKey(orderid)){
                        System.out.println("Your order details");
                        om.get(orderid).displayOrderDetails();
                    }

                    else {
                        System.out.println("Your order details not found");
                    }
                }

                else if (select == 3) {
                    break;
                }
            }
        }

        else{
            System.out.println("Create a customer account first!");
        }
    }

    private static ArrayList<Product> makeOrder(){
        ArrayList<Product> pdts = new ArrayList<>();

        int ch = 0;
        do {
            System.out.println("Enter the product ID you want to make order: ");
            int i = 1;
            for (Product product : pm.values()) {
                System.out.println(i+". "+product.getPname());
                i++;
            }

            System.out.println("Enter a choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (p1.getPquantity() > 0) {

                        pdts.add(p1);
                        p1.decStock();


                    } else {
                        System.out.println("You have not enough products to make order");
                    }
                    break;

                case 2:
                    if (p2.getPquantity() > 0) {

                        pdts.add(p2);
                        p2.decStock();

                    } else {
                        System.out.println("You have not enough products to make order");
                    }
                    break;

                case 3:
                    if (p3.getPquantity() > 0) {

                        pdts.add(p3);
                        p3.decStock();

                    } else {
                        System.out.println("You have not enough products to make order");
                    }
                    break;

                case 4:
                    if (p4.getPquantity() > 0) {

                        pdts.add(p4);
                        p4.decStock();

                    } else {
                        System.out.println("You have not enough products to make order");
                    }
                    break;

                default:
                    System.out.println("Invalid option");

            }
            System.out.println("Do you want to make order again? (y/n)");
            System.out.println("Select an option: ");
            if (sc.next().equals("y")) {
                ch = 1;
            }
            else {
                ch = 0;
            }
        } while (ch != 0);

        return pdts;

    }


}