package main;

public class Produs {
    String nume;
    String categorie;
    double pret;
    int stoc;

    public Produs(String nume, String categorie, double pret, int stoc) {
        this.nume = nume;
        this.categorie = categorie;
        this.pret = pret;
        this.stoc = stoc;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", categorie='" + categorie + '\'' +
                ", pret=" + pret +
                ", stoc=" + stoc +
                '}';
    }
}
