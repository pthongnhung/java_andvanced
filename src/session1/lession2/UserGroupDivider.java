package session1.lession2;

import java.util.Scanner;

public class UserGroupDivider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhap tong so nguoi dung: ");
            int totalUsers = sc.nextInt();

            System.out.print("Nhap so nhom muon chia: ");
            int numberOfGroups = sc.nextInt();

            int usersPerGroup = totalUsers / numberOfGroups;
            System.out.println("Moi nhom co: "+usersPerGroup+ " nguoi");
        }
        catch (ArithmeticException e){
            System.out.println("Khong the chia cho 0");
        }
        System.out.println("Chuong trinh van tiep tuc chay");
        sc.close();
    }
}
