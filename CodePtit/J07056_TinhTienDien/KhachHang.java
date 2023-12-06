package CodePtit.J07056_TinhTienDien;

public class KhachHang implements Comparable<KhachHang>{
    private String id;
    private String hoTen;
    private String loaiHoGiaDinh;
    private int chiSoDau,chiSoCuoi;

    public KhachHang(int id, String hoTen, String loaiHoGiaDinh, int chiSoDau, int chiSoCuoi) {
        this.id = "KH"+String.format("%02d",id);
        this.hoTen = hoTen;
        this.loaiHoGiaDinh = loaiHoGiaDinh;
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
    }

    public int getDinhMucDien(){
        if(this.loaiHoGiaDinh.equals("A")) return 100;
        else if(this.loaiHoGiaDinh.equals("B")) return 500;
        else return 200;
    }
    public int getTienTrongDinhMuc(){
        if(this.chiSoCuoi-this.chiSoDau < getDinhMucDien()){
            return (this.chiSoCuoi-this.chiSoDau)*450;
        }
//        else  if(this.chiSoCuoi-this.chiSoDau > getDinhMucDien())
            return getDinhMucDien()*450;

    }

    public int getTienVuotDinhMuc(){
        if(this.chiSoCuoi-this.chiSoDau > getDinhMucDien()){
            return ((this.chiSoCuoi-this.chiSoDau)-getDinhMucDien())*1000;
        }
        else return 0;
    }

    public int getThueVat(){
        return (int)(0.05*getTienVuotDinhMuc());
    }

    public int getSoTienPhaiNop(){
        return getTienTrongDinhMuc()+getTienVuotDinhMuc()+getThueVat();
    }

    public String chuanHoa(String s){
        String[] arr = s.trim().split("\\s+");
        String ten = "";
        for(String x : arr){
            ten += Character.toUpperCase(x.charAt(0));
            for(int j=1;j<x.length();j++){
                ten+= Character.toLowerCase(x.charAt(j));
            }
            ten += " ";
        }
        return  ten.trim();
    }

    @Override
    public String toString() {
        return
                id + ' ' +
                chuanHoa(hoTen) + ' ' +
                getTienTrongDinhMuc()+ ' '+
                        getTienVuotDinhMuc()+ ' '+
                        getThueVat()+' '+
                        getSoTienPhaiNop();

    }

    @Override
    public int compareTo(KhachHang o) {
        return -Integer.compare(this.getSoTienPhaiNop(),o.getSoTienPhaiNop());
    }
}
