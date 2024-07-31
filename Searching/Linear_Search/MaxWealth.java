package Searching.Linear_Search;

public class MaxWealth {

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{3,2,1}};
        
        int ans = maximumWealth(arr);
        System.out.println();
        System.out.println(ans);        
    }

    static int maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if(sum > max) {
                max = sum;
            }
        }

        return max;
        
    }

}
