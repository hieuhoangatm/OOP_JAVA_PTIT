package CodePtit.J05043_TinhThuNhapChoNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            arr.add(new NhanVien(i,sc.nextLine(),sc.next(),sc.nextLong(),sc.nextLong()));
        }
        for(NhanVien x : arr){
            System.out.println(x);
        }
    }
}
