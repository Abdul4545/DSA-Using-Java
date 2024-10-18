import java.util.*;
import java.util.LinkedList;

public class BinaryNumbers {
    
    public static void generate(int n) {
        Queue<String> q = new LinkedList<>();
        
        q.add("1");
        
        System.out.println("Binary numbers from 1 to "+n + " are:");
        
        for(int i = 1; i <= n; i++) {
            String current = q.poll();
            System.out.println(current);
            
            q.add(current + "0");
            q.add(current + "1");    
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        generate(n);

        sc.close();
    }
}
