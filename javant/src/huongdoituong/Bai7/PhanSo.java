package huongdoituong.Bai7;

class PhanSo {
    int tuSo;
    int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    // Tính tổng hai phân số
    public PhanSo add(PhanSo other) {
        int newtuSo = this.tuSo * other.mauSo + other.tuSo * this.mauSo;
        int newmauSo = this.mauSo * other.mauSo;
        return new PhanSo(newtuSo, newmauSo);
    }

    // Tính bình phương của phân số
    public PhanSo square() {
        int newtuSo = this.tuSo * this.tuSo;
        int newmauSo = this.mauSo * this.mauSo;
        return new PhanSo(newtuSo, newmauSo);
    }

    // Tính tích hai phân số
    public PhanSo multiply(PhanSo other) {
        int newtuSo = this.tuSo * other.tuSo;
        int newmauSo = this.mauSo * other.mauSo;
        return new PhanSo(newtuSo, newmauSo);
    }

    // Rút gọn phân số
    public void simplify() {
        int gcd = greatestCommonDivisor(this.tuSo, this.mauSo);
        this.tuSo /= gcd;
        this.mauSo /= gcd;
    }

    // Tìm ước chung lớn nhất
    private int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
