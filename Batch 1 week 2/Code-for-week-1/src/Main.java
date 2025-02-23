import utility.NumberUtils;

public class Main {
    public static void main(String[] args) {
        int number = 12345;
        int length = NumberUtils.getIntegerLength(number);
        System.out.println("The length of the number " + number + " is: " + length);

        // Testing with other numbers
        System.out.println("Length of -9876: " + NumberUtils.getIntegerLength(-9876));
        System.out.println("Length of 0: " + NumberUtils.getIntegerLength(0));
    }
}
