package CodePtit.J05051_SapXepBangTinhTienDien;

public class KhachHang implements Comparable<KhachHang>{
    private String id;
    private  String loaiKH;
    private long chiSoCu;
    private long chiSoMoi;


    public KhachHang(int id, String loaiKH, long chiSoCu, long chiSoMoi) {
        this.id = "KH"+String.format("%02d",id);
        this.loaiKH = loaiKH;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public  long getHeSo(){
        if(loaiKH.equals("KD"))  return  3;
        else if(loaiKH.equals("NN")) return  5;
        else if(loaiKH.equals("TT")) return  4;
        else return  2;
    }

    public long getThanhTien(){
        return (chiSoMoi-chiSoCu)*getHeSo()*550;
    }

    public long getPhuTroi(){
        long chiSo = chiSoMoi - chiSoCu;
        if(chiSo < 50) return 0;
        if(chiSo <= 100) return (long) Math.round(getThanhTien() / 100.0 * 35);
        return getThanhTien();
    }

    public long getTongTien(){
        return getThanhTien()  + getPhuTroi();
    }

    @Override
    public String toString() {

        return  id + ' ' + getHeSo() +" "+getThanhTien()+" "+getPhuTroi()+" "+getTongTien();

    }

    @Override
    public int compareTo(KhachHang o) {
        return -Double.compare(getTongTien(),o.getTongTien());
    }
}
