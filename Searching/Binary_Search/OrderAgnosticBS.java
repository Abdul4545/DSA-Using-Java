package Searching.Binary_Search;

public class OrderAgnosticBS {

    public static void main(String[] args) {
        
        int[] arr1 = {-50,-23,2,3,4,5,6,7,7,56};
        int[] arr2 = {98, 56, 23, 12, 10, 0, -10, -20};

        int ans1 = search(arr1, 56);
        int ans2 = search(arr2, -10);
        System.out.println();
        System.out.println(ans1 +  "\n" + ans2);
        
    }

    static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        
        if(arr[start] < arr[end]) {
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if(arr[mid] == key) {
                    return mid;
                }
    
                else if(arr[mid] < key) {
                    start = mid+1;
                }
    
                else {
                    end = mid - 1;
                }   
            }
        }

        else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if(arr[mid] == key) {
                    return mid;
                }
    
                else if(arr[mid] < key) {
                    end = mid - 1;
                }
    
                else {
                    start = mid + 1; 
                }
            }
        }
        return -1;
    }

}
