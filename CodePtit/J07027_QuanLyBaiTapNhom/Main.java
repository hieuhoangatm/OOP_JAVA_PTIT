package CodePtit.J07027_QuanLyBaiTapNhom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<SinhVien> arr1 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr1.add(new SinhVien(sc1.nextLine(),sc1.nextLine(),sc1.nextLine()));
        }

        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        int m = Integer.parseInt(sc2.nextLine());
        ArrayList<BaiTap> arr2 = new ArrayList<>();
        for(int i=1;i<=m;i++){
            arr2.add(new BaiTap(i, sc2.nextLine()));
        }

        Scanner sc3 = new Scanner(new File("NHOM.in"));
//        n = Integer.parseInt(sc3.nextLine());
        ArrayList<Nhom> arr3 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s = sc3.nextLine();
            String[] tmp = s.split("\\s+");
            arr3.add(new Nhom(tmp[0], Integer.parseInt(tmp[1])));
        }

        Collections.sort(arr3);
        for(Nhom x : arr3){
            for(SinhVien y : arr1){
                for(BaiTap z : arr2){
                    if(x.getMaSV().equals(y.getId()) && x.getStt() == z.getStt()){
                        System.out.println(x.getMaSV()+" "+y.getName()+" "+y.getPhone()+" "+z.getStt()+" "+z.getTenBTL());
                        break;
                    }
                }
            }
        }
    }
}
