package Strings;

public class Performance {

    public static void main(String[] args) {
        String series = "";
        System.out.println();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }

        System.out.println(series);

        // for adding N characters to a string the complexity will be O(N^2). In the above example the time complexity will be O(N^2)

        // To overcome this problem StringBuilder is introduced
    }

    
}
