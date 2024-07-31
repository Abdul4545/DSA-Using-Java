public class SpiralOrder {

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix, int r, int c) {

        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElements = 0;

        while(totalElements < r * c)  {

            // topRow -> leftCol to rightCol
            for(int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;


            // right column -> topRow to bottomRow
            for(int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(matrix[i][rightCol]+ " ");
                totalElements++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for(int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // leftRow -> bottomRow to topRow
            for(int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(matrix[i][leftCol]+ " ");
                totalElements++;
            }
            leftCol++;

        }

    }

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},{5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        System.out.println("Your given matrix is :");
        printMatrix(matrix);

        System.out.println("Spiral order traversal is :");
        printSpiralOrder(matrix, 4, 4);
        

        // que) Given a positive integer n, generate an nxn matrix filled with elements from 1 to n^2 in spiral order 
        

    }
    
}
