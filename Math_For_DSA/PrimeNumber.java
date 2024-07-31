package Math_For_DSA;

public class PrimeNumber {

    static boolean isPrime(int n) {
        
        // Method 1 : Complexity O(n)
        // if(n == 2) return true;
        // for (int i = 2; i < (n+1)/2; i++) {
        //     if(n % i == 0) {
        //         return false;
        //     }
        // }

        // Method 2 : Complexity O(sqrt(n))
        int c = 2;
        while (c * c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }

        return true;
    }

    // prime numbers till n : Complexity O(N * log(log N))

    // false in array means number is prime
    static void prime(boolean primes[], int n) {
        for(int i = 2; i*1 <= n; i++) {
            if(!primes[i]) {
                for (int j = i*2; j <= n; j = j+i) {
                    primes[j] = true;
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            if(!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }



    public static void main(String[] args) {
        // System.out.println(isPrime(23));
        // System.out.println(isPrime(6));
        // System.out.println(isPrime(2));

        // all primes till n
        for(int i = 2; i <= 40; i++) {
            boolean ans = isPrime(i);
            if(ans) {
                System.out.print(i +" ");
            }
        }

        // all primes till n
        int n = 40;
        boolean primes[] = new boolean[n+1]; // n is included
        prime(primes, n);
    }


}
