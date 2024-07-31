package Sorting.Bubble_Sort;

public class ShiftZeros {

    static void shiftZeros(int arr[]) {

        for(int i = 0; i < arr.length-1; i++) {
            boolean flag = false; // has any swapping happenend
            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] == 0 &&  arr[j+1]  != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }

            if(flag == false) { // has any swap happened
                return;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {0,1,9,0,2,3,0,5,0,9,8,0};
        shiftZeros(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
         
    }
    
}
