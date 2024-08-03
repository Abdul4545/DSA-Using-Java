package OOPS.Cloning;

public class Human implements Cloneable {

    int age;
    String name;
    int[] arr;
    

    public Human(int age, String name) {
        this.age = age;
        this.name = name;

        // for non primitve data type i.e arr, string the clone will point to the original arr, it will not copy to new object using clone
        this.arr = new int[]{3,4,5,6,7,8};

    }


    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     // this is shallow copy
    //     return super.clone();
    // }


    @Override
    public Object clone() throws CloneNotSupportedException {
        // this is deep copy
        Human twin = (Human)super.clone(); // this is actually shallow copy

        // make a deep copy
        twin.arr = new int[twin.arr.length];
        for(int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        } 

        return twin;
    }
}
