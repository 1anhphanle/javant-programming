package huongdoituong.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nhanVien = new NhanVien(1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        nhanVien.chuanHoaNgay();
        nhanVien.chuanHoaTen();
        System.out.println(nhanVien);
    }
}
