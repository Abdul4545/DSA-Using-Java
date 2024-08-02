package OOPS.Inheritance;

// inheriting the Base_Class using extents keyword
public class Box_Weight extends Base_Class_Box {

    int weight;

    public Box_Weight() {
        this.weight = -1;
        this.length = 10;

        // System.out.println(super.height);
    }

    Box_Weight(int l, int h, int w, int weight) {
        // super(l,h,w); 
        // callS the parent class constructor
        // used to initialize values present in parent class

        // this.weight = weight;

        // this.weight = weight;
        // super(l,h,w);
        // child class cares what parent class contains, so it asks the parent to initialize it first 
        // the above 2 line of code will give error ass we have initialized child class variable first

        
    }


    Box_Weight(int w) {
        this.weight = w;
    }
    
}
