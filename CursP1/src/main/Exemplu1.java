package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Sa se citeasca de la tastaura un sir de caractere si sa il afisam de la dreapta la stanga, cu o operatie cunoscuta.
public class Exemplu1 {
    public static void main(String[] args) {//psvm
        try(InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(in);
        ){
            String line = cons.readLine();
            StringBuilder sb = new StringBuilder(line);
            sb.reverse();
            System.out.println(sb);//sout
        }catch(IOException e){
            e.printStackTrace();//printeaza stack-ul exceptiei= linia la care apare, numele si mesajul cu care a fosat construit
        }
    }
}
/**
 * System.in = fluxul low-level de intrare
 * InputStreamReader = modalitatea de citire byte cu byte (sau FileReader -> face citire char cu char)
   BufferedReader = fluxul high-level(cu buffer integrat) cu care imbrac fluxul low-level pt a avea date inteligibile
 */