package Recursion;

import java.util.ArrayList;

public class PhonePad {

    public static void main(String[] args) {

        // pad("", "12");

        System.out.println(padReturn("", "12"));

    }

    static void pad(String processed, String unProcessed) {

        if (unProcessed.isEmpty()) {
            System.out.print(processed + " ");
            return;
        }

        int digit = unProcessed.charAt(0) - '0'; 
        // this will convert '2' into 2

        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            pad(processed + ch, unProcessed.substring(1));
        }
    }


    static ArrayList<String> padReturn(String processed, String unProcessed) {

        if (unProcessed.isEmpty()) {
            ArrayList <String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unProcessed.charAt(0) - '0'; 
        // this will convert '2' into 2

        ArrayList <String> list = new ArrayList<>();

        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            list.addAll(padReturn(processed + ch, unProcessed.substring(1)));
        }

        return list;
    }
}
