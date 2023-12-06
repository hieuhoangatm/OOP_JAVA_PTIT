package CodePtit.J05040_LapBangTinhCong;

public class NhanVien {
    private String id,tenNhanVien;
    private int luongCoBan;
    private int soNgayCong;
    private String chucVu;

    public NhanVien(int id, String tenNhanVien, int luongCoBan, int soNgayCong, String chucVu) {
        this.id = "NV"+String.format("%02d",id);
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }

    public int getTienLuong(){
        return  this.luongCoBan*this.soNgayCong;
    }
    public int getTienThuong(){
        if(this.soNgayCong >= 25){
            return (int)(0.2*getTienLuong());
        }
        else if(this.soNgayCong>=22){
            return (int)(0.1*getTienLuong());
        }
        else{
            return  0;
        }
    }

    public int getPhuCap(){
        if(this.chucVu.equals("GD")){
            return 250000;
        }
        else if(this.chucVu.equals("PGD")){
            return 200000;
        }
        else if(this.chucVu.equals("TP")){
            return 180000;
        }
        else return 150000;
    }

    public int getThuNhap(){
        return getPhuCap()+getTienLuong()+getTienThuong();
    }

    @Override
    public String toString() {
        return
                 id + ' ' +
                 tenNhanVien + ' ' +
                 getTienLuong()+" "+
                  getTienThuong() +" "+
                getPhuCap()+ ' ' +
                         getThuNhap()
                ;
    }
}
