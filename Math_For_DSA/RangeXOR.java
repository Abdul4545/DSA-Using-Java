package Math_For_DSA;

public class RangeXOR {

    public static void main(String[] args) {
        // Range XOR for a, b = XOR(b) ^ XOR(a-1)

        int a = 3;
        int b = 347;

        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);

        // Method 2
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }

        System.out.println(ans2);
    }


    // This gives XOR from 0 to a
    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }

        if (a % 4 == 1) {
            return 1;
        }

        if (a % 4 == 2) {
            return a + 1;
        }

        return 0;

    }

}
