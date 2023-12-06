package CodePtit.J04013_BaiToanTuyenSinh;

public class ThiSinh {
    private String id,name;
    private double toan,ly,hoa;

    public ThiSinh(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getKhuVuc(){
        return id.substring(0,3);
    }
    public double getUuTien(){
        if(getKhuVuc().equals("KV1")){
            return 0.5;
        }
        else if(getKhuVuc().equals("KV2")){
            return 1.0;
        }
        else{
            return 2.5;
        }
    }
    public double DiemTong(){
        return toan*2+ly+hoa;
    }
    public String getXetTuyen(){
        double diemTong = DiemTong()+getUuTien();
        if(diemTong>= (double)24){
            return "TRUNG TUYEN";
        }
        else{
            return "TRUOT";
        }
    }
    @Override
    public String toString() {
        String check = String.format("%.1f",DiemTong());
        int diemTong=0;
        if(check.charAt(check.length()-1) == '0'){
            diemTong = Integer.parseInt(check);
        }

        return  id + ' ' + name + ' '+getUuTien()+ ' '+diemTong+' '+getXetTuyen();

    }
}
