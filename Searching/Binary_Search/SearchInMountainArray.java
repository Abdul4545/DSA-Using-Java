package Searching.Binary_Search;

public class SearchInMountainArray {

    public static void main(String[] args) {

        int arr[] = {1,3,5,8,9,7,6};
        int target = 7;
        System.out.println();
        System.out.println(search(arr, target));

    }

    static int search(int[] arr, int target) {

        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);

        if(firstTry != -1) {
            return firstTry;
        }

        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length-1);

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

    static int orderAgnosticBinarySearch(int[] arr, int key, int start, int end) {
        
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
