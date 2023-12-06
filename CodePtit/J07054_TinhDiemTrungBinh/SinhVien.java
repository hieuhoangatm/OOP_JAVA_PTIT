package CodePtit.J07054_TinhDiemTrungBinh;

import java.text.DecimalFormat;

public class SinhVien implements Comparable<SinhVien>{
    private String id;
    private String hoTen;
    private int diem1,diem2,diem3;

    public SinhVien(int id, String hoTen, int diem1, int diem2, int diem3) {
        this.id = "SV"+String.format("%02d",id);
        this.hoTen = hoTen;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
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

    public double getDiemTrungBinh(){
        double number = (this.diem1+this.diem2+this.diem3)/3;
        String diem = String.format("%.2f",number);
        return Double.parseDouble(diem);
    }

    public SinhVien(String id) {
        this.id = id;
    }

    public int setXepHang(){
        return 1;
    }


    @Override
    public int compareTo(SinhVien o) {
        return 0;
    }
}
