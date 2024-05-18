package huongdoituong.Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        Rectange rectange = new Rectange(a, b, s);

        rectange.chuanHoaMau();
        if (rectange.getHeight() > 0 && rectange.getWidth() > 0) {
            System.out.println(rectange);
        }
    }
}
