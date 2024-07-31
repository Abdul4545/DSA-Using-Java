package Searching.Binary_Search;

public class minElementInRSA {

    static int searchInRSA(int arr[]) {
        int n = arr.length-1;
        int start = 0;
        int end = n;
        int ans = 0;

        while (start <= end) {
            
            int mid = (end+start)/2;
    
            if(arr[mid] > arr[n]) {
                start = mid + 1;
            }
    
            else if( arr[mid] <= arr[n]) {
                ans = mid;
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {3,4,5,6,1,2};
        System.out.println(searchInRSA(arr));

        int[] arr1 = {2,3,4,5,6,1};
        System.out.println(searchInRSA(arr1));
        
    }    
}