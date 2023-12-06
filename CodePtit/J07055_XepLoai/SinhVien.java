package CodePtit.J07055_XepLoai;

public class SinhVien implements Comparable<SinhVien>{
    private String id;
    private String name;
    private int diemLuyenTap,diemThucHanh,diemThi;

    public SinhVien(int id,String name, int diemLuyenTap, int diemThucHanh, int diemThi) {
        this.id = "SV"+String.format("%02d",id);
        this.name = name;
        this.diemLuyenTap = diemLuyenTap;
        this.diemThucHanh = diemThucHanh;
        this.diemThi = diemThi;
    }

    public double getDiemLuyenTap(){
        return 0.25*this.diemLuyenTap;
    }

    public double getDiemThucHanh(){
        return 0.35*this.diemThucHanh;
    }

    public double getDiemThi(){
        return 0.4*this.diemThi;
    }

    public double getDiemTongKet(){
        return getDiemThi()+getDiemThucHanh()+getDiemLuyenTap();
    }

    public String xepLoai(){
        if(this.getDiemTongKet() >= 8d){
            return "GIOI";
        }
        else if(this.getDiemTongKet()>=6.5d){
            return "KHA";
        }
        else if(this.getDiemTongKet()>=5d){
            return "TRUNG BINH";
        }
        else{
            return "KEM";
        }
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
    public int compareTo(SinhVien o) {
        return -Double.compare(this.getDiemTongKet(), o.getDiemTongKet());
    }

    @Override
    public String toString() {
        return  id + ' '+
                chuanHoa(name) + ' ' +
                String.format("%.2f",getDiemTongKet())+' '+
                xepLoai();

    }
}
