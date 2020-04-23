package jdbccon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost/numeBazaData";
        //dupa fiecare protocol de pune :
        String user = "root";
        String pass = "";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);//obtin conexiunea la baza de date
            Statement stmt = con.createStatement();//o sa fac interogari pe baza conexiunii obtinute
            String sql = "INSERT INTO numetabela VALUES(NULL,'Radu','Iordache')";//ce vreau sa fac cu baza mea de date -> adaugam o noua inregistrare in tabela
            stmt.execute(sql);//execut interogarea
            System.out.println("Persoana a fost adaugata!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
