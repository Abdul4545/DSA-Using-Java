package OOPS.Interfaces;

public class Car implements Engine, Brake, Media {

    int price = 9800000;

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

}
