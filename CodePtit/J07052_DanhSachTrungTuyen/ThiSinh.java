package CodePtit.J07052_DanhSachTrungTuyen;

public class ThiSinh {
    private  String ma;
    private String hoTen;
    private double diemToan, diemLy,diemHoa;

    public ThiSinh(String ma, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public String diemUuTien(){
        String khuVuc = this.ma.substring(0,3);
        String diemUuTien;
        if(khuVuc.equals("KV1")) diemUuTien = "0.5";
        else if (khuVuc.equals("KV2")) {
           diemUuTien = "1";
        }
        else{
            diemUuTien = "2.5";
        }
        return diemUuTien;
    }
    public double getTongDiem(){
        String khuVuc = this.ma.substring(0,3);
        double tongDiem = 0;
        if(khuVuc.equals("KV1")) tongDiem+=0.5;
        else if (khuVuc.equals("KV2")) {
            tongDiem+=1.0;
        }
        else tongDiem+=2.5;
        return tongDiem+ diemToan*2+diemLy+diemHoa;
    }

    public String getMa() {
        return ma;
    }

    public String chuanHoaTen(String s){
        String[] arr = s.trim().split("\\s+");
        String name = "";
        for(String x : arr){
            name += Character.toUpperCase(x.charAt(0));
            for(int j=1;j<x.length();j++){
                name+= Character.toLowerCase(x.charAt(j));
            }
            name += " ";
        }
        return name.trim();
    }

    public String chuan(){
        String tong = getTongDiem()+"";
        if(tong.charAt(3)=='0'){
            tong = tong.substring(0,2);
        }
        else{
            tong = String.format("%.1f",getTongDiem());
        }
        return tong;
    }
    @Override
    public String toString() {
        return
                 ma + ' ' +
                         chuanHoaTen(hoTen) + ' ' +
                 diemUuTien()+ ' '+
                 chuan()+ ' '
                    ;
    }
}
