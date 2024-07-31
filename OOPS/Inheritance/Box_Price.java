package OOPS.Inheritance;

public class Box_Price extends Box_Weight {


    double cost;

    Box_Price () {
        super();
        this.cost = -1;
    }

    
    Box_Price(Box_Price other) {
        // super(other);
        this.cost = other.cost;
    }


    public Box_Price(int l, int h, int w, int weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }


}
