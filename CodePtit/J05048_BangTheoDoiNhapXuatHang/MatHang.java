package CodePtit.J05048_BangTheoDoiNhapXuatHang;

public class MatHang {
    private String maHang;
    private long soLuongNhap;

    public MatHang(String maHang, long soLuongNhap) {
        this.maHang = maHang;
        this.soLuongNhap = soLuongNhap;
    }

    public long getSoLuongXuatHang(){
        if(this.maHang.charAt(0)=='A'){
            return  Math.round(this.soLuongNhap*(60.0/100.0));
        }
        else return  Math.round(this.soLuongNhap*(70.0/100.0));
    }

    public long getDonGia(){
        if(this.maHang.charAt(this.maHang.length()-1)=='Y'){
            return 110000;
        }
        else return 135000;
    }

    public long getTien(){
        return this.getSoLuongXuatHang()*this.getDonGia();
    }

    public long getThue(){
        if(this.maHang.charAt(0) == 'A' && this.maHang.charAt(maHang.length()-1)=='Y'){
            return (long)(getTien()*0.08);
        }
        else if(this.maHang.charAt(0) == 'A' && this.maHang.charAt(maHang.length()-1)=='N'){
            return (long)(getTien()*0.08);
        }
        else if(this.maHang.charAt(0) == 'B' && this.maHang.charAt(maHang.length()-1)=='Y'){
            return (long)(getTien()*0.17);
        }
        else{
            return (long)(getTien()*0.22);
        }
    }

    @Override
    public String toString() {
        return
                 maHang + ' ' +
                 soLuongNhap +" "+getSoLuongXuatHang()+" "+getDonGia()+" "+getTien()+" "+getThue()
                ;
    }
}
