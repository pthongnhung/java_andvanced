package session3.lession5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("alexander", "a@gmail.com", "ACTIVE"),
                new User("bob", "b@gmail.com", "ACTIVE"),
                new User("charlotte", "c@gmail.com", "ACTIVE"),
                new User("david", "d@gmail.com", "ACTIVE"),
                new User("Benjamin", "e@gmail.com", "ACTIVE"),
                new User("tom", "f@gmail.com", "ACTIVE")
        );

        users.stream()
                .sorted(Comparator.comparingInt((User user) -> user.username().length()).reversed())
                .limit(3)
                .forEach(user -> System.out.println(user.username()));
    }
}
