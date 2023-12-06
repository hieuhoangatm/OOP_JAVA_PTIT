package CodePtit.J06003_QuanLyBaiTapNhom_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            arr.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt()));
        }
        ArrayList<String> nhom = new ArrayList<>();
        for(int i=1;i<=m;i++){
            sc.nextLine();
            nhom.add(sc.nextLine());
        }
        int q= sc.nextInt();
        while(q-->0){
            int stt = sc.nextInt();
            System.out.println("DANH SACH NHOM "+stt+":");
            for(SinhVien x : arr){
                if(x.getSttNhom() == stt){
                    System.out.println(x);
                }
            }
            System.out.println("Bai tap dang ky: "+nhom.get(stt-1));
        }
    }
}
