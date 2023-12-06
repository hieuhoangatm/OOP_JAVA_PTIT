package CodePtit.J05041_SapXepBangTinhCong;

public class NhanVien implements Comparable<NhanVien> {
    private String id;
    private String ten;
    private int luongCoBan;
    private  int soNgayCong;
    private String chucVu;

    public NhanVien(int id, String ten, int luongCoBan, int soNgayCong, String chucVu) {
        this.id = "NV"+String.format("%02d",id);
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }

    public int getLuong(){
        return this.luongCoBan*this.soNgayCong;
    }
    public int getTienThuong(){
        if(this.soNgayCong >= 25) return (int) (0.2*getLuong());
        else if(this.soNgayCong >=22) return (int) (0.1*getLuong());
        else return 0;
    }

    public int getPhuCap(){
        if(this.chucVu.equals("GD")) return 250000;
        else if(this.chucVu.equals("PGD")) return 200000;
        else if(this.chucVu.equals("TP")) return 180000;
        else{
            return 150000;
        }
    }

    public int getThuNhap(){
        return  this.getLuong()+this.getTienThuong()+this.getPhuCap();
    }

    @Override
    public int compareTo(NhanVien o) {
        return -Integer.compare(this.getThuNhap(),o.getThuNhap());
    }

    @Override
    public String toString() {
        return
                id + ' ' +
                ten + ' ' +
                getLuong()+" "+getTienThuong()+" "+getPhuCap()+" "+getThuNhap();
    }
}
