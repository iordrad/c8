package main;

import java.nio.file.Path;
import java.nio.file.Paths;

//Normalizare = aducerea la cea mai simpla forma a caii, prin eliminarea a tot ceea ce este redundant
public class Ex9 {

        public static void main(String [] args){
            Path p1 = Paths.get("A/B/C/./../../././X/Y/Z/../../Q/W/./E");
            Path p2 = p1.normalize();
            System.out.println(p2);

           /* A/X/Q/W/E */

        }
}


