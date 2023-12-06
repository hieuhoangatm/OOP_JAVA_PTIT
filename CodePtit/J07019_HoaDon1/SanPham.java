package CodePtit.J07019_HoaDon1;



public class SanPham {
    private String maLoai;
    private String tenSanPham;
    private long donGiaLoai1;
    private long donGiaLoai2;

    public SanPham(String maLoai, String tenSanPham, long donGiaLoai1, long donGiaLoai2) {
        this.maLoai = maLoai;
        this.tenSanPham = tenSanPham;
        this.donGiaLoai1 = donGiaLoai1;
        this.donGiaLoai2 = donGiaLoai2;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public long getDonGiaLoai1() {
        return donGiaLoai1;
    }

    public void setDonGiaLoai1(long donGiaLoai1) {
        this.donGiaLoai1 = donGiaLoai1;
    }

    public long getDonGiaLoai2() {
        return donGiaLoai2;
    }

    public void setDonGiaLoai2(long donGiaLoai2) {
        this.donGiaLoai2 = donGiaLoai2;
    }
}
