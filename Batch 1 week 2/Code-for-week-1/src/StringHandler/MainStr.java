package StringHandler;

public class MainStr {
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();

        System.out.println(sp.reverseString("Hello World"));
        System.out.println(sp.countOccurrences("abcabcdabcdecbda","abc"));
        System.out.println(sp.splitAndCapitalize("akshai krishna a"));

    }
}
