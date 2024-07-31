import java.util.Scanner;

class Basics {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void MatrixSum(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("addition not possible.");
            return;
        }

        int[][] SumArray = new int[r1][c1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < c1; j++) {
                SumArray[i][j] = a[i][j] + b[i][j];
            }
        }

        printArray(SumArray);
    }

    static void matrixMultiplication(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {

        if (c1 != r2) {
            System.out.println("Multiplication is not possible");
            return;
        }

        int[][] MultiplicationMatrix = new int[r1][c2];
        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    
                    //Mul[i][j] = ith row of a * jth col of b
                    MultiplicationMatrix[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        printArray(MultiplicationMatrix);
    }

    static void reverseMatrix(int[][] arr) {

        for(int i = 0; i < arr.length; i++) {
            int n = arr[i].length-1;
            int j = 0;
                while(j < n) {
                    int temp = arr[i][j];
                     arr[i][j]= arr[i][n]; 
                     arr[i][n] = temp;
                    j++;
                    n--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }

        };

        printArray(arr1);

        // taking input from the user
        // int[][] arr = new int[2][3];
        // assigning number of rows is mandatory in 2D array

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        // printArray(arr);

        // Why multidimensional array ?
        // Graphs will be represented in 2D array
        // Grids questions
        // Certain kind of time table
        // google sheets

        // que) Addition of 2 matrices
        int martix1[][] = { { 1, 2 },
                            { 3, 4 }
                         };

        int matrix2[][] = { { 5, 6 },
                            { 7, 8 }
                        };

        // MatrixSum(martix1, 2, 2, matrix2, 2, 2);

        // matrixMultiplication(martix1, 2, 2, matrix2, 2, 2);

        // reverseMatrix(arr1);
        // printArray(arr1);

        sc.close();

    }
}
