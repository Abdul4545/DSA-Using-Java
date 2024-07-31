package Strings;

public class Interning {

    public static void main(String[] args) {
        
        // interning
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1 + str2);

        // both 'hello' of str1 and str2 are saved at the same place in heap memory whereas variables str1 and str2 are two different places in stack

        str2 = "Hellos";
        // when we will change the value of anyone then they will point at different places in heap memory


        // using new keyword we can store them at different places in heap memory
        
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println(str3 + str4);
    }
    
}
