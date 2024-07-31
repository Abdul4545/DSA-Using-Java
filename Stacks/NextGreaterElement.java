package Stacks;

import java.util.Stack;

public class NextGreaterElement {


    public static void nextGreater(int[] arr, int n) {	

		int res[] = new int[n];
		res[n-1] = -1;

		Stack<Integer> st = new Stack<>();

		st.push(arr[n-1]);

		for(int i = n - 2; i >= 0; i--) {

			while(st.size() > 0 && st.peek() < arr[i]) {
				st.pop();
			}


			if(st.size() == 0) {
				res[i] = -1;
			}

			else {
				res[i] = st.peek();
			}
			
			st.push(arr[i]);
		}

        for (int i : res) {
            System.out.print(i +" ");
        }
    }


    public static void main(String[] args) {
        
        int[] arr = {1,3,2,1,8,6,3,4};

        // int res[] = new int[arr.length]; 

        // for(int i = 0; i < arr.length; i++) {
        //     res[i] = -1;
        //     for(int j = i + 1; j < arr.length; j++) {
        //         if(arr[j] > arr[i]) {
        //             res[i] = arr[j];
        //             break;
        //         }
        //     }
        // }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        // for (int i : res) {
        //     System.out.print(i + " ");
        // }

        nextGreater(arr, arr.length);
    }



    
}