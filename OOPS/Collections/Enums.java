package OOPS.Collections;

public class Enums {

    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
        // these are enum constants
        // every single item here is public, static and final 
        // since its final you can not create child enums
        // tupe is week
        

        Week() {
            System.out.println("Constructor is called for "+ this);
        }

        // this constructor is not public or protected, only private or default 
        // why ?  because we don't want to create new objects
        // this is not the concept of enums, that is why

        // internally : public static final Week Monday = new Week();


        // enums can implement interfaces as many as you want
        @Override
        public void greeting() {
            System.out.println("Assalamualaikum");
        }

    }


    public static void main(String[] args) {

        Week day;

        day = Week.Monday;

        day.greeting();

        System.out.println(Week.valueOf("Friday"));

        // System.out.println(day);

        // System.out.println(day.ordinal());


        // for(Week values : Week.values()) {
        //     System.out.println(values);
        // }

    }
    
}
