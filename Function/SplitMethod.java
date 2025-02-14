import java.util.*;

public class SplitMethod {
    public static ArrayList<String> splitString(String str) {
        ArrayList<String> result = new ArrayList<String>();
        int j = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ') {
                result.add(str.substring(j, i));
                j = i+1;
            }
            
            if(i == str.length()-1) {
                result.add(str.substring(j, i+1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str1 = "My name is khan";
        ArrayList<String> res = splitString(str1);
        System.out.println(res);
    } 
}


