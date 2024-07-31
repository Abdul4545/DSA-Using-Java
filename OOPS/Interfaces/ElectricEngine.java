package OOPS.Interfaces;

public class ElectricEngine implements Engine {

    @Override
    public void accelerate() {
        System.out.println("I accelerate very smoothly without making any noise");
        
    }

    @Override
    public void start() {
        System.out.println("I indicate green light on screen when I get turn On ");
        
    }

    @Override
    public void stop() {
        System.out.println("I simply switch off the green light");
        
    }

}
