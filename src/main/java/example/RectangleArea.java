package example;

public class RectangleArea {
    public static double square(double p, double k) {
        return ((p / (k + 1)) / 2) * k * (p / (k + 1)) / 2;
    }

    public static void main(String[] args) {
        System.out.println(RectangleArea.square(6, 2));
    }
}
