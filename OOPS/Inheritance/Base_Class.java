package OOPS.Inheritance;

public class Base_Class {

    private int length;
    int height;
    int width;

    
    Base_Class() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
        
    }
    
    // cube
    
    Base_Class(int side) {
        this.length = side;
        this.height = side;
        this.width = side;

        System.out.println("Volume of Cube is : " + side*side*side);
    }

    
    Base_Class(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }
    
    Base_Class(Base_Class old) {
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information() {
        System.out.println("Running the Base_Class");
    }
}
