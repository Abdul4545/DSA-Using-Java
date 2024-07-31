package Searching.Linear_Search;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 4, 65, 89, 34, -23, 65};
        int ans = linearSearch(arr, 34);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {

        if(arr.length == 0) {
            return -1;
        }

        // for(int i = 0; i < arr.length; i++) {
        //     if(arr[i] == target) {
        //         return i;
        //     }
        // }

        for (int element : arr) {
            if(element == target) {
                return element;
            }
        }

        return -1;
    }
    
}
