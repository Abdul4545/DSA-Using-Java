package OOPS;

public class Introduction {

    public static void main(String[] args) {


        // constructor without parameters
        // Student s1 = new Student();
        // s1.name = "Abdul Moid";
        // s1.Marks = 88.96f;
        // System.out.println(s1.name);
        // System.out.println(s1.Marks);
        // s1.changeName("asaad");
        // System.out.println(s1.name);

        // s1.greeting();

        Student s1 = new Student();
        s1.name = "Abdul Moid";
        System.out.println(s1.RollNo);

        Student s2 = new Student(10, "Asaad", 80);

        System.out.println(s2.name);



        // Constructor with paramether
        // Student s2 = new Student(23, "Abdul Moid", 56.67f);
        // System.out.println(s2.RollNo +" " + s2.name + " " +  s2.Marks);

        // Student random = new Student(s1);

        // System.out.println(random.RollNo +" " + random.name + " " +  random.Marks);

        // Student random2 = new Student();
        // System.out.println(random2.RollNo +" " + random2.name + " " +  random2.Marks);


        // Student one = new Student();
        // Student two = one;

        // one.name = "something";
        // System.out.println(two.name);

        // two.name = "new name";
        // System.out.println(one.name);

        // System.out.println(one);

    }    
}


// it is a logical construct it does not occupy space in the memory
class Student {
    int RollNo;
    String name;
    float Marks;


    // constructor without parameters
    // special type of function in a class it runs when we create object, return type is class

    Student() {

        // this is how you call a constructor from another constructor

        this(13,"default", 78.5f);

        // internally it is something like this
        // Student(13,"default", 78.5f);
    }
    
    void greeting() {
        System.out.println("My Name is "+name);
    }


    Student(int Roll, String naam, float Marks) {
        RollNo = Roll; 
        // Assign the parameter RollNo to the instance variable RollNo
        name = naam;
        this.Marks = Marks;
    }


    // constructor with parameters
    // Student(int RollNo, String naam, float Marks) {
    //     this.RollNo = RollNo; 
    //     // Assign the parameter RollNo to the instance variable RollNo
    //     this.name = naam;
    //     this.Marks = Marks;
    // }

    void changeName(String name) {
        this.name = name;
    }

    Student (Student other) {
        this.RollNo = other.RollNo;
        this.name = other.name;
        this.Marks = other.Marks;
    }

}
   

