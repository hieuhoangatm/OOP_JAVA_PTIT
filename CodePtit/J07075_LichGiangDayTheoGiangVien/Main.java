package CodePtit.J07075_LichGiangDayTheoGiangVien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        ArrayList<MonHoc> arr1 = new ArrayList<>();
        int t1 = Integer.parseInt(sc1.nextLine());
        for(int i=0;i<t1;i++){
            String maMon = sc1.nextLine();
            String tenMon = sc1.nextLine();
            String soTC = sc1.nextLine();
            arr1.add(new MonHoc(maMon,tenMon,soTC));
        }

        ArrayList<LopHoc> arr2 = new ArrayList<>();
        int t2 = Integer.parseInt(sc2.nextLine());
        for (int i=0;i<t2;i++){
            String maMon = sc2.nextLine();
            String thu = sc2.nextLine();
            String  kip = sc2.nextLine();
            String tenGV = sc2.nextLine();
            String phongHoc = sc2.nextLine();
            arr2.add(new LopHoc(i+1,maMon,thu,kip,tenGV,phongHoc));
        }
        String name = sc2.nextLine();

        System.out.println("LICH GIANG DAY GIANG VIEN "+name+":");
        Collections.sort(arr2);
        for(LopHoc x : arr2){
            if(x.getTenGV().equals(name)){
                for(MonHoc y : arr1){
                    if(x.getMaMonHoc().equals(y.getMaMon())){
                        System.out.println(x.getMaNhom()+" "+y.getTenMH()+" "+x.getNgayGiangDay()+" "+x.getKipHoc()+" "+x.getPhongHoc());
                        break;
                    }

                }
            }
        }
    }
}
