public class VarArgs {

    public static void main(String[] args) {

        sum(1,2,3,4,4,5,6);
        
    }


    static void sum(int ...v) {
        int sum = 0;
        for (int i : v) {
            sum = sum + i;
        }

        System.out.println(sum);
    }

    // variable length argument should be at the end
    static void product(int a, int b, int ...v) {

    }
    
}
