package CodePtit.J05038_BangKeTienLuong;

public class NhanVien {
    private  String id;
    private  String name;
    private int luongNgay;
    private int soNgayCong;
    private String chucVu;

    public NhanVien(int id, String name, int luongNgay, int soNgayCong, String chucVu) {
        this.id = "NV"+String.format("%02d",id);
        this.name = name;
        this.luongNgay = luongNgay;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }

    public int getLuongThang(){
        return this.luongNgay*this.soNgayCong;
    }

    public double getThuong(){
        if(this.soNgayCong>=25){
            return 0.2*this.getLuongThang();
        }
        else if(this.soNgayCong>=22){
            return 0.1*this.getLuongThang();
        }
        else return 0;
    }

    public int getPhuCap(){
        String cv= this.chucVu;
        if(cv.equals("GD")) return 250000;
        else if(cv.equals("PGD")){
            return 200000;
        }
        else if(cv.equals("TP")){
            return 180000;
        }
        else return 150000;
    }

    public int getThucLinh(){
        return (int)(this.getLuongThang()+this.getThuong()+this.getPhuCap());
    }

    @Override
    public String toString() {
        return
                 id + ' ' +
                 name + ' ' +
//                         this.chucVu+' '+
                 getLuongThang() +' '+
                         (int)getThuong() +' '+
                    getPhuCap() + ' ' +
                         getThucLinh()
                ;
    }
}
