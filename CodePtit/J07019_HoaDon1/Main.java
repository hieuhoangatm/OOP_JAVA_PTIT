package CodePtit.J07019_HoaDon1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));

        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<SanPham> arr1 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr1.add(new SanPham(sc1.nextLine(), sc1.nextLine(), Long.parseLong(sc1.nextLine()), Long.parseLong(sc1.nextLine())));
        }

        n = Integer.parseInt(sc2.nextLine());
        ArrayList<HoaDon> arr2 = new ArrayList<>();
        for(int i=1;i<=n;i++){
           String tmp = sc2.nextLine();
           String[] a = tmp.split("\\s+");
           String ma = a[0];
           int sl = Integer.parseInt(a[1]);
           arr2.add(new HoaDon(ma,sl));
        }

        for(HoaDon x : arr2){
            for (SanPham y : arr1){
                if(x.getMaHoaDon().substring(0,2).equals(y.getMaLoai())){
                    x.setHoaDon(y);
                    break;
                }
            }
        }
        for (HoaDon x : arr2) System.out.println(x);
    }
}
