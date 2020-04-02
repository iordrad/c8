package recapitulare_firedeexecutie;

public class Exemplu2 {
    public static void main(String[] args) {
        new Thread(
                ()-> {
                    for (int i = 1; i < 20; i += 2) {
                        System.out.println(i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        ).start();
    }
}
