package CodePtit.J07057_DiemTuyenSinh;

public class ThiSinh implements Comparable<ThiSinh>{
    private String id;
    private String name;
    private double diemThi;
    private String danToc;
    private int khuVuc;

    public ThiSinh(int id, String name, double diemThi, String danToc, int khuVuc) {
        this.id = "TS"+String.format("%02d",id);
        this.name = name;
        this.diemThi = diemThi;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
    }

    public double getDiemUuTienKhuVuc(){
        if(this.khuVuc == 1){
            return 1.5;
        }
        else if(this.khuVuc == 2) return 1.0;
        else  return 0.0;
    }

    public double getDiemUuTienDanToc(){
        if(this.danToc.equals("Kinh")) return 0.0;
        else return 1.5;
    }

    public double getTongDiem(){
        return this.diemThi+this.getDiemUuTienDanToc()+this.getDiemUuTienKhuVuc();
    }

    public String getId(){
        return  this.id;
    }
    public String getTrangThai(){
        if(this.getTongDiem()>=20.5){
            return "Do";
        }
        else return "Truot";
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.getTongDiem()!=o.getTongDiem()){
            return -Double.compare(this.getTongDiem(),o.getTongDiem());
        }
        else return this.getId().compareTo(o.getId());
    }

    public String chuanHoaTen(String s){
        String[] arr = s.trim().split("\\s+");
        String ten="";
        for(String x : arr){
            ten += Character.toUpperCase(x.charAt(0));
            for(int i=1;i<x.length();i++){
                ten+= Character.toLowerCase(x.charAt(i));
            }
            ten+= " ";
        }
        return ten.trim();
    }

    @Override
    public String toString() {
        return
                 id + ' ' +
                 chuanHoaTen(name) + ' ' +
                 String.format("%.1f",this.getTongDiem())+ " "+
                         this.getTrangThai()
                ;
    }
}
