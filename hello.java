public class hello {

    static int count(int n, int k, int nums[]) {
        int count = 0;

        int i = 0;
        int j = n-1;

        while (i <= j) {
            if(nums[i] + nums[j] <= k) {
                count += (j-i+1);
                i++;
            }

            else {
                j--;
            }
        }

        return count;
    }


    static int prade(String str) {
        int i;
        int c = 0;

        for (i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'I' && c <= 1) {
                c = c + 1;
            }

            if(c == 2) {
                break;
            }
        }

        int j = str.length() - 1;

        while (j > i) {
            if(str.charAt(j) == 'I') {
                break;
            }
            j--;  
        }

        return (j - i + 1);
    }



    public static void print(int n) {

        System.out.println(n);
        print(2);
    }


    public static void main(String[] args) {
        // System.out.println("hello");
        // print(1);

        // int n = 16;
        // int count = 1;
        // for(int i = 1; i <= n; i++) {
        //     for(int j = 0; j < Math.sqrt(n); j++) {
        //         System.out.println("Hello" + count++);
        //     }
        // }

        // int arr[] = {1,2,3,4,5};

        // System.out.println(count(5, 10, arr));

        // System.out.println(prade("IFFFIFFFF"));
        // System.out.println(prade("FFFFFFF"));
        // System.out.println(prade("FFFIFIFFFFI"));
        // System.out.println(prade("FFFIFIFFIFF"));
        // System.out.println(prade("I"));
        // System.out.println(prade("IIIII"));
    }
}
