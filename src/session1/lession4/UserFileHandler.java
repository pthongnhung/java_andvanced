package session1.lession4;

import java.io.IOException;

public class UserFileHandler {
    public static void saveToFile() throws IOException{
        throw new IOException("Loi khi ghi du lieu vao file");
    }
    public static void processUserData() throws IOException{
        saveToFile();
    }

    public static void main(String[] args) {
        try{
            processUserData();
        }catch (IOException e){
            System.out.println("Da xay ra loi khi luu du lieu: "+e.getMessage());
        }
        System.out.println("Chuong trinh van tiep tuc chay...");
    }
}
