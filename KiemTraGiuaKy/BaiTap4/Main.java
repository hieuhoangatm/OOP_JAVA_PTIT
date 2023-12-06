package KiemTraGiuaKy.BaiTap4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3 = new Scanner(new File(" GIOCHUAN.in"));
        ArrayList<MonHoc> arr1 = new ArrayList<>();
        int t1 = Integer.parseInt(sc1.next());
        while(t1-->0) {
            String s = sc1.nextLine();
            String[] arr = s.split("\\s+");
            String maMH = arr[0];
            String tenMH = arr[1];
            MonHoc x = new MonHoc(maMH,tenMH);
            arr1.add(x);
        }

        ArrayList<GiangVien> arr2 = new ArrayList<>();
        int t2 = Integer.parseInt(sc2.next());
        while(t2-->0) {
            String s = sc2.nextLine();
            String[] arr = s.split("\\s+");
            String maMH = arr[0];
            String tenGV = "";
            for(int i=1;i<arr.length;i++){
                tenGV = arr[1]+" ";
            }
            tenGV = tenGV.trim();
            GiangVien x = new GiangVien(maMH,tenGV);
            arr2.add(x);
        }

        ArrayList<GioChuan> arr3 = new ArrayList<>();
        int t3 = Integer.parseInt(sc3.next());
        while(t3-->0) {
            String s = sc3.nextLine();
            String[] arr = s.split("\\s+");
            String maGV = arr[0];
            String maMH = arr[1];
            double gioLL = Double.parseDouble(arr[2]);
            GioChuan x = new GioChuan(maGV,maMH,gioLL);
            arr3.add(x);
        }

        for(GioChuan x : arr3){
            for(GiangVien y : arr2){
                for(MonHoc z : arr1){
                    if(x.getMaGiangVIEN().equals(y.getMaGiangVien()) && x.getMaMonHOC().equals(z.getMaMon())){
                        System.out.println(y.getTenGV()+" "+x.getGioChuan());
                    }
                }
            }
        }
    }
}
