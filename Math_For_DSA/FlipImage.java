package Math_For_DSA;

public class FlipImage {

    public static int[][] flipAndInvertImage(int[][] image) {
        
        for(int row[] : image) {
            for(int i = 0; i < (row.length + 1)/2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i -1] ^ 1;
                row[image[0].length - i -1] = temp;
            }
        }

        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        int[][] ans = flipAndInvertImage(image);

        for (int[] is : ans) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }
    }

}
