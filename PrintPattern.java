public class PrintPattern {
    public static void main(String[] args) {
        
        // solid rectangle
        // ********
        // ********
        // ********
        // ********

        // for(int i = 1; i <= 4; i++ ) {
        //     for(int j = 1; j <= 8; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }



        // Hollow rectangle
        // ********
        // *      *
        // *      *
        // ********

        // for(int i = 1; i <= 4; i++) {
        //     for(int j = 1; j <= 8; j++) {
        //         if(i == 1 || j == 1 || i == 4 || j == 8){
        //             System.out.print("* ");
                    
        //         }

        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }



        // half pyramid
        // *
        // * *
        // * * *
        // * * * *
        // for(int i = 1; i <= 4; i++) {
        //     for(int j = 1 ; j <= i; j++) {
        //         System.out.print("*");
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }


        // inverted pyramid
        // * * * *
        // * * *
        // * *
        // *

        // for(int i = 4; i >= 1; i--) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }



        // inverted pyramid (rotated by 180 deg)
        //       *
        //     * *
        //   * * *
        // * * * *

        // for(int i = 1; i <= 4; i++) {
        //     for(int j = 4-i; j >= 1; j--) {
        //         System.out.print(" ");
        //     }

        //     for(int k = 1; k <= i; k++) {
        //         System.out.print("*");
        //     }
            
        //     System.out.println();
        // }



        // half pyramid with numbers
        // 1
        // 1 2
        // 1 2 3 
        // 1 2 3 4
        
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }





        // inverted half pyramid with numbers
        // 1 2 3 4
        // 1 2 3 
        // 1 2
        // 1

        // for(int i = 4; i >= 1; i--) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }




        // floyd's triangle
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10

        // int num = 1;
        // for(int i = 1; i <= 4; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }




        // 0-1 triangle
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        // for(int i = 1; i <= 5; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         if((i+j) % 2 == 0) {
        //             System.out.print("1 ");
        //         }

        //         else {
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

    }
}
