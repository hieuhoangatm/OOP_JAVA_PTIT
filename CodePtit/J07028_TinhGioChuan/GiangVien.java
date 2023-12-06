package CodePtit.J07028_TinhGioChuan;

public class GiangVien {
    private String maGV,tenGV;
    private  double gioChuan;

    public GiangVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.gioChuan = 0;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setGioChuan(double gio){
        gioChuan += gio;
    }

    public double getGioChuan() {
        return gioChuan;
    }

    public String getTenGV() {
        return tenGV;
    }

}
