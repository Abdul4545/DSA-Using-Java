package Searching.Binary_Search;

public class CeilingOfTarget {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int ans = ceiling(arr, 6);
        System.out.println();
        System.out.println(ans);
        
    }

    static int ceiling(int[] arr, int target) {

        if(target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;                
        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return target;
            }

            else if(arr[mid] > target) {
                end = mid - 1; 
            }

            else {
                start = mid + 1;
            }
        }
        
        return arr[start];
        // return arr[end]; // will give floor value

    }

}
