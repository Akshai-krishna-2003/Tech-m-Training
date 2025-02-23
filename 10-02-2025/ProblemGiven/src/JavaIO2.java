public class JavaIO2 {
    public static void main(String[] args) {
        printStmt("Akshai Krishna");
        printStmt("Krishna Akshai");
        printlnStmt("\nHola Sire");
        printlnStmt("A doctor a day keeps BP away");
        printlnStmt("Welcome to Java IO");
        JavaIO2 j = new JavaIO2();
        j.errorStatement("Ola");
        j.errorStatement("Ola 2.0");
    }

    static void printStmt(String s){
        System.out.print(s);
    }

    static void printlnStmt(String s){
        System.out.println(s);
    }

    void errorStatement(String s){
        System.err.println(s);
    }
}
