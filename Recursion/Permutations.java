package Recursion;

import java.util.ArrayList;

public class Permutations {

    public static void main(String[] args) {

        String str = "abc";
        permutations("", str);
        System.out.println();

        ArrayList<String> ans = permutationsList("", str);
        System.out.println(ans);

        System.out.println(permutationsCount("", str));
        
    }

    static void permutations(String processed, String unProcessed) {

        if(unProcessed.isEmpty()) {
            System.out.print(processed + " ");
            return;
        }

        char ch = unProcessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            permutations(f+ch+s, unProcessed.substring(1));
            
        }
    }



    static ArrayList<String> permutationsList(String processed, String unProcessed) {

        if(unProcessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);
        ArrayList<String> Ans = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            Ans.addAll(permutationsList(f+ch+s, unProcessed.substring(1)));
        }

        return Ans;
    }


    static int permutationsCount(String processed, String unProcessed) {

        if(unProcessed.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = unProcessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            count = count + permutationsCount(f+ch+s, unProcessed.substring(1));
        }
        return count;
    }

}
