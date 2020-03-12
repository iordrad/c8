package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu6 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:/A/B/C/D/E");
        //getNameCount()->cate componente are calea
        //calea este indexata de la 0, fara root
        for(int i=0;i<p1.getNameCount();i++){
            System.out.println(p1.getName(i));
        }
        Path sp = p1.subpath(1,3);//[1,3) <-> [1,2]
        System.out.println(sp);
        //sp, care e instanta de Path are suprascris default toString-ul care e apelat automat
    }
}
