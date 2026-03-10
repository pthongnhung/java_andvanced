package session3.lession3;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        Optional<User> userOptional = repo.findUserByUserName("alice");
        System.out.println(
                userOptional.map(user -> "welcome "+user.username())
                        .orElse("Gues login")
        );
    }
}
