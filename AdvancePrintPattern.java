public class AdvancePrintPattern {
    public static void main(String[] args) {

        // print butterfly

        // *             *
        // * *         * *
        // * * *     * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * *     * * *
        // * *         * *
        // *             *

        // upper half
        // for(int i = 1; i <= 4; i++) {

        // for(int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }

        // for(int j = 2*(4-i); j >= 1; j--) {
        // System.out.print(" ");
        // }

        // for(int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // lower half
        // for(int i = 4; i >= 1; i--) {
        // for(int j = i; j >= 1 ; j--) {
        // System.out.print("* ");
        // }

        // for(int j = 2*(4-i); j >= 1; j--) {
        // System.out.print(" ");
        // }

        // for(int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // print the pattern
        //        * * * * *
        //       * * * * *
        //      * * * * *
        //     * * * * *
        //    * * * * *

        for(int i = 5; i >= 1; i--) {

            for(int j = (i-1) * 2; j >= 1; j--) {
            System.out.print(" ");
            }

            for(int j = 1; j <= 5; j++) {
            System.out.print(" * ");
            }
            
            System.out.println();
        }

        // print the number pyramid

        //      1
        //     2 2
        //    3 3 3
        //   4 4 4 4
        //  5 5 5 5 5

        // for(int i = 1; i <= 5; i++) {

        // for(int j = 5 - i; j >= 1; j--) {
        // System.out.print(" ");
        // }

        // for(int j = 1; j <= i; j++) {
        // System.out.print(" " + i);
        // }

        // System.out.println();
        // }

        // Print the palindromic pyramid pattern

        //         1
        //       2 1 2
        //     3 2 1 2 3
        //   4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5

        // for(int i = 1; i <= 5; i++) {
        // for(int j = (5 - i) ; j >= 1; j--) {
        // System.out.print(" ");
        // }

        // for(int j = i; j >= 1; j--) {
        // System.out.print(j + " ");
        // }

        // for(int j = 2; j <= i; j++) {
        // System.out.print(j + " ");
        // }

        // System.out.println();
        // }




        // Print the diamond pattern

        //       *
        //     * * *
        //   * * * * *
        // * * * * * * *
        // * * * * * * *
        //   * * * * * 
        //     * * *
        //       *
        

        // Upper Half

        // for (int i = 1; i <= 4; i++) {
        //     for (int j = (4 - i) * 2; j >= 1; j--) {
        //         System.out.print(" ");
        //     }

        //     for (int j = (2 * i) - 1; j >= 1; j--) {
        //         System.out.print(" *");
        //     }

        //     System.out.println();

        // }

        // Lower half part

        // for (int i = 4; i >= 1; i--) {
        //     for (int j = (4 - i) ; j >= 1; j--) {
        //         System.out.print("  ");
        //     }

        //     for (int j = (2 * i) - 1; j >= 1; j--) {
        //         System.out.print(" *");
        //     }

        //     System.out.println();
        // }
        
    }
}
