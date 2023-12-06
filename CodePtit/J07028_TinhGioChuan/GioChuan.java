package CodePtit.J07028_TinhGioChuan;

public class GioChuan {
    private String maGV,maMH;
    private double gioChuan;

    public GioChuan(String maGV, String maMH, double gioChuan) {
        this.maGV = maGV;
        this.maMH = maMH;
        this.gioChuan = 0;
    }

    public String getMaGV() {
        return maGV;
    }
    public void themGio(double gio){
        gioChuan += gio;
    }
    public String getMaMH() {
        return maMH;
    }

    public double getGioChuan() {
        return gioChuan;
    }
}
