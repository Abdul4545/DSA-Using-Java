package Searching.Binary_Search;

public class SearchElementInRotatedArray {

    public static void main(String[] args) {

        int arr[] = {2,3,4,5,0,1,2};
        System.out.println();
        System.out.println(findPivot(arr));
        
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // if you did not find the pivot it means the array is not rotated

        if(pivot == -1) {
            // just do normal binary search
            return orderAgnosticBinarySearch(arr, target, 0, arr.length-1);
        }

        // pivot is found, you have found 2 asc sorted arrays

        if(arr[pivot] == target) {
            return pivot;
        }

        if(target > arr[0]) {
            return orderAgnosticBinarySearch(arr, target, 0, pivot-1);
        }

        return orderAgnosticBinarySearch(arr, target, pivot + 1, arr.length-1);

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


    static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            
            // 4 cases
            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }

            else if(mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }

            else if(arr[mid] <= arr[start]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
