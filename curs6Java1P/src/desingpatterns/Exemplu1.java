package desingpatterns;

public class Exemplu1 {
    public static void main(String[] args) {
        Robot r1 = new Robot.Builder().setMaterial("aluminiu").build();
        Robot r2 = new Robot.Builder()
                            .setMaterial("titan")
                            .setGreutate(1400)
                            .setDefect(true)
                            .build();
    }
}
