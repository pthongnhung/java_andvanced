package session1.lession6;

import java.io.IOException;

public class UserService {

    public static void saveToFile(User user) throws IOException {

        System.out.println("Đang lưu thông tin người dùng...");

        // giả lập lỗi ghi file
        throw new IOException("Lỗi khi ghi dữ liệu vào file!");
    }

    public static void processUserData(User user) throws IOException {

        saveToFile(user);
    }
}