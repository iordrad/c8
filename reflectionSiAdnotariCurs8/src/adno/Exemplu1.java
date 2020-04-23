package adno;

public class Exemplu1 {
    //orice adnotare cand este folosita trb sa aibe toate proprietatile specificate
    @MyAnnotation(value="lume", other = 2, array = {3.14,2.7,9.8})
    int x;
    //in cazul in care o adnotare are o singura proprietate nespecificata si aceea se numeste value->o pot subintelege
     @MyAnnotation("lume")
    public static void main(String[] args) {

    }
}
