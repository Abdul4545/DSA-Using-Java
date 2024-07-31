import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int age = sc.nextInt();
        // if(age < 10) {
        //     System.out.println("Age is less than 10");
        // }
        // else{
        //     System.out.println("Age is greater than or equal to 10");
        // }

        int x = sc.nextInt();
        if(x % 2 == 0) {
            System.out.println("Even Number");
        }

        else {
            System.out.println("Odd Number");
        }

        // Switch statement

        // switch (x) {
        //     case 1:
        //         System.out.println("1 pressed");
        //         break;

        //     case 2:
        //         System.out.println("2 pressed");
        //         break;

        //     case 3:
        //         System.out.println("3 pressed");
        //         break;

        //     case 4:
        //         System.out.println("4 pressed");
        //         break;
        
        //     default:
        //         System.out.println("number greater than 4 or less than 1 pressed");
        // }


        sc.close();
    }
}
