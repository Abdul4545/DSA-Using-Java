package OOPS.Inheritance;

public class Base_Class_Box {

    int length;
    // int length; can not be accessed from child class
    int height;
    int width;

    
    Base_Class_Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
        
    }
    
    // cube
    Base_Class_Box(int side) {
        this.length = side;
        this.height = side;
        this.width = side;

        System.out.println("Volume of Cube is : " + side*side*side);
    }

    // cuboid
    Base_Class_Box(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }
    

    Base_Class_Box(Base_Class_Box old) {
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information() {
        System.out.println("Running the Base_Class_Box");
    }
}
