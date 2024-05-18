package kythuatlaptrinh.lythuyetso;

public class Solution1 {
    //#001
    public static int isNgto(int n) {
        if (n < 2) return 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return 0;
        }
        return 1;
    }
    //#002

    public static int tongChuSo(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    //#003

    public static int tongChuSoChan(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            if (r % 2 == 0) {
                sum += r;
            }
            n /= 10;
        }
        return sum;
    }
    //#004

    public static int tongChuSoNgto(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            if (r == 2 || r == 3 || r == 5 || r == 7) {
                sum += r;
            }
            n /= 10;
        }
        return sum;
    }
    //#005

    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
    //#006

    public static int soLuongUocNgto(int n) {
        int cnt = 0;
        if (n < 2) return -1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        return cnt;
    }
    //#007

    public static int uocNgtoLonNhat(int n) {
        int uocMax = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                uocMax = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > uocMax) return n;
        else return uocMax;
    }
    //#008

    public static int tonTaiSo(int n) {
        int r = 6;
        while (n != 0) {
            if (n % 10 == r) return 1;
        }
        return 0;
    }
    //#009

    public static int check(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum % 8 == 0) return 1;
        else return 0;
    }
    //#010

    public static int tongGiaiThua(int n) {
        int sum = 0;
        while (n != 0) {
            sum += giaiThua(n % 10);
            n /= 10;
        }
        return sum;
    }

    private static int giaiThua(int m) {
        if (m == 0) return 1;
        int res = 1;
        for (int i = 1; i <= m; i++) {
            res *= i;
        }
        return res;
    }
    //#011

    public static int is_aaa(int n) {
        int r = n % 10;
        while (n != 0) {
            if (n % 10 != r) {
                return 0;
            }
            n /= 10;
        }
        return 1;
    }
    //#012

    public static int hangDonViMax(int n) {
        int r = n % 10;
        while (n != 0) {
            if (n % 10 > r) {
                return 0;
            }
            n /= 10;
        }
        return 1;
    }
    //#013

    public static int soLuongChuSo(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n /= 10;
        }
        return cnt;
    }

    public static int tongLuyThuaChuSo(int n) {
        int sum = 0;
        int soMu = soLuongChuSo(n);
        while (n != 0) {
            sum += (int) Math.pow(n % 10, soMu);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isNgto(11));
        System.out.println(tongChuSo(1345));
        System.out.println(tongChuSoChan(2151));
        System.out.println(tongChuSoNgto(154563));
        System.out.println(reverse(1565));
        System.out.println(soLuongUocNgto(150));
        System.out.println(uocNgtoLonNhat(42));
        System.out.println(tonTaiSo(23456));
        System.out.println(check(178));
        System.out.println(tongGiaiThua(123));
        System.out.println(is_aaa(3333333));
        System.out.println(hangDonViMax(109));
        System.out.println(tongLuyThuaChuSo(123));
    }
}
