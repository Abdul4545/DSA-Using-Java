package OOPS.Interfaces;

public class PowerEngine implements Engine {

    @Override
    public void accelerate() {
        System.out.println("Power engine accelerate");
    }

    @Override
    public void start() {
        System.out.println("Power engine start"); 
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");   
    }

}
