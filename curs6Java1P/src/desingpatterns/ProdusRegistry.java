package desingpatterns;

import java.util.HashMap;
import java.util.Map;

//Registry Pattern = singleton extins
//pot sa creez doar o instanta per tip -> una din fiecare categorie
// o instanta de dulce si o instanta de sarat
public class ProdusRegistry {
    public static enum ProdusType{
        DULCE, SARAT
    }
    private static Map<ProdusType,Produs> registry = new HashMap<>();
    public static Produs getInstance(ProdusType type){
        if(!registry.containsKey(type)){
            registry.put(type,new Produs());
        }
        return registry.get(type);
    }
}
