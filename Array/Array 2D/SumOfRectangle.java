import java.util.Scanner;

public class SumOfRectangle {

    // que) Given a matrix 'a' of dimensions nxm and 2 coordinates(L1,R1) and (L2, R2).
    // Return thr sum of the rectangle from (L1,R1) to (L2, R2).

    // Using Brute force method.
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        for(int i = l1; i <= l2; i++) {
            for(int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

 
    
    // Using Pre-Calculating the horizontal sum for each row

    static void matrixPrefixSum(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        // for row sum
        for(int i = 0; i < row; i++) {
            for(int j = 1; j < column; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }

    

    static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        matrixPrefixSum(matrix);

        for(int  i = l1; i <= l2; i++) {
            // r1 to r2 sum for row i
            if(r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1-1];
            }
            else {
                sum += matrix[i][r2];
            }
                
        }
        return sum;
    }

    


    // Using Prefix sum over the both rows and columns
    static void matrixPrefixSum2(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        // for row sum
        for(int i = 0; i < row; i++) {
            for(int j = 1; j < column; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }

        // for column sum
        for(int j = 0; j < column; j++) {
            for(int i = 1; i < row; i++) {
                matrix[i][j] += matrix[i-1][j]; 
            }
        }
    }


    static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2) {
        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
        matrixPrefixSum2(matrix);

        sum = matrix[l2][r2];

        if(r1 >= 1) {
            left = matrix[l2][r1-1];
        }

        if(l1 >= 1) {
            up = matrix[l1-1][r2];
        }

        if(l1 >=1 && r1 >= 1) {
        
            leftUp = matrix[l1-1][r1-1];
        }


        ans = sum - up -left - leftUp;

        return ans;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows for matrix");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns for matrix");
        int columns = sc.nextInt();

        System.out.println("Enter matrix Eleements");

        int matrix[][] = new int[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        System.out.println("Enter rectangle boundries L1, R1, L2, R2");
        int left1 = sc.nextInt();
        int row1 = sc.nextInt();
        int left2 = sc.nextInt();
        int row2 = sc.nextInt();


        int ans = findSum3(matrix, left1, row1, left2, row2);
        System.out.println("The sum is " + ans);
        
    }
}
