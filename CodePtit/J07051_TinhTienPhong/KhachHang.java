package CodePtit.J07051_TinhTienPhong;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class KhachHang {
    private String id;
    private String tenKH;
    private String soPhong;
    private String ngayNhanPhong,ngayTraPhong;
    private int tienDichVuPhatSinh;

    public KhachHang(int id,String tenKH, String soPhong, String ngayNhanPhong, String ngayTraPhong, int tienDichVuPhatSinh) {
        this.id = "KH"+String.format("%02d",id);
        this.tenKH = tenKH;
        this.soPhong = soPhong;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.tienDichVuPhatSinh = tienDichVuPhatSinh;
    }

    public int soNgayO(){
        StringBuilder sb = new StringBuilder(this.ngayNhanPhong);
        if(sb.charAt(1) == '/') sb.insert(0,'0');
        if(sb.charAt(4)=='/') sb.insert(3,'0');
        String ngayNhan = sb.toString().trim();
        int namNhan = Integer.parseInt(ngayNhan.substring(6,10));
        int thangNhan = Integer.parseInt(ngayNhan.substring(3,5));
        int ngaynhan = Integer.parseInt(ngayNhan.substring(0,2));

        LocalDate startDate = LocalDate.of(namNhan, thangNhan, ngaynhan);

        StringBuilder sb2 = new StringBuilder(this.ngayTraPhong);
        if(sb2.charAt(1) == '/') sb2.insert(0,'0');
        if(sb2.charAt(4)=='/') sb2.insert(3,'0');
        String ngayTra = sb2.toString();
        int namTra = Integer.parseInt(ngayTra.substring(6,10));
        int thangTra = Integer.parseInt(ngayTra.substring(3,5));
        int ngaytra = Integer.parseInt(ngayTra.substring(0,2));

        LocalDate endDate = LocalDate.of(namTra, thangTra, ngaytra);
        int daysBetween = (int) ChronoUnit.DAYS.between(startDate, endDate);
        return  daysBetween+1;
    }
    public int getTongTien(){
        int tang = 0;
        if(this.soPhong.charAt(0) == '1'){
            tang = 1;
        }
        else if(this.soPhong.charAt(0) == '2'){
            tang = 2;
        }
        else if(this.soPhong.charAt(0) == '3'){
            tang = 3;
        }
        else tang = 4;

        int giaTang = 0;
        if(tang==1) giaTang = 25;
        else if (tang == 2) giaTang = 34;
        else if (tang == 3) giaTang = 50;
        else giaTang = 80;

        return soNgayO()*giaTang+this.tienDichVuPhatSinh;
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
    @Override
    public String toString() {
        return
                 id + ' ' +
                 chuanHoaTen(tenKH) + ' ' +
                 soPhong + " " + soNgayO()+' '+ getTongTien()
                ;
    }
}
