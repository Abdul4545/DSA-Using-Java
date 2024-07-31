package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumber {

    public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long res[] = new long[N-K+1];
        Queue <Integer> q = new LinkedList<>();
        
        // addding negative value's indices in queue
        for(int i = 0; i < N; i++) {
            if(A[i] < 0) {
                q.add(i);
            }
        }
        
        for(int i = 0; i < res.length; i++) {
            if(q.size() > 0 && q.peek() < i) {
                q.remove();
            }
            
            if(q.size() > 0 && q.peek() <= i+K-1) {
                res[i] = A[q.peek()];
            }
            
            else if(q.size() == 0) {
                res[i] = 0;
            }
            
            else {
                res[i] = 0;
            }
        }
        return res;
    }


    public static void main(String[] args) {

        long arr[] = {-1, 23, -40, 34, 42, -67, 87, 100, -99};

        long res[] = printFirstNegativeInteger(arr, 9, 3);

        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        } 
    }
}
