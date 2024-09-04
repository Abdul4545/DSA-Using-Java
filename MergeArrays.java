import java.util.Arrays;

public class MergeArrays {

    static int[] mergeArrays(int[] arr1, int[] arr2) {
        if (arr1.length == 0) {
            return arr2;
        }

        else if (arr2.length == 0) {
            return arr1;
        }

        int len = arr1.length + arr2.length;
        int[] newArray = new int[len];

        int first = 0;
        int second = 0;
        int i = 0;

        while (first < arr1.length && second < arr2.length) {
            if (arr1[first] > arr2[second]) {
                newArray[i++] = arr2[second++];
            }
    
            else if (arr1[first] <= arr2[second]) {
                newArray[i++] = arr1[first++];
            } 
        }

        while (first < arr1.length) {
            newArray[i++] = arr1[first++];
        }

        while (second < arr2.length) {
            newArray[i++] = arr2[second++];
        }

        return newArray;

    }

    public static void main(String args[]) {
        int arr1[] = { 1, 12, 23, 32, 54, 55 };
        int arr2[] = { -10, 13, 21, 34, 45 };

        int result[] = mergeArrays(arr1, arr2);

        System.out.println(Arrays.toString(result));


        int arr3[] = { };
        int arr4[] = { -10, 13, 21, 34, 45 };

        int result1[] = mergeArrays(arr3, arr4);

        System.out.println(Arrays.toString(result1));


    }

}
