package Recursion;



public class CountOfDigits {

    static int COD(int n) {
        if(n / 10 == 0) {
            return 1;
        }

        return COD(n/10) + 1;
    }

    public static void main(String[] args) {

        System.out.println(COD(40));
        
    }
    
}
