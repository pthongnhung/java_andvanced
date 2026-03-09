package session2.lession3;

public class User implements Authenticatable {
    private String passWord;

    public User(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String getPassWord() {
        return passWord;
    }
}
