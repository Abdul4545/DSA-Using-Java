package Sorting.Cyclic_Sort;

public class MissingNumber {

    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                // Swap nums[i] with nums[correctIndex]
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Find the missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,4,5};
        // int arr[] = {1, 2, 3, 5, 6, 7, 8};

        System.out.println();

        System.out.println(missingNumber(arr));
    }

}
