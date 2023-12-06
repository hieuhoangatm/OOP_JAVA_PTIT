package CodePtit.J05037_TinhGiaBan2;

public class MatHang {
    private String id;
    private String tenMH,donVi;
    private int donGiaNhap;
    private int soLuong;
    public MatHang(int id,String tenMH, String donVi, int donGiaNhap, int soLuong) {
        this.id = "MH"+String.format("%02d",id);
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.donGiaNhap = donGiaNhap;
        this.soLuong = soLuong;

    }

    public double getPhiVanChuyen(){
        return (this.donGiaNhap*this.soLuong)*0.05;
    }

    public double getThanhTien(){
        return  this.donGiaNhap*this.soLuong+this.getPhiVanChuyen();
    }

    public double getGiaBan(){
        double giaBan =  (this.getThanhTien() + (this.getThanhTien()*0.02))/this.soLuong;
        return Math.ceil(giaBan / 100) * 100;
    }
    @Override
    public String toString() {
        return
                id + ' ' +
                        tenMH + ' ' +
                        donVi + ' ' +
                        Math.round(getPhiVanChuyen())+' '+
                        Math.round(getThanhTien()) +' '+
//                        Math.round(getGiaBan())
                        (int)getGiaBan()
                ;
    }
}
