import java.util.ArrayList;


public class  Order{
    private int orderid;
    private String orderdate;
    private Customer customer;
    private ArrayList<Product> products;

    public Order(int orderid, String orderdate, Customer customer, ArrayList<Product> products) {
        this.orderid = orderid;
        this.orderdate = orderdate;
        this.customer = customer;
        this.products = products;
    }

    public void displayOrderDetails(){
        System.out.println("Order ID: "+orderid);
        System.out.println("Details of Customer: ");
        Customer.displayCustomer();
        System.out.println("\n");
        System.out.println("No Of Products: "+products.size());
        System.out.println("Total Price to be paid: "+totalPrice(products));
        System.out.println("Product details:");
        int i = 1;
        for(Product product : products){
            System.out.println("Product number: "+i);
            product.displayPdtDetails();
            System.out.println("\n");
            i++;
        }


    }

    public double totalPrice(ArrayList<Product> products){
        double total = 0;
        for(Product product : products){
            total += product.getPprice();
        }

        return total;
    }


}