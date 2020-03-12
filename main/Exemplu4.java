package main;

/*
Sa se realizeze o aplicatie utilitara cu urmatoarele comenzi pe care le vom primi de la tastatura.
    createFile numeCale
          0        1
    createDirectory numeCale
    delete numeCale
    list ->afiseaza in consola continutul unui folder(adica ce fisiere contine)
         ->file.list()->intoarce o lista de String-uri reprezentand denumirile fisierelor continute
         ->String [] fileNames = file.list()
         ->iterati prin ea
         ->file.listFiles()->intoarce tot o lista, dar va contine instante de File
    exit ->parasim aplicatia
"default"->comanda invalida
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemplu4 {
    public static void main(String[] args) {
        try(InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(reader);
        ){
            String line="";
            while(true){
                line = in.readLine();
                String [] v = line.split("\\s+");
                File file = null;
                switch(v[0]){
                    case "createFile":
                        file = new File(v[1]);
                        file.createNewFile();
                        break;
                    case "createDirectory":
                        file = new File(v[1]);
                        file.mkdir();
                        //mkdirs()->care creeaza mai multe foldere
                        break;
                    case "delete":
                        file = new File(v[1]);
                        file.delete();
                        break;
                    case "list":
                        file = new File(v[1]);
                        String [] fileNames = file.list();
                        for(String fileName:fileNames){
                            System.out.println(fileName);
                        }
                        break;
                    case "exit":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Comanda invalida");

                }
            }

        }catch(IOException e){

            e.printStackTrace();
        }
    }
}
