package CodePtit.J05036_TinhGiaBan1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            arr.add(new MatHang(i,sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt()));
        }
        for(MatHang x : arr){
            System.out.println(x);
        }
    }
}
