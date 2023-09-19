package TestPeopleIQ;

public class MyTestPeopleIQ {
    private int iQPeople;
    private String name;

    public int getiQPeople() {
        return iQPeople;
    }

    public void setiQPeople(int iQPeople) {
        this.iQPeople = iQPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyTestPeopleIQ(int iQPeople, String name) {
        this.iQPeople = iQPeople;
        this.name = name;
    }


    public static void main(String[] args) {

        MyTestPeopleIQ chel1 = new MyTestPeopleIQ(23, "Stas");
        MyTestPeopleIQ chel2 = new MyTestPeopleIQ(34, "Miha");

       // MyTestPeopleIQ.compareTo()
    }
}
