package CodePtit.J07059_DanhSachCaThi;


public class CaThi implements Comparable<CaThi> {
    private String id;
    private String ngayThi;
    private String gioThi;
    private String phongThi;

    public CaThi(int id, String ngayThi, String gioThi, String phongThi) {
        this.id = "C"+String.format("%03d",id);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    public String getId(){
        return this.id;
    }
    public int getThoiGian(){
        int gio = Integer.parseInt(this.gioThi.substring(0,2));
        int phut = Integer.parseInt(this.gioThi.substring(3));
        return gio*60+phut;
    }

    public int getNgayThi(){
        int ngay = Integer.parseInt(this.ngayThi.substring(0,2));
        int thang = Integer.parseInt(this.ngayThi.substring(3,5));
        int nam = Integer.parseInt(this.ngayThi.substring(6));
        return nam*365+thang*30+ngay;
    }


    @Override
    public String toString() {
        return
                 id + ' ' +
                 ngayThi + ' ' +
                 gioThi + ' ' +
                 phongThi + ' '
                ;
    }

    @Override
    public int compareTo(CaThi o) {
        if(this.getNgayThi()!=o.getNgayThi()){
            return Integer.compare(this.getNgayThi(),o.getNgayThi());

        }
        else{
            if(this.getThoiGian() != o.getThoiGian()){
                return Integer.compare(this.getThoiGian(),o.getThoiGian());
            }
            else return this.getId().compareTo(o.getId());
        }
    }
}
