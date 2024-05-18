package huongdoituong.Bai1;

public class SinhVien {
    private String maSo, hoTen, lop, ngaySinh;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(int maSo, String hoTen, String lop, String ngaySinh, double gpa) {
        this.maSo = "SV" + String.format("%03d", maSo);
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void chuanHoaTen() {
        String[] a = this.hoTen.split("\\s++");
        String newName = "";
        for (String x : a) {
            newName += Character.toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++) {
                newName += Character.toLowerCase(x.charAt(i));
            }
            newName += " ";
        }
        this.hoTen = newName.trim();//xoa khoang trang o dau va cuoi chuoi
    }

    public void chuanHoaNgaySinh() {
        StringBuilder sb = new StringBuilder(ngaySinh);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }

    @Override
    public String toString() {
        return this.maSo + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", this.gpa);
    }
}
