import java.util.*;

public class ArrayIntermediate2 {

    static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            i++;
            j--;
        }
    }

    // rotate an array by k steps where k is non negative and k can be greater than array length
    
    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for(int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }


    static void reverse(int[] arr, int start, int end)
	{
		int i = start;
		int j = end;
		int temp;
		while(i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
            i++;
            j--;
		}
	}

    static void rotateArrayInPlace(int arr[], int k) {
        int i = 0;
		int n = arr.length;
        k = k % n;

		reverse(arr, i, n-k-1);
		reverse(arr, n-k, n-1);
		reverse(arr, 0, n-1);
    }



    static int[] makeFrequencyArray(int[] arr) {

        int maxElement = Arrays.stream(arr).max().orElse(0);
        int[] freq = new int[maxElement+1];
        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        return freq;
    } 


    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int array1[] = {1,2,3,4,5};
        // int array2[] = {1,2,3,4,5,6};

        reverseArray(array1);
        // reverseArray(array2);
        // System.out.println("Arrays after reversing");
        // printArray(array1);
        // printArray(array2);

        // Rotate an array by k steps

        // int ans[] =  rotateArray(array2, 103);
        // printArray(ans);

        // rotateArrayInPlace(array1, 4);
        // printArray(array1);

        int arr[] = {1,2,5,7,9};

        int[] freq = makeFrequencyArray(arr);

        System.out.println("enter number of queries :");
        int q = sc.nextInt();

        while(q > 0) {

            System.out.println("Enter number to be searched : ");
            int x = sc.nextInt();

            if(freq[x] > 0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

            q--;
        }

        sc.close();

 
    }
}
