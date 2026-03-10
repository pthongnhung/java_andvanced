package session3.lession4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("alice","alice@gmail.com","ACTIVE"),
                new User("bob","bob@gmail.com","ACTIVE"),
                new User("alice","alice2@gmail.com","INACTIVE"),
                new User("charlie","charlie@gmail.com","ACTIVE"),
                new User("bob","bob2@gmail.com","INACTIVE")
        );
        Set<String> seen = new HashSet<>();

        List<User> uniqueUsers = users.stream()
                .filter(user -> seen.add(user.username()))
                .collect(Collectors.toList());

        uniqueUsers.forEach(user ->
                System.out.println(user.username()+"-"+user.email()));
    }
}
