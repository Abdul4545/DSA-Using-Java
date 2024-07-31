package Hashmap;

import java.util.*;

public class ArrayFrequency {

    // que -> Given an array, find the most frequent element in it. If there are multiple elements that appear a maximum number of times, print any one of them

    static int maxFrequency(int arr[]) {

        // here Map is an interface and HashMap is a class
        Map<Integer, Integer> frequency = new HashMap<>();

        // for(int i = 0; i < arr.length; i++) {

        //     if(frequency.containsKey(arr[i])) {
        //         int f = frequency.get(arr[i]);
        //         f = f  + 1;
        //         frequency.put(arr[i], f);
                
        //     }

        //     else {
        //         frequency.put(arr[i], 1);
        //     }
        // }

        for (int element : arr) {

            if(frequency.containsKey(element)) {
                frequency.put(element, frequency.get(element) + 1);
            }

            else {
                frequency.put(element, 1);
            }
            
        }

        int max = 1;
        int anskey = -1;

        for (var i : frequency.entrySet()) {

            if(i.getValue() > max) {
                max = i.getValue();
                anskey = i.getKey();
            }
        }

        System.out.println(anskey);

        return max;
    }


    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 1, 2, 1, 5, 6 ,7, 8, 1, 2, 3, 1, 1};

        System.out.println(maxFrequency(arr));
        
    }

}
