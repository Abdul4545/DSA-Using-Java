package Searching.Binary_Search;

public class PeakInMountainArray {

    static int findPeak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = (end + start) / 2;

            if((mid == 0 || arr[mid] > arr[mid-1]) && (mid== end-1 || arr[mid] > arr[mid+1])) {
                ans = mid;
                return ans;
            }

            if(arr[mid] < arr[mid+1]) {
                start = mid+1;
            }

            else {
                end = mid - 1;
            }  
        }

       

        return ans;
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            }

            else {
                start = mid + 1;
            }
        }

        return start;
        
    }


    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,9,4,3};
        System.out.println();
        System.out.println(peakIndexInMountainArray(arr));
        
    }
}
