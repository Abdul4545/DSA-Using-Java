package Strings;

public class Comparision {

    public static void main(String[] args) {
        String a = "Abdul"; // it is in string pool
        String b = ("Abdul"); // it is in string pool

        System.out.println(a == b);
        // True

        String name1 = new String("Asaad");
        String name2 = new String("Asaad");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));
    }

}
