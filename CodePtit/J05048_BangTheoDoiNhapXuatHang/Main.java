package CodePtit.J05048_BangTheoDoiNhapXuatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int i=0;i<n;i++){
            sc.nextLine();
            arr.add(new MatHang(sc.next(),sc.nextLong()));
        }
        for (MatHang x : arr){
            System.out.println(x);
        }
    }
}
