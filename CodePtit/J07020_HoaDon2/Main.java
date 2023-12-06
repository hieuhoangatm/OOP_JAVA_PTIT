package CodePtit.J07020_HoaDon2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("KH.in"));
        Scanner sc2= new Scanner(new File("MH.in"));
        Scanner sc3 = new Scanner(new File("HD.in"));

        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<KhachHang> arr1 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr1.add(new KhachHang(i,sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine()));
        }

        n = Integer.parseInt(sc2.nextLine());
        ArrayList<MatHang> arr2 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr2.add(new MatHang(i,sc2.nextLine(),sc2.nextLine(),Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine())));
        }

        n = Integer.parseInt(sc3.nextLine());
        ArrayList<HoaDon> arr3 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String tmp = sc3.nextLine();
            String[] s = tmp.split("\\s+");
            for(KhachHang x : arr1){
                for(MatHang y : arr2){
                    if(x.getMaKhachHang().equals(s[0]) && y.getMaMH().equals(s[1])){
                        arr3.add(new HoaDon(i,x,y,Integer.parseInt(s[2])));
                    }
                }
            }
        }
        for(HoaDon x: arr3){
            System.out.println(x);
        }
    }
}
