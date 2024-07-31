// transpose of a matrix is a matrix whose rows are converted into columns

public class TransposeMatrix {

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] matrix, int r, int c) {

        int ans[][] = new int[c][r];

        // for inserting values in ans matrix c and r are used
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }


    // only for square matrix can be done 
    static void transposeInPlace(int[][] matrix, int r , int c) {

        for(int i = 0; i < c; i++){
            for(int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix1 = {{1,2,3}, {4,5,6},{7,8,9}};

        // int[][] ans1 = findTranspose(matrix1, 3, 3);
        // printMatrix(ans1);
        // System.out.println();


        int[][] matrix2 = {{1,2},{3,4},{5,6}};
        // int[][] ans2 = findTranspose(matrix2, 3, 2);
        // printMatrix(ans2);

        transposeInPlace(matrix1, 3, 3);
        printMatrix(matrix1);

    }
    
}
