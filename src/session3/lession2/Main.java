package session3.lession2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public record User(String userName, String email, String status) {
    }
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("alice","alice@gmail.com","ACTIVE"),
                new User("bob","bob@yahoo.com","INACTIVE"),
                new User("charlie","charlie@gmail.com","ACTIVE")
        );
        users.stream()
                .filter(user->user.email.endsWith("@gmail.com"))
                .forEach(user -> System.out.println(user.userName()));
    }
}
