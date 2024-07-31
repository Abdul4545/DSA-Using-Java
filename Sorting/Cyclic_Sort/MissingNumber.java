package Sorting.Cyclic_Sort;

public class MissingNumber {

    static int missingNumber(int[] a, int N) {
        // Write your code here.
        int i = 0;
        while (i < N) {
            
            int correctIndex = a[i] - 1;
            // swap

            if(a[i] > N) {
                return i+1;
            }

            else if(a[i] == 0) {
                return i+1;
            }

            else if(a[i] != a[correctIndex]) {
                int temp = a[i];
                a[i] = a[correctIndex];
                a[correctIndex] = temp;
            }


            else {
                i++;
            }
        }

        for (int j = 0; j < N-1; j++) {
            if(a[j] != j+1) {
                return j;
            }
        }

        return N;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,4,5};
        // int arr[] = {1, 2, 3, 5, 6, 7, 8};

        System.out.println();

        System.out.println(missingNumber(arr, 5));
    }

}
