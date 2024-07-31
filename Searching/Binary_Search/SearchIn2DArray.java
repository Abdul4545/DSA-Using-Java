package Searching.Binary_Search;

import java.util.Arrays;

public class SearchIn2DArray {

    // array elements are sorted -> the last element of one row is smaller than the first element of next row

    static boolean search(int[][] arr, int target) {

        int n = arr.length; // number of rows
        int m = arr[0].length; // number of columns

        int start = 0;
        int end = n * m - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            int midElement = arr[mid/m][mid%m];

            if(midElement == target) {
                return true;
            }

            if(target < midElement) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
            
        }

        return false;
    }

    static boolean searchII(int[][] arr, int key) {

        int n = arr.length;
        int m = arr[0].length;

        int i = 0;
        int j = m-1;

        while (i < n && j >= 0) {
            if(arr[i][j] == key) {
                return true;
            }

            if(arr[i][j] > key) {
                j--;
            }

            else {
                i++;
            }
            
        }
        return false;
    }

    static int[] searchIII(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if(matrix[r][c] == target) {
                return new int[] {r,c};
            }

            else if(matrix[r][c] < target) {
                r++;
            }

            else {
                c--;
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

        System.out.println();
        // System.out.println(search(arr, 12));

        System.out.println(Arrays.toString(searchIII(arr, 7)));
    }
    
}
