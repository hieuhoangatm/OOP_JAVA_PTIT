package ThucHanh.QuanLyBanHang;

import java.util.ArrayList;

public class HoaDon {
    private String maHoaDon;
    private String maKH,maMH;
    private int soLuong;

    public HoaDon(int maHoaDon, String maKH, String maMH, int soLuong) {
        this.maHoaDon = "HD"+String.format("%03d",maHoaDon);
        this.maKH = maKH;
        this.maMH = maMH;
        this.soLuong = soLuong;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", maKH='" + maKH + '\'' +
                ", maMH='" + maMH + '\'' +
                ", soLuong=" + soLuong +
                '}';
    }
}
