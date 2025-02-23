public class Product {
    private int pid;
    private String pname;
    private String pdesc;
    private double pprice;
    private int pquantity;

    public Product(int pid, String pname, String pdesc, double pprice, int pquantity) {
        this.pid = pid;
        this.pname = pname;
        this.pdesc = pdesc;
        this.pprice = pprice;
        this.pquantity = pquantity;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public double getPprice() {
        return pprice;
    }

    public void setPprice(double pprice) {
        this.pprice = pprice;
    }

    public int getPquantity() {
        return pquantity;
    }

    public void setPquantity(int pquantity) {
        this.pquantity = pquantity;
    }

    public void displayPdtDetails(){
        System.out.println("PID: "+pid);
        System.out.println("Pname: "+pname);
        System.out.println("Pdesc: "+pdesc);
        System.out.println("Pprice: "+pprice);
        System.out.println("Pquantity: "+pquantity);
    }

    public void decStock(){
        this.pquantity--;
    }

    public void incStock(){
        this.pquantity++;
    }
}