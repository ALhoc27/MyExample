package example;

public class ArgMethod {
    public static void hello(String name, int age, int numberOf) {
        for (int i = 0; i <= numberOf; i++) System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        hello("alex", 12, 12);
    }
}
