package main;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.Month;

//LocalDate
public class Exempu2 {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2020, 10, 23);
        LocalDate d3 = LocalDate.of(2020, Month.OCTOBER, 20);
        //LocalDate d4 = LocalDate.of(2017, 15, 41);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
       // System.out.println(d4);
        //2020-10-23
    }
}
