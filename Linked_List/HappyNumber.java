package Linked_List;

// https://leetcode.com/problems/happy-number/description/
public class HappyNumber {

    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast)); 
            // finding square 2 times means moving 2 steps ahead as we move in list
        } while(slow != fast);

        if(slow == 1) {
            return true;
        }

        return false;
    }

    static int findSquare(int n) {
        int ans = 0;
        while(n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n = n / 10;
        }
        return ans; 
    }


    public static void main(String[] args) {
        boolean ans1 = isHappy(12);
        System.out.println(ans1);

        boolean ans2 = isHappy(19);
        System.out.println(ans2);
    }
    
}
