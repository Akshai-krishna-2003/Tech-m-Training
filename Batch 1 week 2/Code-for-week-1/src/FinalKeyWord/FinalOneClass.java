package FinalKeyWord;

public class FinalOneClass {

    public static void main(String[] args) {
        FinalTwoClass ft = new FinalTwoClass();
        System.out.println(ft.a);
//        ft.c = 18;  --> Not possible
        System.out.println(ft.geta());
        ft.finalMethod();
    }
}

// a class that cannot be inherited by other classes
final class FinalTwoClass {
    int a = 5;
    final int c = 15; // Cannot be changed

    //    c = 7;   // --> Not possible
    int geta(){
        return a;
    }

    // A method that cannot be overridden
    final void finalMethod(){
        System.out.println("This method cannot be overridden ");
    }
}

// class FinalThreeClass extends FinalKeyWord.FinalTwoClass {
//     // This wont work
// }

