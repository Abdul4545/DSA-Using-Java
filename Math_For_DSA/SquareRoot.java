package Math_For_DSA;

public class SquareRoot {

    // Using Binary Search with precision
    static int squareRoot(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end-start)/2;
            if(mid*mid == n) {
                return mid;
            }
            else if(mid*mid > n) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }  
        }
        return -1;
    }

    // Complexity: O(log(n))
    public static double preciseSquareRoot(int num, int precision) {

        int start = 1;
        int end = num;
        double root = 0.0;
        while (start <= end) {
            int mid = start + (end-start)/2;

            if(mid*mid == num) {
                root = mid;
                return root;
            }

            else if(mid*mid > num) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }  
        }

        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while(root * root < num) {
                root += increment;
            }
            root -= increment;
            increment = increment/10;
        }

        return root;

    }

    public static void main(String[] args) {

        // System.out.println(squareRoot(36));
        // System.out.println(squareRoot(4));
        // System.out.println(squareRoot(100));
        // System.out.println(squareRoot(10));
        // System.out.println(squareRoot(2));

        int num = 40;
        int precision = 3;
        System.out.printf("%.3f",preciseSquareRoot(num, precision));

    }

}
