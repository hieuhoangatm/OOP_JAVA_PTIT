package CodePtit.J07020_HoaDon2;

public class KhachHang {
    private String maKhachHang;
    private String tenKH;
    private String gioiTinh;
    private String date;
    private String diaChi;

    public KhachHang(int maKhachHang, String tenKH, String gioiTinh, String date, String diaChi) {
        this.maKhachHang = "KH"+String.format("%03d",maKhachHang);
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.date = date;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDate() {
        return date;
    }

    public String getDiaChi() {
        return diaChi;
    }
}
