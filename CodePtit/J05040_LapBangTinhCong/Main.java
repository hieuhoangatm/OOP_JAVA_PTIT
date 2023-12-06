package CodePtit.J05040_LapBangTinhCong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            arr.add(new NhanVien(i,sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.next()));
        }
        for(NhanVien x : arr){
            System.out.println(x);
        }
    }
}
