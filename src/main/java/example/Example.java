package example;

public class Example <T, V>{
        private T obT;
        V obV;

        Example(T ob) {
        this.obT = ob;
    }

        T getOb(){
        System.out.println("ob = " + obT);
        return obT;
    }

        void setOb(T ob) {
        this.obT = ob;
        System.out.println("ob = " + ob);
    }

        void showType() {
        System.out.println("Тип Т является: " + obT.getClass().getName());
    }

    /*    Object iob;

    Example (Object iob) {
        this.iob = iob;
    }

    public Object getIob() {
        return iob;
    }

    public void setIob(Object iob) {
        this.iob = iob;
    }

    void showType () {
            System.out.println("Tипoм оЬ является " + iob.getClass() .getName());
        }*/
}
