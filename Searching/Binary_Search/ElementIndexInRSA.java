package Searching.Binary_Search;

public class ElementIndexInRSA {

    static int searchElement(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = (end + start) / 2;

            if(arr[mid] == key) {
                return mid;
            }

            // mid to end is sorted
            else if(arr[mid] < arr[end]) {

                if(key > arr[mid] && key <= arr[end]) {
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }
            }


            // start to mid is sorted
            else {

                if(key >= arr[start] && key < arr[mid]) {
                    end = mid - 1;
                }

                else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }


    static int searchElementWithDuplicates(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = (end + start) / 2;

            if(arr[mid] == key) {
                return mid;
            }

            else if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }

            // mid to end is sorted
            else if(arr[mid] <= arr[end]) {

                if(key > arr[mid] && key <= arr[end]) {
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }
            }


            // start to mid is sorted
            else {

                if(key >= arr[start] && key < arr[mid]) {
                    end = mid - 1;
                }

                else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = {5,6,7,8,9,2,3,4};
        System.out.println(searchElement(arr, 3));
        System.out.println(searchElement(arr, 12));

        int[] arr1 = {0,0,0,0,1,1,1,1,2,2,2,2,0,0,0};
        System.out.println(searchElementWithDuplicates(arr1, 2));
        System.out.println(searchElementWithDuplicates(arr1, 1));
    }
}
