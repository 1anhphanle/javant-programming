package huongdoituong.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            SinhVien sinhVien = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            sinhVien.chuanHoaTen();
            sinhVien.chuanHoaNgaySinh();
            arr.add(sinhVien);
        }
        double maxGPA = 0;
        for (SinhVien x : arr) {
            maxGPA = Math.max(maxGPA, x.getGpa());
        }
        for (SinhVien x : arr) {
            if (x.getGpa() == maxGPA) System.out.println(x);
        }
    }
}
