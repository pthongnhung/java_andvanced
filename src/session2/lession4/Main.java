package session2.lession4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Nhung"));
        users.add(new User("Hong"));
        users.add(new User("Huyen"));

        Function<User,String> getUserName = User::getUserName;

        Consumer<String> print = System.out::println;
        for(User user:users){
            String name = getUserName.apply(user);
            print.accept(name);
        }

        Supplier<User> createUser= User::new;

        User newUser = createUser.get();
        System.out.println(newUser.getUserName());
    }
}
