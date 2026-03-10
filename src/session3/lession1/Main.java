package session3.lession1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public record User(String userName, String email, String status) {
    }
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("alice","alice@gmail.com","ACTIVE"),
                new User("bob","bob@gmail.com","INACTIVE"),
                new User("charlie","charlie@gmail.com","ACTIVE")
        );
        users.forEach(user ->
                System.out.println(user.userName() + " - " + user.email() + " - " + user.status())
        );
    }
}
