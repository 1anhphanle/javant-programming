package kythuatlaptrinh.lythuyetso;

public class Solution2 {
    //#014
    public static void soChinhPhuong(int n) {
        int can = (int) Math.sqrt(n);
        if (can * can == n) System.out.println("YES");
        else System.out.println("NO");
    }

    //#015
    public static void soChinhPhuong2(int a, int b) {
        int canA = (int) Math.sqrt(a);
        int canB = (int) Math.sqrt(b);
        if (canA * canA < a) canA++;
        for (int i = canA; i <= canB; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }

    //#016
    public static void soThuanNgto(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isNgto(i) && check(i)) cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean isNgto(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean check(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            if (!isNgto(r)) return false;
            sum += r;
            n /= 10;
        }
        return isNgto(sum);
    }

    //#017
    public static int soLocPhat(int n) {
        boolean check = true;
        while (n != 0) {
            int r = n % 10;
            if (r != 0 && r != 6 && r != 8) check = false;
            n /= 10;
        }
        if (check) return 1;
        else return 0;
    }

    //#018
    public static int uocNgtoNhoNhat(int n) {
        if (n < 2) return n;
        if (n % 2 == 0) return 2;
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return i;
        }
        return n;
    }

    public static void uocNguyenToNhoNhat(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(uocNgtoNhoNhat(i));
        }
    }

    //#019
    public static void phanTichThuaSoNgto(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int cnt = 0;
                while (n % i == 0) {
                    cnt++;
                    n /= i;
                }
                System.out.print(i + "^" + cnt);
                if (n != 1) System.out.print("*");
            }
        }
        if (n != 1) System.out.print(n + "^1");
        System.out.println();
    }

    //#020
    public static boolean isSphenic(int number) {
        int n = number;
        int count = 0;
        int product = 1;

        for (int i = 2; count < 3 && i * i <= number; ++i) {
            if (number % i == 0) {
                count++;
                product *= i;
                while (number % i == 0) {
                    number /= i;
                }
            }
        }
        if (number > 1) {
            count++;
            product *= number;
        }
        return count == 3 && product == n;
    }

    public static int soSphenic(int n) {
        if (isSphenic(n)) {
            return 1;
        }
        return 0;
    }

    //#021
    public static int tongChuSo(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int tongThuaSoNgto(int n) {
        int sum = 0;
        if (n < 2) return n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    sum += tongChuSo(i);
                    n /= i;
                }
            }
        }
        if (n != 1) sum += tongChuSo(n);
        return sum;
    }

    public static int soSmith(int n) {
        if (isNgto(n)) return 0;
        if (tongChuSo(n) != tongThuaSoNgto(n)) return 0;
        return 1;
    }

    //#022
    public static int uocNgtoLonNhat(int n) {
        int maxVal = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                maxVal = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n != 0 && maxVal < n) maxVal = n;
        return maxVal;
    }

    //#023
    public static boolean BPNT(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && isNgto(i) && n % (i * i) == 0) return true;
        }
        return false;
    }

    public static void binhPhuongNgto(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (BPNT(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    //#024
    public static int UCLN(int a, int b) {
        if (a == 0 || b == 0) return a + b;
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int UCLN2(int a, int b) {
        if (a == 0 || b == 0) return a + b;
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

    public static int BCNN(int a, int b) {
        return a / UCLN(a, b) * b;
    }

    //#025
    public static int nCk(int n, int k) {
        int res = 1;
        for (int i = 0; i <= k - 1; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static int nAk(int n, int k) {
        int res = 1;
        for (int i = 0; i <= k - 1; i++) {
            res *= (n - i);
        }
        return res;
    }

    //#026
    public static long fibo(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        long fn1 = 0, fn2 = 1, fn = 0;
        for (int i = 3; i <= n; i++) {
            fn = fn1 + fn2;
            fn %= 1000000007;
            fn1 = fn2;
            fn2 = fn;
        }
        return fn % 1000000007;
    }//#027

    public static int factPrime(int n, int p) {
        int ans = 0;
        for (int i = p; i <= n; i += p) {
            int temp = i;
            while (temp % p == 0) {
                ++ans;
                temp /= p;
            }
        }
        return ans;
    }

    public static int factPrime2(int n, int p) {
        int ans = 0;
        for (int i = p; i <= n; i *= p) {
            ans += n / i;
        }
        return ans;
    }

    //#028
    public static int soLuongUoc(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;
                if (i != n / i) cnt++;
            }
        }
        return cnt;
    }

    //#30
    public static int soLuongSo0(int n) {
        return factPrime2(n, 5);
    }

    public static void main(String[] args) {
        soChinhPhuong(17);
        soChinhPhuong2(9, 19);
        soThuanNgto(2345, 6789);
        System.out.println(soLocPhat(60806));
        uocNguyenToNhoNhat(6);
        phanTichThuaSoNgto(20);
        System.out.println(soSphenic(30));// dap an bi sai
        System.out.println(soSmith(666));
        System.out.println(uocNgtoLonNhat(15));
        binhPhuongNgto(3, 49);
        System.out.println(fibo(7));
        System.out.println(factPrime(9, 3));
        System.out.println(soLuongUoc(12));
        System.out.println(soLuongSo0(10));
    }
}
