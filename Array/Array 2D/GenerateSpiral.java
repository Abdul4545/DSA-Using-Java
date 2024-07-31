import java.util.Scanner;

public class GenerateSpiral {

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] GenerateSpiralMatrix(int n) {

        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
        int current = 1;

        while(current <= (n * n) )  {

            // topRow -> leftCol to rightCol
            for(int j = leftCol; j <= rightCol && current <= n * n; j++) {
                matrix[topRow][j] = current;
                current++;
            }
            topRow++;


            // right column -> topRow to bottomRow
            for(int i = topRow; i <= bottomRow && current <= n * n; i++) {
                matrix[i][rightCol] = current;
                current++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for(int j = rightCol; j >= leftCol && current <= n * n; j--) {
                matrix[bottomRow][j] = current;
                current++;
            }
            bottomRow--;

            // leftRow -> bottomRow to topRow
            for(int i = bottomRow; i >= topRow && current <= n * n; i--) {
                matrix[i][leftCol] = current;
                current++;
            }
            leftCol++;

        }

        return matrix;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n for no of rows and columns in spiral matrix :");
        int n = sc.nextInt();

        int[][] matrix = GenerateSpiralMatrix(n);
        printMatrix(matrix);

        


        
    }
    
}
