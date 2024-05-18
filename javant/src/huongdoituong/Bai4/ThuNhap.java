package huongdoituong.Bai4;

class ThuNhap {
    private String maNgach;
    private String hoTen;
    private double luongCoBan;
    private double bacLuong;
    private String chucVu;
    private double phuCap;
    private double tongLuong;

    public ThuNhap(String maNgach, String hoTen, double luongCoBan) {
        this.maNgach = maNgach;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }

    public ThuNhap() {
    }

    public void xuLyMaNgach() {
        StringBuilder sb = new StringBuilder(this.maNgach);
        String chucVu = sb.substring(0, 2);
        String bacLuong = sb.substring(2, 4);
        this.chucVu = chucVu;
        this.bacLuong = Double.parseDouble(bacLuong);
    }

    public void tinhPhuCap() {
        String chucvu = this.chucVu;
        if (chucvu.equals("HT")) this.phuCap = 2000000;
        if (chucvu.equals("HP")) this.phuCap = 900000;
        if (chucvu.equals("GV")) this.phuCap = 500000;
    }

    public void tinhTongLuong() {
        this.tongLuong = this.bacLuong * this.luongCoBan + this.phuCap;
    }

    @Override
    public String toString() {
        return this.maNgach + " " + this.hoTen + " " + this.bacLuong + " " + this.tongLuong;
    }
}
