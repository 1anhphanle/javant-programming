package huongdoituong.Bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Số bộ test

        for (int i = 0; i < T; i++) {
            int num1 = scanner.nextInt();
            int den1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int den2 = scanner.nextInt();

            PhanSo A = new PhanSo(num1, den1);
            PhanSo B = new PhanSo(num2, den2);

            // Thực hiện phép tính C = (A + B)^2
            PhanSo C = A.add(B).square();
            C.simplify();

            // Thực hiện phép tính D = A * B * C
            PhanSo D = A.multiply(B).multiply(C);
            D.simplify();

            System.out.println(C + " " + D);
        }
    }
}
