public class ExeptionThrowingExample {
    int exDefault;
    private int age = 12;
    int[] intArray;
    Index myClass;

    public static void main(String[] args) {
        var exampleInt1 = 10d; //литерал
        char ch1 = 0x0041;
        char ch2 = '\u0411';
        String str = "Строка";
        // Использование спецификаторов формата для вставки значений переменных в строку
        String name = "Alex";
        double salary = 2423.422d;
        String formattedString = String.format("Имя: %s, Зарплата: %.2f",
                name, salary);

        System.out.println(ch1);
        final int exampleInt = 10;
        Character q = 'w';
        String a1 = "11";
        int primitiveInt = 12;
        Integer a12 = Integer.valueOf(555);
        System.out.println(a12.getClass().getName() + " /" + a12);
        int a = 12, b, c = 10;
        String x = "старое значени  е";
        String y = x;
        x = "новое значение x";
        System.out.println(x); // новое значение x
        System.out.println(y); // старое значение

        Index x1 = new Index();
        Index x2 = x1;

        System.out.println(q.getClass().getName() + " /" + q);

        ExeptionThrowingExample exDefaultpP = new ExeptionThrowingExample();


        b = exDefaultpP.exDefault + 3;
        System.out.println("1111 = " + b);
        String[] seasons  = new String[] {"Winter", "Spring", "Summer", "Autumn"};
        System.out.println("wew  " + exDefaultpP.intArray);

        int i = 12;
        //byte b = (byte)i; //b = 12, i = 12
        System.out.println(b); //b = 12

        try {
            someMethod();
        } catch (CustomException e) {
            System.out.println("Произошлое дленеие на ноль в методе main");
        }
    }

    public static void someMethod() throws CustomException{
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Произошло деление на ноль в методе someMethod.");
            throw new CustomException("Ошибка", e);
        }

    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    static class CustomException extends RuntimeException {
        public CustomException(String msg, Throwable e) {
            super(msg, e);
        }
    }

    public void exampleString(String str) {

    }

}
