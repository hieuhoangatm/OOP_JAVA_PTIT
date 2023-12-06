package CodePtit.J07020_HoaDon2;

public class HoaDon {
    private String maHoaDon;
    private KhachHang x;
    private MatHang y;
    private int soLuong;
    private int thanhTien;
    public HoaDon(int maHoaDon, KhachHang x, MatHang y, int soLuong) {
        this.maHoaDon = "HD"+String.format("%03d",maHoaDon);
        this.x = x;
        this.y = y;
        this.soLuong = soLuong;
    }

    public int getThanhTien(){
        return soLuong*y.getGiaBan();
    }
    @Override
    public String toString() {
        return
                maHoaDon + ' ' +
                 x.getTenKH() +" "+x.getDiaChi()+" "+
                y.getTenMH() +" "+y.getDonViTinh()+" "+y.getGiaMua()+" "+y.getGiaBan() +" "+ soLuong+" "+getThanhTien()
                ;
    }
}
