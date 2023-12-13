package example;

public class Converter {
    static float exchangeRate = 70f;

    public static float rubleToEuro(float value) { return value / exchangeRate; }

    public static float rubleToDollar(float value) {
        return value * exchangeRate;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
    }
}
