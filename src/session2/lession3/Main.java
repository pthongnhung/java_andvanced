package session2.lession3;

public class Main {
    public static void main(String[] args) {
        User user=new User("12345678");

        System.out.println(user.isAuthenticated());

        String encrypted=Authenticatable.encrypt("123456");
        System.out.println(encrypted);

    }
}
