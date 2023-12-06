package CodePtit.J05037_TinhGiaBan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Collections.sort(arr, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return (int) (Math.round(o2.getGiaBan()) - Math.round(o1.getGiaBan()));
            }
        });
        for(MatHang x : arr){
            System.out.println(x);
        }
    }
}
