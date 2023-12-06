package CodePtit.J07075_LichGiangDayTheoGiangVien;

public class MonHoc {
    private String maMon;
    private String tenMH;
    private String soTinChi;

    public MonHoc(String maMon, String tenMH, String soTinChi) {
        this.maMon = maMon;
        this.tenMH = tenMH;
        this.soTinChi = soTinChi;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getSoTinChi() {
        return soTinChi;
    }
}
