import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("..m");
        // second character should be m
        Matcher m = p.matcher("Iam");
        Boolean b = m.matches();
        System.out.println(b);

        boolean b1 = Pattern.matches(".a", "lame");
        System.out.println(b1);


        // should not contain amn in the word or sentence
        // System.out.println(Pattern.matches("[^amn]", "c"));

        // should contain only a-z and A-S in the word or sentence
        // System.out.println(Pattern.matches("[a-zA-S]", "mT"));


        // should start with A or M and contains a to z any character of length 5
        // System.out.println(Pattern.matches("[AM][a-z]{5}", "Abdula"));

        // whether x, y, z is occuring once or not if occuring more than once then false
        // System.out.println(Pattern.matches("[xyz]?", "zz"));

        // whether x,y,z is occuring more than once or not
        // System.out.println(Pattern.matches("[xyz]+", "zzzz"));

        // whether x,y,z is 0 or more times
        // System.out.println(Pattern.matches("[xyz]*", "l"));


        // whether a string consists of digits only
        System.out.println(Pattern.matches("\\d", "1"));

        // whether a string consists of a-z then digits
        System.out.println(Pattern.matches("[a-z]*\\d", "abdul1"));

        // // whether a string consists of digit or not
        System.out.println(Pattern.matches("\\D", "1"));



    }
    
}
