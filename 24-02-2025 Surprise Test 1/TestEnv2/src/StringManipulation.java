class StringManipulation {

    public static boolean isPalindrome(String str){
        boolean palindrome = false;
        str = str.toLowerCase();

        String nstr = "";

        for (char ch : str.toCharArray()){

            if (Character.isLetter(ch)){
                nstr = nstr + ch;
            }
        }


        String rev = "";
        for (int i = nstr.length() - 1; i >= 0; i--) {
            rev = rev + nstr.charAt(i);
        }

        return nstr.equalsIgnoreCase(rev);

    }

    public static String sortWords(String input){

        if (input == null){
            return input;
        }

        String[] words = input.split(" ");

        int n = words.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }


        String output = "";

        for (int i=0; i<words.length; i++){
            if (i ==  words.length-1)
                output = output + words[i];
            else
                output = output + words[i] + " ";
        }

        return output;
    }


}
