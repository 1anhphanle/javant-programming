package huongdoituong.Bai6;

public class KQTuyenSinh {
    private String maSV;
    private String hoTen;
    private String khuVuc;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double diemUuTien;
    private double tongDiem;
    private String ketQua;

    public KQTuyenSinh(String maSV, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void timKhuVuc() {
        StringBuilder sb = new StringBuilder(this.maSV);
        String khuvuc = sb.substring(0, 3);
        this.khuVuc = khuvuc;
    }

    public void tinhDiemUuTien() {
        double diemuutien = this.diemUuTien;
        if (this.khuVuc.equals("KV1")) diemuutien = 0.5;
        if (this.khuVuc.equals("KV2")) diemuutien = 1.0;
        if (this.khuVuc.equals("KV3")) diemuutien = 2.5;
        this.diemUuTien = diemuutien;
    }

    public void tinhTongDiem() {
        this.tongDiem = this.diemHoa + this.diemToan + this.diemLy + this.diemUuTien;
    }

    public void ketQua() {
        String ketqua = "";
        double tongdiem = this.tongDiem;
        if (this.tongDiem >= 24) ketqua = "TRUNG TUYEN";
        else ketqua = "TRUOT";
        this.ketQua = ketqua;
    }

    @Override
    public String toString() {
        return this.maSV + " " + this.hoTen + " " + this.khuVuc + " " + this.tongDiem + " " + this.ketQua;
    }
}
