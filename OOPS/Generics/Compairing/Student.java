package OOPS.Generics.Compairing;

import java.util.Arrays;

public class Student implements Comparable<Student> {

    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        
        int diff = (int)(this.marks - o.marks);

        // if diff == 0 : means both are equal
        // if diff < 0 : means o is bigger else o is smaller

        return diff;


    }

    public static void main(String[] args) {
        Student moid = new Student(50, 80.7f);
        Student asaad = new Student(5, 83.9f);

        Student alfiya = new Student(10, 87.2f);
        Student zakiya = new Student(55, 78.2f);

        Student[] list = {moid, asaad, alfiya, zakiya};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        if(moid.compareTo(asaad) < 0) {
            System.out.println(moid.compareTo(asaad));
            System.out.println("Asaad has more marks");
        }
    }

    

}
