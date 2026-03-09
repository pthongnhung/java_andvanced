package session2.lession3;

public interface Authenticatable {
    String getPassWord();
    default boolean isAuthenticated(){
        return getPassWord()!=null && !getPassWord().isEmpty();
    }
    static String encrypt(String rawPassword){
        return "encrypted_"+rawPassword;
    }
}
