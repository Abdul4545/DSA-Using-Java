package Math_For_DSA;

public class SetBits {

    // count setBits in a number
    public static void main(String[] args) {
        int n = 5;
        // int count = 0;
        // Method 1
        // while(n > 0) {
        //     if((n & 1) == 1) {
        //         count++;
        //     }
        //     n = n >> 1;
        // }
        // System.out.println(count);

        // Method 2
        // String binary = Integer.toBinaryString(n);
        // for(int i = 0; i < binary.length(); i++) {
        //     if(binary.charAt(i) == '1') {
        //         count++;
        //     }
        // }
        // System.out.println(count);

        // Method 3
        System.out.println(setBits(n));


    }

    private static int setBits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n & (n-1);
        }
        return count;
    }

}
