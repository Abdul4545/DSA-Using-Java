package OOPS.Interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("I start playing when you long press the button"); 
    }

    @Override
    public void stop() {
        System.out.println("I stop playing by a simple press");   
    }

}
