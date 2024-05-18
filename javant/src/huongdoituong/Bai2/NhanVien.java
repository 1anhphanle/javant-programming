package huongdoituong.Bai2;

class NhanVien {
    private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maST, ngayKy;

    public NhanVien() {
    }

    public NhanVien(int maNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maST, String ngayKy) {
        this.maNV = String.format("%05d", maNV);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maST = maST;
        this.ngayKy = ngayKy;
    }

    public void chuanHoaTen() {
        String[] arr = this.hoTen.split("\\s+");
        String newName = "";
        for (String x :
                arr) {
            newName += Character.toUpperCase(x.charAt(0));
            for (int j = 1; j < x.length(); j++) {
                newName += Character.toLowerCase(x.charAt(j));
            }
            newName += " ";
        }
        this.hoTen = newName.trim();
    }

    public void chuanHoaNgay() {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();

        StringBuilder sb2 = new StringBuilder(this.ngayKy);
        if (sb2.charAt(1) == '/') sb2.insert(0, "0");
        if (sb2.charAt(4) == '/') sb2.insert(3, "0");
        this.ngayKy = sb2.toString();
    }

    @Override
    public String toString() {
        return this.maNV + " " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh + " " + this.diaChi + " " + this.maST + " " + this.ngayKy;
    }
}

