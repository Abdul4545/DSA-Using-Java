package Math_For_DSA;

public class PowerOfTwo {

    static boolean isPowerOfTwo(int n) {
        // int count = 0;
        // while (n > 0) {
        //     int lastValue = n & 1;
        //     if(lastValue == 1) {
        //         count++;
        //     }
        //     n = n >> 1;
        // }

        // return count == 1 ? true : false;
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(12));
        System.out.println(isPowerOfTwo(1));
    }

}
