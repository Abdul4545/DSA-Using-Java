package OOPS.enumExamples;

public class Basic {

    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // These are enum constants ---> public, static and final
        // since it is final we can not create child enums
        // type of these is week

        Week() {
            System.out.println("Constructor called for " + this);
        }
        // this is not public or protected, only private or default

        @Override
        public void hello() {
            System.out.println("I am implemented from interface");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();

        System.out.println(Week.valueOf("Friday"));

        // System.out.println(week);

        // for (Week day : Week.values()) {
        //     System.out.println(day);
        // }

        // System.out.println(week.ordinal());

    }

}
