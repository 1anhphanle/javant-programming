package huongdoituong.Bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.nextLine();
        String d = sc.nextLine();
        TinhLuong tinhLuong = new TinhLuong(1, a, b, c, d);
        tinhLuong.tinhTienLuong();
        tinhLuong.tinhTienThuong();
        tinhLuong.tinhPhuCap();
        tinhLuong.tinhThuNhap();
        System.out.println(tinhLuong);
    }
}
