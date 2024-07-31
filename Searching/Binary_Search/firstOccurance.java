package Searching.Binary_Search;

public class firstOccurance {

    static int FO(int[] arr, int key) {
        int start = 0; 
        int end = arr.length-1;
        int FOC = -1;
        
        while(start <= end) {

            int mid = (end+start)/2;

            if(arr[mid] == key) {
                FOC = mid;
                end = mid - 1;
            }

            else if(key > arr[mid]) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return FOC;

    }


    static int LO(int[] arr, int key) {
        int start = 0; 
        int end = arr.length-1;
        int LOC = -1;
        
        while(start <= end) {
            
            int mid = (end+start)/2;

            if(arr[mid] == key) {
                LOC = mid;
                start = mid + 1;
            }

            else if(key > arr[mid]) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return LOC;

    }

    public static void main(String[] args) {

        int arr[] = {1,2,2,3,4,6,8,9,9,9,9,9};
        System.out.println("hello");

        System.out.println(FO(arr, 2));
        System.out.println(FO(arr, 9));
        System.out.println("LAST OCCURANCE");

        System.out.println(LO(arr, 2));
        System.out.println(LO(arr, 9));




        
    }
}
