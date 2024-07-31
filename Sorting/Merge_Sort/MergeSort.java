package Sorting.Merge_Sort;

public class MergeSort {

    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid-left+1;
        int n2 = right-mid; 

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        int i, j, k;

        for(i = 0; i < n1; i++) {
            leftArray[i] = arr[left+i];
        }

        for(j = 0; j < n2; j++) {
            rightArray[j] = arr[mid+1+j];
        }

        i = 0; j = 0; k = left;

        while (i < n1 && j < n2) {

            if(leftArray[i] < rightArray[j]) {
                arr[k++] = leftArray[i++];
            }

            else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArray[i++];
        }

        while (j < n2) {
            arr[k++] = rightArray[j++];
        }

    }

    static void mergeSort(int[] arr, int left, int right) {

        if(left >= right) {
            return;
        }
        
        int mid = (right+left)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr, left, mid, right);

    }


    public static void main(String[] args) {
        int arr[] = {3,8,2,9,6,5,4};

        mergeSort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
