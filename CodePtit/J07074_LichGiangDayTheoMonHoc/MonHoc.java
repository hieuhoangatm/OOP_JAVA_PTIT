package CodePtit.J07074_LichGiangDayTheoMonHoc;

public class MonHoc {
    private String id;
    private String tenMonHoc;
    private int soTinChi;

    public MonHoc(String id, String tenMonHoc, int soTinChi) {
        this.id = id;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
}
