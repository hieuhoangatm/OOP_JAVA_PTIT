package ThucHanh.BaiThucHanhSo3.DanhSachHuongDanDoAn;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> arr = new ArrayList<>();
        while(sc.hasNext()){
            arr.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }

        Scanner sc2 = new Scanner(new File("HUONGDAN.in"));
        int n = Integer.parseInt(sc2.nextLine());
        ArrayList<GiangVien> arr2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            String check = sc2.nextLine();
            String[] xx = check.split("\\s+");
            String tenGV ="";
            for(int k=0;k< xx.length-1;k++){
                tenGV += xx[k]+" ";
            }
            tenGV = tenGV.trim();

            int soDoAn = Integer.parseInt(xx[xx.length-1]);
            for(int j=0;j<soDoAn;j++){
                String tmp1 = sc2.nextLine();
                String[] a1 = tmp1.split("\\s+");
                String maSV = a1[0];

                String tenDoAn = "";
                for (int k=1;k<a1.length;k++){
                    tenDoAn += a1[k]+" ";
                }
                tenDoAn = tenDoAn.trim();
                arr2.add(new GiangVien(tenGV,maSV,tenDoAn));
            }
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(SinhVien y  : arr){
            for(GiangVien x: arr2){
                if(x.getMaSV().equals(y.getId())){
                    System.out.println(y.getId()+" "+y.getName()+" "+x.getTenGV()+" "+x.getTenDoAn()+" "+y.getPhone());
                }
            }
        }
    }
}
