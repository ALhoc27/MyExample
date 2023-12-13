package example;

public class Calculator {
    public static int plus(int first, int second) {
        System.out.println(second + first);
        return first + second;
    }

    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
    }
}
