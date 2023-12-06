package KiemTraGiuaKy.BaiTap4;

public class GioChuan {
    private String maGiangVIEN;
    private String maMonHOC;
    private double gioChuan;

    public GioChuan( String maGiangVIEN, String maMonHOC, double gioChuan) {
        this.maGiangVIEN = maGiangVIEN;
        this.maMonHOC = maMonHOC;
        this.gioChuan = gioChuan;
    }



    public String getMaGiangVIEN() {
        return maGiangVIEN;
    }

    public String getMaMonHOC() {
        return maMonHOC;
    }

    public double getGioChuan() {
        return gioChuan;
    }
}
