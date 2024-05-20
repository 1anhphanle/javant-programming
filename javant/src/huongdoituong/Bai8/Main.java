package huongdoituong.Bai8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = input.nextInt();
        }

        IntSet set1 = new IntSet(a);
        IntSet set2 = new IntSet(b);
        IntSet set3 = set1.union(set2);
        System.out.println(set3);
    }
}

