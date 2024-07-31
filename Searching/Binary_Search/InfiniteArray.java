package Searching.Binary_Search;

public class InfiniteArray {

    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 7, 10, 12, 15, 34, 45, 67, 89, 92, 99, 345, 5678, 7890};

        int target = 345;
        System.out.println();

        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        
        return binarySearch(arr, target, start, end);
    }



    static int binarySearch(int[] arr, int key, int start, int end) {
        
        while (start <= end) {

            int mid = start + (end - start)/2;
    
            if(arr[mid] == key) {
                return mid;
            }
    
            else if(arr[mid] > key) {
                end = mid-1;
            }
    
            else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
