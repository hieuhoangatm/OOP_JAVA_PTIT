package CodePtit.J07019_HoaDon1;

public class HoaDon {
    private String maHoaDon;
    private long soLuongMua;
    private long thanhTien;
    private long giamGia;
    private SanPham sp;
    private long tienPhaiTra;
    private static int cnt = 1;
    public HoaDon(String maHoaDon, long soLuongMua) {
        this.maHoaDon = maHoaDon + "-"+String.format("%03d",cnt++);
        this.soLuongMua = soLuongMua;
    }

    public  long getLoaiDon(){
        if(maHoaDon.charAt(2)=='1') return 1;
        else return 2;
    }
    public void setHoaDon(SanPham sp){
        this.sp = sp;
        if(getLoaiDon() == 1){
            thanhTien = soLuongMua * sp.getDonGiaLoai1();
        }
        else thanhTien = soLuongMua* sp.getDonGiaLoai2();

        if(soLuongMua>=150){
            giamGia = (long)(0.5*thanhTien);
        }
        else if(soLuongMua>=100) giamGia = (long)(0.3*thanhTien);
        else if(soLuongMua>=50) giamGia = (long)(0.15*thanhTien);
        else giamGia = 0;

        tienPhaiTra = thanhTien-giamGia;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public long getSoLuongMua() {
        return soLuongMua;
    }

    public long getThanhTien() {
        return thanhTien;
    }

    public long getGiamGia() {
        return giamGia;
    }

    public SanPham getSp() {
        return sp;
    }

    public long getTienPhaiTra() {
        return tienPhaiTra;
    }

    public static int getCnt() {
        return cnt;
    }

    @Override
    public String toString() {
        return
                maHoaDon + ' ' +
                sp.getTenSanPham()+" "+
                 giamGia +" "+
                 tienPhaiTra;

    }
}
