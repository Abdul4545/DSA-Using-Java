package Strings;

public class StringCompression {
    
    static String StringCompress(String str) {

        String ans = "" + str.charAt(0);
        int count = 1;

        for(int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev) {
                count++;
            }

            else {
                ans += count;
                count = 1;
                ans += curr;
            }

            if(i == str.length() - 1) {
                if(count > 1) {
                    ans += count;
                }
            }

        }

        return ans;

    }

    public static void main(String[] args) {

        System.out.println(StringCompress("aaaabbbcddeee"));
        
    }
    
}
