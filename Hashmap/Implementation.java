package Hashmap;

import java.util.LinkedList;

public class Implementation {

    static class MyHashMap<K,V> {

        public static final int DEFAULT_CAPACITY = 4;
        public static final Float DEFAULT_LOAD_FACTOR = 0.75F;


        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // the number of entries in map

        private LinkedList<Node>[] buckets;


        private void initBucket(int N) {
            // N - capacity/size of buckets array

            buckets = new LinkedList[N];

            for(int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            
        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc))% buckets.length;
        }

        
        public MyHashMap() {

            initBucket(DEFAULT_CAPACITY);

        }

        private int searchInBucket(LinkedList<Node> ll, K key) {

            for(int i = 0; i < ll.size(); i++) {
                
            }
            
        }

        

        public int size() {
            // return the no of entries in map

            return 0;
        }

        public void put(K key, V value) {
            // insert/update
            int bi = HashFunc(key);

            LinkedList<Node> currentBucket = buckets[bi];

            int ei = searchInBucket(currentBucket ,key);

        }

        


        // public V get(K key) {

        // }



        // public V remove(K value) {

        // }

    }


    public static void main(String[] args) {

        MyHashMap<String, Integer> mp = new MyHashMap<>();
        
    }

}
