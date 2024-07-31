package Strings;

public class ReverseStrings {
    public static void main(String[] args) {
        String input = "Abdul Moid Khan";
        String ans = "";

        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch != ' ') {
                sb.append(ch);
            }

            else {
                sb.reverse();
                ans += sb + " ";

                // making empty the string builder
                sb = new StringBuilder("");
                // sb.delete(0, sb.length());
            }

        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
