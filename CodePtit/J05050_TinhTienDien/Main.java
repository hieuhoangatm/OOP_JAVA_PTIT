package CodePtit.J05050_TinhTienDien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<KhachHang> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            arr.add(new KhachHang(i,sc.next(),sc.nextLong(),sc.nextLong()));
        }
        for(KhachHang x : arr){
            System.out.println(x);
        }
    }
}
