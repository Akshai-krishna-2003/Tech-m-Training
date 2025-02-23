package utility;

public final class NumberUtils {

    // Private constructor to prevent instantiation
    private NumberUtils() {
        throw new UnsupportedOperationException("Utility class");
    }

    // Static method to find the length of an integer
    public static int getIntegerLength(int number) {
        // Handle negative numbers
        number = Math.abs(number);

        // Calculate the length of the number
        if (number == 0) {
            return 1;  // Length of 0 is 1 digit
        }

        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }

        return length;
    }
}
