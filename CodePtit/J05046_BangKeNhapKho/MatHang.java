package CodePtit.J05046_BangKeNhapKho;

public class MatHang {
    private String id;
    private String tenMh;
    private int soLuong;
    private int donGia;

    public MatHang(String id, String tenMh, int soLuong, int donGia) {
        this.id = id;
        this.tenMh = tenMh;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getTienChietKhau(){
        if(this.soLuong>10){
            return (int) (this.donGia*this.soLuong*0.05);
        }
        else if(this.soLuong >= 8){
            return (int) (this.donGia*this.soLuong*0.02);
        }
        else if(this.soLuong >= 5){
            return (int) (this.donGia*this.soLuong*0.01);
        }
        else return 0;
    }

    public int getThanhTien(){
        return  this.soLuong*this.donGia - getTienChietKhau();
    }

    @Override
    public String toString() {
        return
                id + ' ' +
                tenMh + ' ' +getTienChietKhau()+" "+getThanhTien();
    }
}
