package session2.lession6;

import session2.lession6.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("nhung");

        UserProcessor processor = UserUtils::convertToUpperCase;
         String result = processor.process(user);
        System.out.println(result);
    }
}
