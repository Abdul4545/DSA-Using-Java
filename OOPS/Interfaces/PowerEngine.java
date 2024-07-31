package OOPS.Interfaces;

public class PowerEngine implements Engine {

    @Override
    public void accelerate() {
        System.out.println("I accelerate very easily");
        
    }

    @Override
    public void start() {
        System.out.println("I do not start without the key");
        
    }

    @Override
    public void stop() {
        System.out.println("I stop when you take out the key");
        
    }

}
