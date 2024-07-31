package OOPS.Interfaces;

public class Main {

    public static void main(String[] args) {

        // Car car1 = new Car();
        // car1.start();
        // car1.accelerate();
        // car1.brake();
        // car1.stop();
        // System.out.println(car1.price);


        // Engine car2 = new Car();
        // car2.accelerate();
        // car2.start();
        // here we are accessing functions defined in the car class

        // what thing to access depends on this -> Engine car2
        // what version of thing to access depends on -> new Car();

        // can not be accessed
        // car2.price; 

        // Media carMedia = new Car();
        // carMedia.stop();

        NiceCar car3 = new NiceCar();

        car3.start();
        car3.startAudio();
        car3.stop();
        System.out.println();
        
        car3.upgradeEngine();
        car3.start();
        car3.stop();
 
    }
}
