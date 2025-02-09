package StringHandler;

public class StringProcessor {


    public String reverseString(String string) {
        String reversedString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }

        return reversedString;
    }

    public int countOccurrences(String str, String substring) {
        if (str == null || substring == null || substring.isEmpty()) {
            return 0;  // Return 0 if input string or substring is invalid
        }

        int count = 0;
        int index = 0;

        // Search for the substring in the main string
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();  // Move the index forward to continue searching
        }

        return count;
    }

    // Method to split a string by spaces and capitalize each word
    public static String splitAndCapitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;  // Return the original string if it's null or empty
        }

        String[] words = str.split("\\s+");  // Split by one or more spaces
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize the first letter and append the rest of the word
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        // Trim the trailing space and return the result
        return result.toString().trim();
    }
}