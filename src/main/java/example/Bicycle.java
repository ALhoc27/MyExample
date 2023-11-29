package example;

public class Bicycle {
    private String model;
    private int weight;

    private int seatPostDiameter; // добавили переменную

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter; // добавили ее в конструктор
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public class HandleBar {

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {
            System.out.println("Руль влево!");
        }
    }

    public class Seat {

        public void up() {
            System.out.println("Сиденье поднято выше!");
        }

        public void down() {
            System.out.println("Сиденье опущено ниже!");
        }

        public void getSeatParam() {
// из класса Seat, получили доступ к переменной 'seatPostDiameter' класса Bicycle
            System.out.println("Диаметр подседельного штыря = "
                    + Bicycle.this.seatPostDiameter);
        }
    }

    public static void main(String[] args) {

        Bicycle peugeot = new Bicycle("Peugeot", 120, 12);
        Bicycle.HandleBar handleBar = peugeot.new HandleBar();
        Bicycle.Seat seat = peugeot.new Seat();

        seat.up();
        peugeot.start();
        handleBar.left();
        handleBar.right();
    }
}
