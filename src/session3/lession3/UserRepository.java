package session3.lession3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    List<User> users= Arrays.asList(
            new User("alice", "alice@gmail.com", "ACTIVE"),
            new User("bob", "bob@yahoo.com", "INACTIVE"),
            new User("charlie", "charlie@gmail.com", "ACTIVE")
    );

    Optional<User> findUserByUserName(String searchName){
        return users.stream()
                .filter(user->user.username().equals(searchName))
                .findFirst();

    }
}
