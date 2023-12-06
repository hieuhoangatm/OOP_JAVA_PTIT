package ThucHanh.QuanLyBanHang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<KhachHang> arr1 = new ArrayList<>();
        for (int i=1;i<=n;i++){
            arr1.add(new KhachHang(i,sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine()));
        }

        Scanner sc2 = new Scanner(new File("MH.in"));
        n = Integer.parseInt(sc2.nextLine());
        ArrayList<MatHang> arr2 = new ArrayList<>();
        for (int i=1;i<=n;i++){
            arr2.add(new MatHang(i,sc2.nextLine(),sc2.nextLine(),Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine())));
        }

        Scanner sc3 = new Scanner(new File("HD.in"));
        n = Integer.parseInt(sc3.nextLine());
        ArrayList<HoaDon> arr3 = new ArrayList<>();
        for (int i=1;i<=n;i++){
            String tmp = sc3.nextLine();
            String[] ss = tmp.split("\\s+");
            arr3.add(new HoaDon(i,ss[0],ss[1],Integer.parseInt(ss[2])));
        }

        for(HoaDon x : arr3){
            for(KhachHang y : arr1){
                for(MatHang z : arr2){

                    if(x.getMaKH().equals(y.getMaKhachHang()) && x.getMaMH().equals(z.getMaMatHang())){
                        long thanhtien = x.getSoLuong()*z.getGiaBan();
                        System.out.println(x.getMaHoaDon()+" "+y.getTenKh()+" "+y.getDiaChi()+" "+z.getTenMatHang()+" "+z.getDonViTinh()+" "+z.getGiaMua()+" "+z.getGiaBan()+" "+x.getSoLuong()+" "+thanhtien);
                    }
                }
            }
        }
    }
}
