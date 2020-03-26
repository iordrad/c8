package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu16 {
    public static void main(String[] args) {
        List<Produs> list = List.of(
                new Produs("ciocolata", "dulciuri", 5.6, 100),
                new Produs("caiet", "birotica", 9.2, 86),
                new Produs("calculator", "tehnologie", 2900, 12),
                new Produs("pix", "birotica", 1.2, 56),
                new Produs("napolitane", "dulciuri", 7.8, 6)
        );
        Map<Boolean,List<Produs>> map = list.stream()
                .collect(Collectors.partitioningBy(p->p.pret>5));
        System.out.println(map);
    }
}
