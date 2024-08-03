package OOPS.Interfaces;

public class CDPlayer implements Media{

    @Override
    public void mediaStart() {
        System.out.println("I start playing when you long press the button"); 
    }

    @Override
    public void mediaStop() {
        System.out.println("I stop playing by a simple press");   
    }

}
