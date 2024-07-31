// Pascal's triangle is the triangular array of numbers that begins with 1 on the top and with 1's running down the two sides of a triangle. Each new number lies between two numbers and below them, and its value is the sum of the two numbers above it.

/*
                    1
                1       1
            1       2       1
        1       3       3       1
    1       4       6       4        1
*/

// Que) Given an interger n, return the first n rows of Pascal's triangle

import java.util.Scanner;

public class PascalTriangle {

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] Pascal(int n) {
        
        int[][] ans = new int[n][];

        for(int i = 0; i < n; i++) {
            // ith row has i+1 columns
            ans[i] = new int[i+1];

            // 1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;

            for(int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }


        return ans;
    } 


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        int[][] ans = Pascal(rows);
        printMatrix(ans);


        
    }
    
}
