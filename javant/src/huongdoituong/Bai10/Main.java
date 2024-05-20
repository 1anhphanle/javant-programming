package huongdoituong.Bai10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordSet s1 = new WordSet(sc.nextLine());
        WordSet s2 = new WordSet(sc.nextLine());

        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}