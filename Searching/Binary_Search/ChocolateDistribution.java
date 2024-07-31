package Searching.Binary_Search;

public class ChocolateDistribution {

    static boolean isDivisionPossible(int arr[], int n, int maxChocolateAllowed) {

        int numOfStudents = 1;
        int chocolate = 0; // no of chocolate current student has

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > maxChocolateAllowed) {
                return false;
            }

            if(chocolate + arr[i] <= maxChocolateAllowed) {
                chocolate += arr[i];
            }

            else {
                numOfStudents++;
                chocolate = arr[i];
            }
        }

        if(numOfStudents > n) {
            return false;
        }

        else {
            return true;
        }

    }

    static int distributeChocolate(int arr[], int n) {

        int ans = 0, start = 1, end = (int)1e9;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(isDivisionPossible(arr, n, mid)) {
                ans = mid;
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {

        int arr[] = {4,3,1,4,2};

        int n = 3;

        System.out.println(distributeChocolate(arr, n));

        
    }
}
