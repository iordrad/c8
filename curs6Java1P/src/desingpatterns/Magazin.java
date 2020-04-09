package desingpatterns;

public class Magazin {
    private String nume;
    //inner static -> thread-safe
    private Magazin(){}
    private static class MagazinHolder{
        private static final Magazin instance = new Magazin();
    }
    public static Magazin getInstance(){
        return MagazinHolder.instance;
    }
}
