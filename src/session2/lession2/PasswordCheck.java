package session2.lession2;

import java.util.function.Predicate;

public class PasswordCheck {
    public static void main(String[] args) {
        Predicate<String> checkPassWord = password->password.length()>=8;

        System.out.println(checkPassWord.test("1234"));
        System.out.println(checkPassWord.test("12345678"));
    }
}
