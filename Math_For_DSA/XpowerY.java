package Math_For_DSA;

public class XpowerY {
    // complexity : O(log(power))
    public static void main(String[] args) {
        int base = 2;
        int power = 6;
        int ans = 1;
        while (power > 0) {
            int lastDigit = power & 1;
            if (lastDigit == 1) {
                ans = ans * base;
            }
            base *= base;
            power = power >> 1;
        }

        System.out.println(ans);
    }

}
