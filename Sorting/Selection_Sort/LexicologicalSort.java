package Sorting.Selection_Sort;

public class LexicologicalSort {

    static void sortFruits(String[] arr) {

        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            int minIndex = i;

            for(int j = i+1; j < n; j++) {
                if(arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                } 
            }

            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }

    public static void main(String[] args) {
        
        String fruits[] = {"kiwi", "apple", "papaya", "orange", "banana", "mango"};

        sortFruits(fruits);

        for (String string : fruits) {
            System.out.print(string + " ");
        }
    }
    
}
