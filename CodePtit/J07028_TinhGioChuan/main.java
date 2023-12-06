package CodePtit.J07028_TinhGioChuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<MonHoc> arr1 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] tmp = sc1.nextLine().split("\\s+");
            String name ="";
            for(int k=1;k<tmp.length;k++){
                name += tmp[k]+" ";
            }
            name = name.trim();
            arr1.add(new MonHoc(tmp[0], name));
        }
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        n = Integer.parseInt(sc2.nextLine());
        ArrayList<GiangVien> arr2 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] tmp = sc2.nextLine().split("\\s+");
            String name ="";
            for(int k=1;k< tmp.length;k++){
                name += tmp[k]+" ";
            }
            name = name.trim();
            arr2.add(new GiangVien(tmp[0], name));
        }
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(sc3.nextLine());
        for(int i=1;i<=n;i++){
            String magv = sc3.next();
            String mamh = sc3.next();
            double gio = sc3.nextDouble();
            for(GiangVien x : arr2){
                if(x.getMaGV().equals(magv)){
                    x.setGioChuan(gio);
                    break;
                }
            }
        }
        for(GiangVien x : arr2){
            System.out.println(x.getTenGV()+ " "+String.format("%.2f",x.getGioChuan()));
        }
    }
}
