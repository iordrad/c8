package main;

import java.io.Serializable;

public class Produs implements Serializable {
    public static final long serialVersionUID=2;
    String denumire;
    double pret;
    transient String categorie;
    String culoare;

    public Produs() {
    }

    public Produs(String categorie) {
        this.categorie = categorie;
    }

    public Produs(String denumire, double pret, String categorie) {
        this.denumire = denumire;
        this.pret = pret;
        this.categorie = categorie;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", categorie='" + categorie + '\'' +
                '}';
    }
}
