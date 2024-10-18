package Stacks;

// import java.util.Scanner;
// import java.util.Stack;

// public class BalancedBrackets {

//     static boolean isBalanced(String str) {

//         Stack <Character> st = new Stack<>();
//         int n = str.length();

//         for(int i = 0 ; i < n; i++) {
//             char ch = str.charAt(i);
//             if(ch == '(') {
//                 st.push('(');
//             }

//             else {
//                 if (st.size() == 0) {
//                     return false;
//                 }

//                 if(st.peek() == '(') {
//                     st.pop();
//                 }
//             }
//         }

//         if(st.size() > 0) {
//             return false;
//         }

//         return true;
//     }


    
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();


//         System.out.println(isBalanced(str));
//         sc.close();
        
//     }
// }




import java.util.*;

class BalancedBrackets {
    
    public static String isValidString(String str) {
        Stack<Character> stack = new Stack<>();
        
        for(char ch : str.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            
            else if(ch == ')' || ch == '}' || ch == ']') {
                if(stack.isEmpty()) {
                    return "Invalid String";
                }
                
                char top = stack.pop();
                
                if( (ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                        return "Invalid string";
                }
            }
        }
        
        return stack.isEmpty() ? "Valid string" : "Invalid string";
    } 
    
    
    public static void main(String amk[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println(isValidString(str));

        sc.close();
    }
}
