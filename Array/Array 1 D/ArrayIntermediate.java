import java.util.Arrays;

public class ArrayIntermediate {

    static int targetSum(int[] arr, int sum) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    static int tripletTargetSum(int[] arr, int sum) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        count++;
                    }
                }

            }
        }
        return count;
    }

    static int findUnique(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1;
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;

    }

    // find the second largest from the array

    static int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;

    }

    static int secondLargest(int[] arr) {
        int max = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);

        return secondMax;

    }

    static int firstRepeatingElement(int arr[]) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    

    public static void main(String[] args) {

        // int arr[] = { 1, 2, 3, 4, 4, 5, 6, 8 };
        // int arr1[] = { 4, 6, 3, 5, 8, 2 };

        // Find the Target sum of in the Array
        // System.out.println(targetSum(arr, 6));
        // System.out.println(targetSum(arr, 20));
        // System.out.println(targetSum(arr1, 7));
        // System.out.println(targetSum(arr1, 12));

        // Find the target sum in the array using three elements
        // System.out.println("Output of triplet sum");
        // System.out.println(tripletTargetSum(arr, 8));
        // System.out.println(tripletTargetSum(arr1, 12));

        // find the unique number in a given Array where all the elements are being
        // repeated twice with one value being unique

        // int[] Arr = {1,2,3,4,5,4,3,2,1};
        // System.out.println(findUnique(Arr));

        // find the second max element in the array
        // first method
        // int[] arr1 = arr.clone();
        // Arrays.sort(arr1);
        // System.out.println(arr1[arr1.length-2]);

        // second method
        // int array[] = {1,2,3,4,5,8,9,12,32,67,98,34,56};
        // System.out.println(secondLargest(array));

        // int[] array1 = {-9,-1,-2,-4};
        // System.out.println(secondLargest(array1));



        // Return the first value in the array that is repeating. if no value is being
        // repeated return -1
        // int array1[] = { 1, 2, 3, 4, 5, 2, 5, 7, 8};
        // System.out.println(firstRepeatingElement(array1));

        // int array2[] = { 1, 2, 3, 4, 5, 7, 8};
        // System.out.println(firstRepeatingElement(array2));

    }
}
