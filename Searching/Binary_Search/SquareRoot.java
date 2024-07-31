package Searching.Binary_Search;

public class SquareRoot {

    static int squareRoot(int n) {
        int start = 0; 
        int end = n;
        int ans = 0;
        
        while (start <= end) {
            int mid = (end + start)/2;
            int value = mid * mid;

            if(value == n) {
                return mid;
            }

            else if(value < n) {
                start = mid + 1;
                ans = mid; 
            }

            else {
                end = mid - 1;
            }  
        }
        
        return ans;
    }
    public static void main(String[] args) {

        System.out.println(squareRoot(24));
        System.out.println(squareRoot(100));
        System.out.println(squareRoot(39));
        
    }
    
}
