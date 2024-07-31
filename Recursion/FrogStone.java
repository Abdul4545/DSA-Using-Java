package Recursion;

public class FrogStone {

    static int bestSolution(int[] h, int size, int index) {
        if(index == size-1) {
            return 0;
        }

        int option1 = Math.abs(h[index] - h[index + 1]) + bestSolution(h, size, index + 1);
        
        if(index == size - 2) {
            return option1;
        }

        int option2 = Math.abs(h[index] - h[index + 2]) +  bestSolution(h, size, index + 2);

        return Math.min(option1, option2);
    }
    public static void main(String[] args) {
        
        // int[] height = {10, 30, 40, 20};

        int[] height1 = {10,20,30,10};

        // int ans = bestSolution(height, height.length, 0);
        
        int ans = bestSolution(height1, height1.length, 0);

        System.out.println(ans);

    }
}
