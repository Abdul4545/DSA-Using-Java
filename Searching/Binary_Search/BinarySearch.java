package Searching.Binary_Search;

public class BinarySearch {

    static int binarySearch(int[] arr, int key) {
        
        int start = 0;
        int end = arr.length-1;

        
        while (start <= end) {
            int mid = start + (end - start)/2;
    
            if(arr[mid] == key) {
                return mid;
            }
    
            else if(arr[mid] > key) {
                end = mid-1;
            }
    
            else {
                start = mid+1;
            }
        }

        return -1;
    }

    
    // recursive implementation
    static boolean recursiveBS(int[] arr, int s, int e, int key) {
        // base case
        if(s > e) {
            return false;
        }


        int mid = (e+s)/2;

        if(arr[mid] == key) {
            return true;
        } 

        else if(arr[mid] > key) {
            return recursiveBS(arr, s, mid-1, key);
        }

        else {
            return recursiveBS(arr, mid+1, e, key);
        }
    } 


    public static void main(String[] args) {
        int[] even = {1,2,3,4,5,6};
        int[] odd = {2,4,6,8,10};

        // System.out.println(binarySearch(even, 2));
        // System.out.println(binarySearch(odd, 10));

        // System.out.println(binarySearch(even, 8));
        // System.out.println(binarySearch(odd, 5));

        System.out.println(recursiveBS(odd, 0, 4, 10));

        System.out.println(recursiveBS(even, 0, 5, 5));
    }
}
