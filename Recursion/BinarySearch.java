package Recursion;

public class BinarySearch {

    static int search(int arr[], int target, int start, int end) {

        if(start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target) {
            return mid;
        }

        if(target < arr[mid]) {
            return search(arr, target, start, mid-1);
        }

        return search(arr, target, mid+1, end);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,6,12,45,56};

        System.out.println(search(arr, 56, 0, arr.length));
        System.out.println(search(arr, 6, 0, arr.length));
        System.out.println(search(arr, -6, 0, arr.length));
    }

}
