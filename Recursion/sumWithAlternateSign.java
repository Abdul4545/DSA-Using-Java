package Recursion;

public class sumWithAlternateSign {

    static int sumUptoN(int n) {
        if(n == 0) {
            return n;
        }

        if(n % 2 == 0) {
            return sumUptoN(n-1) - n;   
        }
        
        else {
            return sumUptoN(n-1) + n;
        }

    }


    public static void main(String[] args) {

        System.out.println(sumUptoN(5));
        System.out.println(sumUptoN(0));
        
    }
    
}
