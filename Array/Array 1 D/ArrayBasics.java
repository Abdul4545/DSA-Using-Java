import java.util.*;

class ArrayBasics {

    public static int SearchElement(int element, int[] arr) {
            for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] == element) {
                return i;
            }
        }
        return -1;
    }


    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    static int numberOfOccurances(int element , int[] arr) {
        int occurance = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                occurance++;
            }
        }
        return occurance;

    }

    static int lastOccurance(int element, int[] arr) {
       int lastOccuranceIndex = -1;

       for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                lastOccuranceIndex = i;
            }
       }
       return lastOccuranceIndex;
    }

    static boolean sortedArray(int[] arr) {
        boolean check = true;
        for(int i = 1 ; i < arr.length-1; i++) {
            if(arr[i] < arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    static int[] smallestAndLargestElement(int[] arr) {
        // build in function for sorting array
        Arrays.sort(arr);

        int[] ans = {arr[0], arr[arr.length-1]};

        return ans;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // array declaration and initialization

        int arr1[] = new int[4];
        arr1[0] = 12;
        arr1[1] = 34;
        arr1[2] = 45;
        arr1[3] = 56;

        double height[] = {12.10, 34.6, 56.7};

        // accessing array element
        // System.out.println(arr1[2]);
        // System.out.println(height[2]);
        // System.out.println();

        // accessing using for loop
        // for(int i = 0; i < height.length; i++) {
        //     System.out.println(height[i]);
        // }

        // accessing using for each loop and printing all elements of array not partial
        // for (double d : height) {
        //     System.out.println(d);   
        // }

        // accessing using while loop
        // int i = 0;
        // while(i < height.length) {
        //     System.out.println(height[i]);
        //     i++;
        // }

        

        // 2-d Array declaration
        int [][] multiArray1 = new int[2][4];
        multiArray1[0][0] = 4;
        multiArray1[0][1] = 5;
        multiArray1[0][2] = 6;
        multiArray1[0][3] = 7;
        multiArray1[1][0] = 8;
        multiArray1[1][1] = 1;
        multiArray1[1][2] = 2;
        multiArray1[1][3] = 3;
        
        // System.out.println(multiArray1[1][2]);

        for(int[] a: multiArray1) {
            System.out.println(Arrays.toString(a));
        }

        int[][] multiArray = {{1,2}, {3,4}, {5,6}}; 
        // System.out.println(multiArray[2][1]);

        // for (int outer[] : multiArray) {
        //     for (int inner : outer) {
        //         System.out.print(inner + " ");
        //     } 
        // }

        // que) Sum of array elements
        // int ans = 0;
        // for(int i = 0; i < arr1.length; i++) {
        //     ans = ans + arr1[i];
        // }
        // System.out.println(ans);

        // 2nd way
        // int ans = 0;
        // for ( int element : arr1) {
        //     ans = ans + element;  
        // }
        // System.out.println(ans);



        // que) find the max element from the array

        // int arr2[] = {12, 34, 45, 19, 32};
        // int max = arr2[0];
        // for(int i = 1; i < arr2.length; i++) {
        //     if(arr2[i] > max) {
        //         max = arr2[i];
        //     }
        // }
        // System.out.println(max);

        // que) Search the given element in the array . If present then return thr index else return -1

        // int arr2[] = {12, 34, 45, 19, 32, 19};
        // System.out.println(SearchElement(19, arr2));
        // System.out.println(SearchElement(29, arr2));


        // taking array inputs from user

        // int size;
        // System.out.println("Enter the size of the array :");
        // size = sc.nextInt();
        // int array1[] = new int[size];

        // System.out.println("Enter the array elements here :");
        // for(int i = 0; i < size; i++) {
        //     array1[i] =  sc.nextInt();
        // }


        // System.out.print("Original Array elements are :");
        // printArray(array1);
        // System.out.println();



        // array references in java
        // trying to copy array1 to array2 
        // it is a wrong way of doing it as new memory is not allocated 
        // int[] array2 = array1;
        // System.out.print("Copied array elements are :");
        // printArray(array2); 
        // System.out.println();

        // changing values in copied array it is changing the values in array1
        // array2[0] = 0;
        // array2[1] = 0;
        // System.out.print("Copied array elements are after chages :");
        // printArray(array2);
        // System.out.println();

        // System.out.print("Original Array elements are :");
        // printArray(array1);


        // it is better to use clone method or Arrays.copyOf(array, array.lenght)
        // int[] array3 = array1.clone();
        // int[] array3 = Arrays.copyOf(array1, array1.length);
        // int[] array4 = Arrays.copyOfRange(array1, 1, array1.length);


        // array3[0] = 0;
        // array3[1] = 0;
        // System.out.print("Copied array elements after changes are :");
        // printArray(array3);
        // System.out.println();

        // System.out.print("Original Array elements are :");
        // printArray(array1);



        // que) Count the number of occurances of a particular element X

        int[] arr3 = {1, 2, 3, 4, 5, 6, 2, 4, 8, 9, 4};
        // System.out.println(numberOfOccurances(4, arr3));
        // System.out.println(numberOfOccurances(10, arr3));


        // que) find the last occurance of element X
        // System.out.println(lastOccurance(4, arr3));
        // System.out.println(lastOccurance(10, arr3));
        // System.out.println(lastOccurance(2, arr3));


        // que) check whether an array is sorted or not ?

        // int arr4[] = {2,3,4,7,9};
        // System.out.println(sortedArray(arr4));

        // int arr5[] = {2, 3, 4, 1, 7, 9};
        // System.out.println(sortedArray(arr5));

        // int arr6[] = {2, 2, 2, 2, 3};
        // System.out.println(sortedArray(arr6));


        // Que) return an array with Smallest and Largest element in some other array

        // int arr7[] = {2, 3, 4, 1, 7, 9};
        // System.out.println(arr7.length);
        // int[] ans = smallestAndLargestElement(arr7);
        // System.out.println(ans[0] + " " +ans[1]);

        sc.close();

    }
}