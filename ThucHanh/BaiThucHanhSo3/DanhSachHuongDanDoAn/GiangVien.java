package ThucHanh.BaiThucHanhSo3.DanhSachHuongDanDoAn;

public class GiangVien {
    private String tenGV;

    private String maSV;
    private String tenDoAn;

    public GiangVien(String tenGV, String maSV, String tenDoAn) {
        this.tenGV = tenGV;
        this.maSV = maSV;
        this.tenDoAn = tenDoAn;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }


    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenDoAn() {
        return tenDoAn;
    }

    public void setTenDoAn(String tenDoAn) {
        this.tenDoAn = tenDoAn;
    }
}
