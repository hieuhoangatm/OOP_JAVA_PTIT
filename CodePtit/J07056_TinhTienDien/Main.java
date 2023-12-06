package CodePtit.J07056_TinhTienDien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String tach = sc.nextLine();
            String[] xau = tach.trim().split("\\s+");
            String hoGiaDinh = xau[0];
            int soDau = Integer.parseInt(xau[1]);
            int soCuoi = Integer.parseInt(xau[2]);
            arr.add(new KhachHang(i,name,hoGiaDinh,soDau,soCuoi));
        }
        for (KhachHang x : arr){
            System.out.println(x);
        }
    }
}
