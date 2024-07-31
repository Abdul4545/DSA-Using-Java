package Strings;

public class PalindromsInString {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length()-1;

        while (start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    } 


    public static void main(String[] args) {
        System.out.println(isPalindrome("abbca"));


        String str = "avcva";
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            for(int j = i+1; j < str.length() + 1; j++) {
                if(isPalindrome(str.substring(i, j)) == true) {
                    System.out.print(str.substring(i, j) + " ");
                    count++;
                }
            }
            System.out.println();
        }

        System.out.println(count);
    }
}
