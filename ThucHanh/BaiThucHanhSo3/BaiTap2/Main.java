package ThucHanh.BaiThucHanhSo3.BaiTap2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten = sc.nextLine();
            String sta = sc.nextLine();
            String end = sc.nextLine();
            arr.add(new SinhVien(ten,sta,end));
        }
        Collections.sort(arr);
        for (SinhVien x : arr){
            System.out.println(x);
        }
    }
}
