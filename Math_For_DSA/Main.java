package Math_For_DSA;

public class Main {

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    // use XOR because a^a = 0 and a^0 = a 
    // order does not matters
    static int nonRepeating(int arr[]) {
        int XOR = 0;
        for(int i = 0; i < arr.length; i++) {
            XOR = XOR ^ arr[i];
        }
        return XOR;
    }



    public static void main(String[] args) {
        
        // Questions
        // 1) Given a no, find if it is odd
        for (int i = 23; i < 31 ; i++) {
            System.out.println(isOdd(i));
        }


        // 2) Non duplicate element in array
        int arr[] = {1,2,3,3,2,1,5};
        System.out.println(nonRepeating(arr));



        // 3) Find ith bit of a number
        // method is: (n & (1 << (n-1))

        System.out.println(43 & (1 << (2-1)));


        // 4) Set the ith bit
        // turn it to 1 if 0, 1 if 1
        // method is: do OR operation on that bit by 1 and on rest by 0


        // 5) Reset the ith bit
        // turn it to 0 if 1, 0 if 0
        // method is: do AND operation on that bit by 0 and on rest by 1

    }

}
