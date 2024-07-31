package Strings;

public class StringBuilderBasics {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("hello");
        // str += "world";  -> will give error

        str.append("World");
        System.out.println(str);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder);

        // StringBuilder is mutable 
        str.setCharAt(0, 'M');
        System.out.println(str);


        // DeleteCharAt(index)
        str.deleteCharAt(0);
        System.out.println(str);

        str.insert(0, 'H');
        System.out.println(str);

        str.insert(5, ' ');
        System.out.println(str);

        // delete(start, end)
        str.delete(6, str.length());
        System.out.println(str);

        
        // Reverse String using StringBuilder
        String str1 = "Abdul Moid";
        System.out.println(str1);

        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        System.out.println(str2);        

    }
    
}
