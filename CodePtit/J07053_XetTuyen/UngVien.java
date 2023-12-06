package CodePtit.J07053_XetTuyen;

public class UngVien {
    private String id;
    private String hoTen;
    private String ngaySinh;
    private double diemLyThuyet, diemThucHanh;

    public UngVien(int id,String hoTen, String ngaySinh, double diemLyThuyet, double diemThucHanh) {
        this.id = "PH"+String.format("%02d",id);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public double getDiemThuong(){
        if(this.diemLyThuyet>= 8.0 && this.diemThucHanh >=8.0) return 1.0;
        else if(this.diemLyThuyet>=7.5 && this.diemThucHanh>=7.5) return 0.5;
        else return 0.0;
    }

    public int getDiemTrungBinh(){
        double diem =  (this.diemLyThuyet+this.diemThucHanh)/2  + getDiemThuong();
        diem = (int)Math.round(diem);
        if(diem>10) diem = 10;
        return (int)diem;
    }

    public String getXepLoai(){
        if(getDiemTrungBinh()< 5) return "Truot";
        else if(getDiemTrungBinh() < 7) return "Trung binh";
        else if(getDiemTrungBinh() < 8) return "Kha";
        else if(getDiemTrungBinh()<9) return "Gioi";
        else return "Xuat sac";
    }

    public int getTuoi(){
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        sb.reverse();
        String sb2 = sb.toString().substring(0,4);
        StringBuilder sb3 = new StringBuilder(sb2);
        int namSinh = Integer.parseInt(sb3.reverse().toString());
        return 2021-namSinh;
    }

    public String chuanHoaTen(){
        String[] arr = this.hoTen.trim().split("\\s+");
        String name = "";
        for(String x : arr){
            name += Character.toUpperCase(x.charAt(0));
            for(int j=1;j<x.length();j++){
                name += Character.toLowerCase(x.charAt(j));
            }
            name += " ";
        }
        return name.trim();
    }
    @Override
    public String toString() {
        return
                 id + ' ' +
                  chuanHoaTen()+ ' ' +
                 getTuoi() + ' ' +
                 getDiemTrungBinh()+' '+
                         getXepLoai()
                ;
    }
}
