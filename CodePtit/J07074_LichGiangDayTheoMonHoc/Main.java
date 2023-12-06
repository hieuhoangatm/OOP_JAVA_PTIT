package CodePtit.J07074_LichGiangDayTheoMonHoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));

        int t = Integer.parseInt(sc1.nextLine());
        ArrayList<MonHoc> arr1 = new ArrayList<>();
        while(t-->0){
            arr1.add(new MonHoc(sc1.nextLine(),sc1.nextLine(),Integer.parseInt(sc1.nextLine())));
        }

        t = Integer.parseInt(sc2.nextLine());
        ArrayList<LopHoc> arr2 = new ArrayList<>();
        for(int i=1;i<=t;i++){
            arr2.add(new LopHoc(i,sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine()),sc2.nextLine(),sc2.nextLine()));
        }

        Collections.sort(arr2);
        String idMon = sc2.nextLine();
        for (MonHoc x : arr1){
            if(x.getId().equals(idMon)){
                System.out.println("LICH GIANG DAY MON "+x.getTenMonHoc()+":");
                break;
            }
        }
//        int cnt =1;
        for(LopHoc x : arr2){
            for(MonHoc y : arr1){
                if(x.getMaMon().equals(idMon) && y.getId().equals(idMon)){
//                    String maNhom = "HP"+String.format("%03d",cnt++);
                    System.out.println(x.getMaNhom()+" "+x.getNgayGiangDay()+" "+x.getKipHoc()+" "+x.getTenGiangVien()+" "+x.getPhongHoc());
                }
            }
        }

    }
}
