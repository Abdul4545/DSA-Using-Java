

public class RotateMatrix {

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
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

    static void transposeInPlace(int[][] matrix, int r , int c) {

        for(int i = 0; i < c; i++){
            for(int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void rotate(int[][] matrix, int n) {
        // transpose
        // reverse each row of transposed matrix
        transposeInPlace(matrix, n, n);
        reverseMatrix(matrix);

    }

    public static void main(String[] args) {

        int[][] martix1 = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println("Original Array is :");
        printMatrix(martix1);

        System.out.println("Rotated matrix is :");
        rotate(martix1,3);
        printMatrix(martix1); 
        
    }    
}
