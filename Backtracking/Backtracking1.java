package Backtracking;

/**
 * Backtracking1
 */
public class Backtracking1 {

    static void PrintPermutation(String str, String perm, int index) {

        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for(int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);

            PrintPermutation(newString, perm + currChar, index+1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        PrintPermutation(str, "", 0);
    }
}