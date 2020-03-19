package main;

public class Exemplu5 {
    public static void main(String[] args) {
        Predicat p1 = (x)->true;
        Predicat p2 = x->x%2==0;
        System.out.println(p1.test(10));
        System.out.println(p2.test(11));
        Predicat p3 = x->{
            System.out.println("BAU!");
            return x%2!=0;
        };
        Predicat p4 = x->myTest(x);
        Predicat p5 = Exemplu5::myTest;

    }
    private static boolean myTest(int x){
        System.out.println("BOOM");
        return x%2!=0;
    }
}
