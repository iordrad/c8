package main;

import java.util.Locale;

public class Exemplu6 {
    public static void main(String[] args) {
        Locale loc1 = new Locale("en");
        Locale loc2 = new Locale("en","US");
        //en_CA
        //fr_CA
        Locale loc3 = new Locale.Builder()
                                .setLanguage("en")
                                .setRegion("US")
                                .build();
        Locale loc = Locale.GERMANY;
    }
}
