package designpatterns;

public class Exemplu2 {
    public static void main(String[] args) {

        UserProfile userProfile = new UserProfile();
        userProfile.addListener(new ListenerImpl());
        userProfile.addListener(new ListenerImpl2());
        userProfile.addPhoto();
    }
}
