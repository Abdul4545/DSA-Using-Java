package OOPS.Inheritance;

// inheriting the Base_Class using extents keyword
public class Box_Weight extends Base_Class {

    int weight;

    public Box_Weight() {
        this.weight = -1;
        // this.length = 10;

        System.out.println(super.height);
    }

    Box_Weight(int l, int h, int w, int weight) {
        super(l,h,w); // call the parent class constructor
        // used to initialize values present in parent class

        // this.weight = weight;
        
    }


    Box_Weight(int w) {
        this.weight = w;
    }
    
}
