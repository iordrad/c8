package designpatterns;

public class ListenerImpl implements Listener {
    @Override
    public void sendMessage(){
        System.out.println("Trimite mesaj de notificare pe fb...");
    }
}
