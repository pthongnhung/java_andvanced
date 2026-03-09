package session2.lession4;

public class User {
    private String userName;

    public User() {
        this.userName="defaultUser";
    }

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
