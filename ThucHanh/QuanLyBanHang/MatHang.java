package ThucHanh.QuanLyBanHang;

public class MatHang {
    private String maMatHang,tenMatHang,donViTinh;
    private int giaMua,giaBan;

    public MatHang(int maMatHang, String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        this.maMatHang = "MH"+String.format("%03d",maMatHang);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    public void setMaMatHang(String maMatHang) {
        this.maMatHang = maMatHang;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "maMatHang='" + maMatHang + '\'' +
                ", tenMatHang='" + tenMatHang + '\'' +
                ", donViTinh='" + donViTinh + '\'' +
                ", giaMua=" + giaMua +
                ", giaBan=" + giaBan +
                '}';
    }
}
