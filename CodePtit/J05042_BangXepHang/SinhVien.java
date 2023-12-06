package CodePtit.J05042_BangXepHang;

public class SinhVien implements Comparable<SinhVien> {
    private String ten;
    private int soBaiDung;
    private int soSubmit;

    public SinhVien(String ten, int soBaiDung, int soSubmit) {
        this.ten = ten;
        this.soBaiDung = soBaiDung;
        this.soSubmit = soSubmit;
    }


    @Override
    public String toString() {
        return
                ten + ' ' +
                 soBaiDung +" "+
                 soSubmit
                ;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.soBaiDung!=o.soBaiDung){
            return -Integer.compare(this.soBaiDung,o.soBaiDung);
        }else{
            if(this.soSubmit!=o.soSubmit){
                return Integer.compare(this.soSubmit,o.soSubmit);
            }
            else{
                return this.ten.compareTo(o.ten);
            }
        }
    }
}
