package kythuatlaptrinh.mang;

import java.util.Arrays;

public class Solution1 {
    //#031
    public static boolean[] prime = new boolean[10001];

    public static int sang() {
        int cnt = 0;
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i <= (int) Math.sqrt(1000); i++) {
            if (prime[i]) {
                //loai tat ca phan tu la boi cua i
                for (int j = i * i; j <= 1000; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i <= 1000; i++) {
            if (prime[i]) ++cnt;
        }
        return cnt;
    }

    //#032
    public static int demSoNhoNhat(int[] a) {
        int cnt = 1;
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                cnt = 1;
                min = a[i];
            } else if (a[i] == min) {
                cnt++;
            }
        }
        return cnt;
    }

    //#033
    public static void demSoCap(int[] a, int k) {
        int cnt = 0;
        int minCL = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == k - a[j]) cnt++;
                if (Math.abs(a[i] - a[j]) < minCL) minCL = Math.abs(a[i] - a[j]);
            }
        }
        System.out.println(cnt + " " + minCL);
    }

    //#034
    public static void lietKe(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j <= i - 1; j++) {
                if (a[i] == a[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //#035
    public static void lietKe2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j <= i - 1; j++) {
                if (a[i] == a[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                int cnt = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) cnt++;
                }
                System.out.println(a[i] + " " + cnt);
            }
        }
    }

    //#036
    public static void lietKe3(int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            int sumLeft = 0, sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += a[j];
            }
            for (int j = i + 1; j < a.length; j++) {
                sumRight += a[j];
            }
            if (isNgto(sumLeft) && isNgto(sumRight)) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static boolean isNgto(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    //#037
    public static boolean isFibo(int n) {
        return isChinhPhuong(5 * n * n + 4) || isChinhPhuong(5 * n * n - 4);
    }

    public static boolean isChinhPhuong(int n) {
        int can = (int) Math.sqrt(n);
        return can * can == n;
    }

    public static void lietKeFibo(int[] a) {
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            if (isFibo(a[i])) {
                System.out.println(a[i] + " " + i);
                check = true;
            }
        }
        if (!check) System.out.println("NONE");
    }

    //#038
    public static void viTri(int[] a) {
        int minPos = -1;
        int maxPos = -1;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= minVal) {
                minPos = i;
                minVal = a[i];
            }
            if (a[i] > maxVal) {
                maxPos = i;
                maxVal = a[i];
            }
        }
        System.out.println(minPos + " " + maxPos);
    }

    //#039
    public static void tongTich(int[] a) {
        int sum = 0;
        int tich = 1;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            sum = sum % 1000000007;
            tich *= a[i];
            tich = tich % 1000000007;
        }
        System.out.println(sum + " " + tich);
    }

    //#040
    public static int UCLN(int a, int b) {
        if (a == 0 || b == 0) return a + b;
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int UCLN(int[] a) {
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            res = UCLN(res, a[i]);
        }
        return res;
    }

    //#041
    public static void top2Max(int[] a) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int x : a) {
            if (x >= max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1) {
                max2 = x;
            }
        }
        System.out.println(max1 + " " + max2);
    }

    public static void top3Max(int[] a) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int x : a) {
            if (x >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x >= max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }
        }
        System.out.println(max1 + " " + max2 + " " + max3);
    }

    //#042
    public static boolean checkSymmetry(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkSymmetry2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[a.length - i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sang());
        int[] a = {1, 3, 1, 7, 1};
        System.out.println(demSoNhoNhat(a));
        int[] b = {1, 4, 7, 11, 42};
        demSoCap(b, 11);
        int[] c = {0, 0, 3, 3, 1, 4};
        lietKe(c);
        lietKe2(c);
        int[] d = {53, 5, 69, 47, 19};
        lietKe3(d);
        lietKeFibo(a);
        int[] e = {1, 2, 8, 7, 6, 4, 1, 8};
        viTri(e);
        tongTich(a);
        int[] f = {1, 8, 32, 6, 12};
        System.out.println(UCLN(e));
        top2Max(e);
        top3Max(e);
        System.out.println(checkSymmetry(f));
    }
}
