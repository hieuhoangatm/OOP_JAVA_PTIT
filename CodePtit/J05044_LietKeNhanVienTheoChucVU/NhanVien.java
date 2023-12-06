package CodePtit.J05044_LietKeNhanVienTheoChucVU;
public class NhanVien {
    private String id;
    private String ten,chucVu;
    private long luongCoBan,soNgayCong;

    public NhanVien(int id, String ten, String chucVu, long luongCoBan, long soNgayCong) {
        this.id = "NV"+String.format("%02d",id);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
    }

    public long getLuongChinh(){

        return  this.soNgayCong*this.luongCoBan;
    }

    public long getPhuCap(){
        if(this.chucVu.equals("GD")) return 500;
        else if(this.chucVu.equals("PGD")) return 400;
        else if(this.chucVu.equals("TP")) return 300;
        else if (this.chucVu.equals("KT")) return 250;
        else return 100;
    }

    public long getThuNhap(){
        return getLuongChinh()+getPhuCap();
    }

    public long getTamUng(){
        if(( getPhuCap()+getLuongChinh()*2)/3 < 25000){
            long number =  (getPhuCap()+getLuongChinh()*2)/3;
            return  Math.round((double) number / 1000) * 1000;
        }
        else return 25000;
    }

    public String getChucVu(){
        return this.chucVu;
    }
    @Override
    public String toString() {
        return
                id + ' ' +
                        ten + ' ' +
                        getPhuCap() + ' ' +getLuongChinh()+" "+getTamUng()+" "+(getThuNhap()-getTamUng());

    }
}
