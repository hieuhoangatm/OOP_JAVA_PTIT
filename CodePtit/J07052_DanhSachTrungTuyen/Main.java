package CodePtit.J07052_DanhSachTrungTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            ThiSinh x = new ThiSinh(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        int chiTieu = Integer.parseInt(sc.nextLine());
        Collections.sort(arr, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if(o1.getTongDiem()!=o2.getTongDiem()){
                    return -1;
                }
                else return o1.getMa().compareTo(o2.getMa());
            }
        });

        double diemChuan = 0;
        for(ThiSinh x : arr){
            diemChuan = x.getTongDiem();
            chiTieu -=1;
            if(chiTieu==0) break;
        }
        System.out.println(String.format("%.1f",diemChuan));
        for(ThiSinh x : arr){
            if(x.getTongDiem()>=diemChuan){
                System.out.print(x);
                System.out.println("TRUNG TUYEN");
            }
            else{
                System.out.print(x);
                System.out.println("TRUOT");
            }
        }
    }
}
