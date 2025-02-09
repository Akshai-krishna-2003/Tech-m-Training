package PrimitiveAndReferenceVariable;

public class VariableType {
    public static void main(String[] args) {
        // Primitive variables
        int a = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        int[] b = {1,2,3,4,5};

        System.out.println("Before modification: ");
        System.out.println("a = "+a);
        for (int i=0; i<b.length; i++) {
            System.out.println("b["+i+"] = "+b[i]);
        }

        modifyReferenceVariable(a, b);

        System.out.println("After modification: ");
        System.out.println("a = "+a);
        for (int i=0; i<b.length; i++) {
            System.out.println("b["+i+"] = "+b[i]);
        }
    }

    static void modifyReferenceVariable(int a, int[] b) {
        a = 15; // Trying to change variable
        b[4] = 10; // Changing variable

        System.out.println("Inside modifyReferenceVariable() method: ");
        System.out.println("a = "+a);
        for (int i=0; i<b.length; i++) {
            System.out.println("b["+i+"] = "+b[i]);
        }
    }
}
