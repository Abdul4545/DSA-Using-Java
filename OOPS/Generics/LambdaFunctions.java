package OOPS.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arr.add(i);
        }

        // arr.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.print(item + " ");

        arr.forEach(fun);
        // body of abstract method ----> (a, b) -> a + b;
        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaFunctions calculator = new LambdaFunctions();

        System.out.println(calculator.operate(10, 20, sum));

        System.out.println(calculator.operate(10, 20, prod));

        System.out.println(calculator.operate(10, 20, sub));

    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    // normal function
    // int sum(int a, int b) {
    //     return a + b;
    // }
}

interface Operation {
    // abstract method
    int operation(int a, int b);
}
