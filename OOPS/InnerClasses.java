package OOPS;




// the outer class can not be static -> only inner classes can be static
public class InnerClasses {


    // when we make this class as static then it does not require the objects of the outher class 
    //as static members are independent of the class object
    
    static class Test {
       String name;
    
        public Test(String name) {
           this.name = name;
        }

        @Override 
        public String toString() {
            return name;
        }
    }
    

    public static void main(String[] args) {
        
        Test a = new Test("Abdul");
        Test b = new Test("Asaad");

        System.out.println(a.name + " " + b.name);

        System.out.println(a);

    }
    
}

