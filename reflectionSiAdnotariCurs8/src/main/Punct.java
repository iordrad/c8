package main;

public class Punct {
    @Valoare(value = 5)
    private int x;
    @Valoare(7)
    private int y;
    private Punct(){}
    private void afisare(){
        System.out.println(x+" "+y);
    }
}
