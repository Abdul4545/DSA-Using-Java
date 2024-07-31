package Stacks;

import java.util.Stack;

public class RemoveConsecutiveSequences {

    public static int[] remove(int arr[]) {

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++) {

            if(st.size() == 0 || st.peek() != arr[i]) {
                st.push(arr[i]);
            }

            else if(arr[i] == st.peek()) {
                
                if(i == arr.length - 1 || arr[i] != arr[i+1]) {
                    st.pop();
                }
                
            }
        }

        int size = st.size();
        int ans[] = new int[size];

        for(int i = size - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;

    }

    public static void main(String[] args) {

        int arr[] = {1,2,2,2,3,4,5,6,6,7,10,10,10,1};

        int[] res = remove(arr);

        for (int i : res) {
            System.out.print(i + " ");
        }
        
    }
    
}
