package main;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//ZonedDateTime
public class Exemplu5 {
    public static void main(String[] args) {
        ZonedDateTime zdt1 = ZonedDateTime.now();
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(zdt1);
        System.out.println(zdt2);
    }
}
