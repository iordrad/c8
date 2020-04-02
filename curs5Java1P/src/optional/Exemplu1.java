package optional;

import java.util.Optional;

public class Exemplu1 {
    public static void main(String[] args) {

        Optional<String> o1 = Optional.empty();
        Optional<String> o2 = Optional.of("Buna");//aici nu accepta
        Optional<String> o3 = Optional.ofNullable("buna");//aici accepta si null

        System.out.println(o1.isPresent());
        System.out.println(o2.isPresent());
        o2.ifPresent(System.out::println);
        o2.filter(s->s.length()%2==0).ifPresent(System.out::println);
        //daca o2 contine un sir de lungime para, il afisez
        o2.map(s->s.length()).ifPresent(System.out::println);
        //mapez optional in alt optional=>Optional<String> -> Optional<Integer>
        String v = o2.orElse("word");
        //daca am continut in optional -> il ia pe acela, daca am cutia goala -> o sa iau in considerare parametrul dat metodei
        System.out.println(v);
    }
}
