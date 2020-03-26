package main;

import java.time.*;
//LocalDateTime
public class Exemplu3 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2018, 12, 20, 10, 24);
        LocalDate d1 = LocalDate.of(1987,1,1);
        LocalTime t1 = LocalTime.of(12,45);
        LocalDateTime ldt3 = LocalDateTime.of(d1,t1);
        //2017-10-20T10:56

        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);

    }
}
