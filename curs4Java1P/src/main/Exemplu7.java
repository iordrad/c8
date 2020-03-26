package main;

import java.util.Locale;
import java.util.ResourceBundle;

public class Exemplu7 {
    public static void main(String[] args) {
        Locale loc = new Locale("ro","RO");
        Locale loc1 = new Locale("de","DE");
        Locale loc2 = new Locale("fr","FR");
        Locale loc3 = Locale.ITALIAN;

        ResourceBundle bundle = ResourceBundle.getBundle("traduceri",loc);
        ResourceBundle bundle1 = ResourceBundle.getBundle("traduceri",loc1);
        ResourceBundle bundle2 = ResourceBundle.getBundle("traduceri",loc2);
        ResourceBundle bundle3 = ResourceBundle.getBundle("traduceri",loc3);

        String trad = bundle.getString("exit");
        String trad1 = bundle1.getString("intrare");
        String trad2 = bundle2.getString("iesire");
        String trad3 = bundle3.getString("iesire");

        System.out.println(trad);
        System.out.println(trad1);
        System.out.println(trad2);
        System.out.println(trad3);

    }
}
