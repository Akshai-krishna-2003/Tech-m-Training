class StringManipulation {

    public static boolean isPalindrome(String str){
        boolean palindrome = false;

        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                palindrome = false;
                break;
            }
            else{
                palindrome = true;
            }
        }

        return palindrome;
    }

}
