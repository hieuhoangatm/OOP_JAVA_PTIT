package CodePtit.J07074_LichGiangDayTheoMonHoc;

public class LopHoc implements Comparable<LopHoc> {
    private String maNhom;
    private String maMon;
    private int ngayGiangDay;
    private int kipHoc;
    private String tenGiangVien;
    private String phongHoc;

    public LopHoc( int maNhom,String maMon, int ngayGiangDay, int kipHoc, String tenGiangVien, String phongHoc) {
        this.maNhom = "HP"+String.format("%03d",maNhom);
        this.maMon = maMon;
        this.ngayGiangDay = ngayGiangDay;
        this.kipHoc = kipHoc;
        this.tenGiangVien = tenGiangVien;
        this.phongHoc = phongHoc;
    }

    @Override
    public int compareTo(LopHoc o) {
        if(this.ngayGiangDay != o.ngayGiangDay){
            return Integer.compare(ngayGiangDay,o.ngayGiangDay);
        }
        else{
            if(this.kipHoc!=o.kipHoc){
                return  Integer.compare(kipHoc,o.kipHoc);
            }
            else return this.tenGiangVien.compareTo(o.tenGiangVien);
        }
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public int getNgayGiangDay() {
        return ngayGiangDay;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public void setNgayGiangDay(int ngayGiangDay) {
        this.ngayGiangDay = ngayGiangDay;
    }

    public int getKipHoc() {
        return kipHoc;
    }

    public void setKipHoc(int kipHoc) {
        this.kipHoc = kipHoc;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }
}
