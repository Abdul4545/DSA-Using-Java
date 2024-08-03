package OOPS.Generics;
import java.util.Arrays;
import java.util.List;


// here T should either be Number or its subclasses
class WildCardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    
    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {

    }

    public void add(T val) {
        if(isFull()) {
            resize();
        }

        data[size++] = val;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in temp array from data array
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove() {
        @SuppressWarnings("unchecked")
        T removed = (T)data[size--];
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }


    public static void main(String[] args) {

        WildCardExample<Number> list1 = new WildCardExample<>();
    
        list1.add(1);
        list1.add(2);
        list1.add(3);
        for (int i = 0; i < 14; i++) {
            list1.add(2.2f * i);
        }
    
        System.out.println(list1);
    }

}
