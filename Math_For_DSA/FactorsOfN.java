package Math_For_DSA;

import java.util.ArrayList;

public class FactorsOfN {

    // Complexity : O(n)
    // static void factors(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         if(n % i == 0) {
    //             System.out.print(i + " ");
    //         }
            
    //     }
    // }

    // Complexity : O(sqrt(n))
    static void factors(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(n / i == i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
            
        }
    }

    
    // Complexity for both time and space is : O(sqrt(n))
    static void factorsInSortedOrder(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(n / i == i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            } 
        }
        for(int i = list.size() - 1; i>= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        factors(20);
        System.out.println();
        factors(36);
        System.out.println();

        factorsInSortedOrder(20);
        System.out.println();
        factorsInSortedOrder(36);
    }

}
