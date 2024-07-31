package Sorting.Cyclic_Sort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public static List<Integer> findAllDuplicates(int[] nums) {
        
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            // swap
            if(nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
    
            else {
                i++;
            }
        }

        // just find missing numbers
        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1) {
                ans.add(nums[index]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};

        System.out.println();

        System.out.println(findAllDuplicates(nums));
    }
}
