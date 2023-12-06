package KiemTraGiuaKy.BaiTap4;

public class GiangVien {

    private String maGiangVien;
    private String tenGV;

    public GiangVien(String maGiangVien, String tenGV) {
        this.maGiangVien = maGiangVien;
        this.tenGV = tenGV;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }
}
