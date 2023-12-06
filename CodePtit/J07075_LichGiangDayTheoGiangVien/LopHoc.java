package CodePtit.J07075_LichGiangDayTheoGiangVien;

public class LopHoc implements Comparable<LopHoc>{
    private String maNhom;
    private String maMonHoc;
    private String ngayGiangDay;
    private String kipHoc;
    private String tenGV;
    private String phongHoc;

    public LopHoc(int maNhom, String maMonHoc, String ngayGiangDay, String kipHoc, String tenGV, String phongHoc) {
        this.maNhom = "HP" + String.format("%03d",maNhom);
        this.maMonHoc = maMonHoc;
        this.ngayGiangDay = ngayGiangDay;
        this.kipHoc = kipHoc;
        this.tenGV = tenGV;
        this.phongHoc = phongHoc;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getNgayGiangDay() {
        return ngayGiangDay;
    }

    public String getKipHoc() {
        return kipHoc;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    @Override
    public int compareTo(LopHoc o) {
        if(!this.ngayGiangDay.equals(o.ngayGiangDay))
            return this.ngayGiangDay.compareTo(o.ngayGiangDay);
        if(!this.kipHoc.equals(o.kipHoc))
            return this.kipHoc.compareTo(o.kipHoc);
        return this.tenGV.compareTo(o.tenGV);
    }
}
