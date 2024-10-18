package Strings;
import java.util.HashSet;
import java.util.Stack;
import java.util.Scanner;

// remove duplicate characters from string

class RemoveDuplicates {

    public static String removeDuplicates(String str) {

        Stack<Character> stack = new Stack<>();
        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                stack.push(ch);
                set.add(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        for (char ch : stack) {
            result.append(ch);
        }

        return "After removing duplicates: " + result.toString();
    }

    public static void main(String amk[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(removeDuplicates(str));

        sc.close();
    }
}
