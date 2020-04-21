package designpatterns;

import java.util.ArrayList;
import java.util.List;

public class UserProfile {
    List<Listener> listeners = new ArrayList<>();
    public void addPhoto(){
        System.out.println("Foto de profil adaugata...");
        notifyListeners();

    }
    public void addListener(Listener l){
        listeners.add(l);
    }
    public void removeListener(Listener l){
        listeners.remove(l);
    }
    public void notifyListeners(){
        for(Listener l:listeners){
            l.sendMessage();
        }
    }
}
