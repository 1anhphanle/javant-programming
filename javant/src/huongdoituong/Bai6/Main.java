package huongdoituong.Bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KQTuyenSinh kqTuyenSinh = new KQTuyenSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        kqTuyenSinh.timKhuVuc();
        kqTuyenSinh.tinhDiemUuTien();
        kqTuyenSinh.tinhTongDiem();
        kqTuyenSinh.ketQua();
        System.out.println(kqTuyenSinh);
    }
}
