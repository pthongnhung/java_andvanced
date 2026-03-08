package session1.lession6;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User();

        try {

            System.out.print("Nhập tên người dùng: ");
            String name = scanner.nextLine();

            user.setName(name);

            if (user.getName() != null) {
                System.out.println("Tên người dùng: " + user.getName());
            }

            System.out.print("Nhập năm sinh: ");
            String input = scanner.nextLine();

            int birthYear = Integer.parseInt(input);

            int age = 2026 - birthYear;

            user.setAge(age);

            System.out.println("Tuổi của bạn: " + user.getAge());

            System.out.print("Nhập tổng số người dùng: ");
            int totalUsers = scanner.nextInt();

            System.out.print("Nhập số nhóm muốn chia: ");
            int numberOfGroups = scanner.nextInt();

            int usersPerGroup = totalUsers / numberOfGroups;

            System.out.println("Mỗi nhóm có: " + usersPerGroup + " người");

            UserService.processUserData(user);

        }
        catch (NumberFormatException e) {

            Logger.logError("Bạn phải nhập số hợp lệ!");

        }
        catch (ArithmeticException e) {

            Logger.logError("Không thể chia cho 0!");

        }
        catch (InvalidAgeException e) {

            Logger.logError(e.getMessage());

        }
        catch (IOException e) {

            Logger.logError("Lỗi hệ thống khi ghi file: " + e.getMessage());

        }
        finally {

            scanner.close();

            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }

        System.out.println("Chương trình vẫn tiếp tục chạy...");
    }
}