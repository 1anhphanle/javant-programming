package huongdoituong.Bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThuNhap thuNhap = new ThuNhap(sc.nextLine(), sc.nextLine(), sc.nextDouble());
        thuNhap.xuLyMaNgach();
        thuNhap.tinhPhuCap();
        thuNhap.tinhTongLuong();
        System.out.println(thuNhap);
    }
}
