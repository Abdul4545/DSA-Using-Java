package OOPS.Interfaces;

public class Car implements Engine, Brake, Media {

    int price = 980000;

    @Override
    public void accelerate() {
        System.out.println("I accelerate very early after starting"); 
    }

    @Override
    public void start() {
        System.out.println("I start by making very less sound");
    }

    @Override
    public void stop() {
        System.out.println("I stop like normal cars");   
    }

    @Override
    public void brake() {
        System.out.println("My brakes are very strong");   
    }

    @Override
    public void mediaStart() {
        System.out.println("I start by simply by long press of red button");  
    }

    @Override
    public void mediaStop() {
        System.out.println("I stop by simply by long press of green button"); 
    }

    

}
