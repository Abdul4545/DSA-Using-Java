package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursionOnStrings {

    static String replaceOccurances(String str, char ch, int index) {
        String ans = "";

        if (index == str.length()) {
            return "";
        }

        if (str.charAt(index) != ch) {
            ans += str.charAt(index);
        }

        String smallAns = replaceOccurances(str, ch, index + 1);
        return ans + smallAns;
    }



    static String removeOccurances(String str, char ch) {
        if (str.length() == 0) {
            return "";
        }

        String smallAns = removeOccurances(str.substring(1), ch);

        if (str.charAt(0) != ch) {
            return str.charAt(0) + smallAns;
        }

        else {
            return smallAns;
        }
    }



    static String skipWord(String str, String word) {
        if (str.length() == 0) {
            return "";
        }

        if (str.startsWith(word)) {
            return skipWord(str.substring(word.length()), word);
        }

        else {
            return str.charAt(0) + skipWord(str.substring(1), word);
        }

    }



    static String reverseString(String input, int index) {

        if (index == input.length()) {
            return "";
        }

        return reverseString(input, index + 1) + input.charAt(index);

    }


    static boolean checkPalindrome(String input, int left, int right) {

        if (left >= right) {
            return true;
        }

        return (input.charAt(left) == input.charAt(right) && checkPalindrome(input, left + 1, right - 1));

    }



    static ArrayList<String> returnSubsequence(String str) {

        ArrayList<String> ans = new ArrayList<>();

        if (str.length() == 0) {
            ans.add(" ");
            return ans;
        }

        char firstChar = str.charAt(0);
        ArrayList<String> smallAns = returnSubsequence(str.substring(1)); // it will contain ["bc", "b", "c", ""]

        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(firstChar + ss);
        }

        return ans;
    }


    static void printSubsequences(String str, String currAns) {

        if (str.length() == 0) {
            System.out.println(currAns);
            return;
        }

        char currChar = str.charAt(0);
        String remStr = str.substring(1);

        // currChar -> chooses to be a part of currAns
        printSubsequences(remStr, currAns + currChar);

        // currChar -> did not choose to be a part of currAns
        printSubsequences(remStr, currAns);

    }



    static void subsequences(String processed, String unProcessed) {

        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        subsequences(processed + ch, unProcessed.substring(1));

        subsequences(processed, unProcessed.substring(1));
    }


    static void subsequencesACII(String processed, String unProcessed) {

        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        subsequencesACII(processed + ch, unProcessed.substring(1));
        subsequencesACII(processed, unProcessed.substring(1));
        subsequencesACII(processed + (ch+0), unProcessed.substring(1));
    }



    static ArrayList<String> subsequences1(String processed, String unProcessed) {

        if (unProcessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);

        ArrayList<String> left = subsequences1(processed + ch, unProcessed.substring(1));

        ArrayList<String> right = subsequences1(processed, unProcessed.substring(1));

        left.addAll(right);
        return left;
    }



    static List<List<Integer>> subset(int arr[]) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }


    static void printArraySubsetSum(int[] arr, int sum, int index) {

        if (index == arr.length) {
            System.out.println(sum);
            return;
        }

        // arr[index] -> did not choose to be a part of sum
        printArraySubsetSum(arr, sum, index + 1);

        // arr[index] -> chooses to be a part of sum
        printArraySubsetSum(arr, sum + arr[index], index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = "banana";
        // printing characters using subString() method
        // endIndex is exlusive

        // System.out.println(name.substring(3, 7));

        // System.out.println(name.substring(0));

        // Character output
        // char ch = input.charAt(0);
        // System.out.println(ch);

        // remove all occurances of 'a' from string s = "abcax"
        // String s = "abcax";

        // for(int i = 0; i < s.length(); i++) {
        // if(s.charAt(i) != 'a') {
        // ans += s.charAt(i);
        // }
        // }

        // System.out.println(s);
        // System.out.println(ans);

        // using recursion
        // System.out.println(replaceOccurances(s, 'a', 0));

        // String sr = "Moida";
        // System.out.println(replaceOccurances(sr, 'a', 0));

        // System.out.println(removeOccurances(s, 'a'));
        // System.out.println(removeOccurances(sr, 'i'));

        // String s = "aapplebcdapple";
        // String word = "apple";
        // System.out.println(skipWord(s, word));


        // String abcd = "abc";
        // System.out.println(subsequences1("", abcd));

        // subsequencesACII("", "ab");




        // System.out.println(reverseString(sr, 0));

        // String str = "ABCDCBA";
        // System.out.println(checkPalindrome(str, 0, str.length() - 1));

        // System.out.println(returnSubsequence("abcd"));

        // printSubsequences("abc", "");

        int arr[] = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);

        // int[] arr = {2, 3, 4};
        // printArraySubsetSum(arr, 0, 0);

        sc.close();

    }
}
