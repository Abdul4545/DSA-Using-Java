import java.lang.Math;

public class ArrayIntermediate3 {

    static void sort01(int[] arr) {
        int i = 0;
        int j = arr.length-1;

        while(i < j) {
            if(arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
                i++;
                j--;
            }

            else if(arr[i] == 0) {
                i++;
            }

            else {
                j--;
            }
        }
    }

    static void sortOddEven(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(i < j) {

            if(arr[i] % 2 == 0) {
                i++;
            }

            else if(arr[j] % 2 == 0 && arr[i] % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
                i++;
                j--;
            }

            else {
                j--;
            }

        }
    }

    static int[] returnSquareInNonDecreasingOrder(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int[] ans = new int[n]; 
        int k = n-1; // for travesal in ans and filling it

        while(i <= j) {
            if( Math.abs(arr[i]) > Math.abs(arr[j]) ) {
                ans[k--] = arr[i]*arr[i];
                i++;
            }

            else  {
                ans[k--] = arr[j]*arr[j];
                j--;
            }
        }

        return ans;
    }
    

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // int[] arr = {1,0,1,0,0,1};
        // sort01(arr);
        // printArray(arr);

        // int[] arr1 = {1,0,1,0,0,1,0};
        // sort01(arr1);
        // printArray(arr1);

        // int[] arr2 = {2,3,4,5,7,10,13};
        // sortOddEven(arr2);
        // printArray(arr2);

        // int[] arr3 = {1,2,3,4,5,7,10,13};
        // sortOddEven(arr3);
        // printArray(arr3);

        int[] arr4 = {-3, 4, 5, 12};
        int[] ans = returnSquareInNonDecreasingOrder(arr4);
        printArray(ans);
    }
}
