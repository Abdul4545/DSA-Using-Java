package Searching.Linear_Search;

public class EvenDigits {

    public static void main(String[] args) {

        int arr[] = {12, 345, 5678, 21, 6, 4, 567};
        int result = findNumbers(arr);
        System.out.println();
        System.out.println(result);
        
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if(even(num)) {
                count++;
            }  
        }
        return count;
    }

    static boolean even(int num) {
        // int numberOfDigits = digits(num);
        // if(numberOfDigits % 2 == 0) {
        //     return true;
        // } 
        // return false;

        int numberOfDigits = digits2(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {

        int count = 0;
        if(num < 0) {
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }

        while(num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }

    static int digits2(int num) {
        if(num < 0) {
            num = num * -1;
        }

        return (int)(Math.log10(num)) + 1;
    }
}
