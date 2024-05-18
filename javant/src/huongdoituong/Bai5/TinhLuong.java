package huongdoituong.Bai5;

class TinhLuong {
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double soNgayCong;
    private double tienLuong;
    private String chucVu;
    private double thuNhap;
    private double tienThuong;
    private double phuCap;

    public TinhLuong(int maNV, String hoTen, double luongCoBan, double soNgayCong, String chucVu) {
        this.maNV = "NV" + String.format("%02d", maNV);
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }

    public TinhLuong() {
    }

    public void tinhTienLuong() {
        this.tienLuong = this.luongCoBan * this.soNgayCong;
    }

    public void tinhTienThuong() {
        double tienthuong = 0;
        double ngaycong = this.soNgayCong;
        double tienluong = this.tienLuong;
        if (ngaycong >= 25) tienthuong = 0.2 * tienluong;
        else if (ngaycong >= 22) tienthuong = 0.1 * tienluong;
        this.tienThuong = tienthuong;
    }

    public void tinhPhuCap() {
        String chucvu = this.chucVu;
        double phuCap = 0;
        if (chucvu.equals("GD")) phuCap = 250000;
        if (chucvu.equals("PGD")) phuCap = 200000;
        if (chucvu.equals("TP")) phuCap = 180000;
        if (chucvu.equals("NV")) phuCap = 150000;
        this.phuCap = phuCap;
    }

    public void tinhThuNhap() {
        this.thuNhap = this.tienLuong + this.tienThuong + this.phuCap;
    }


    @Override
    public String toString() {
        return this.maNV + " " + this.hoTen + " " + this.tienLuong + " " + this.tienThuong + " " + this.phuCap + " " + this.thuNhap;
    }
}
