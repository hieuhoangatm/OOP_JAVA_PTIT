package CodePtit.J07057_DiemTuyenSinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String ten = sc.nextLine();
            double diem = Double.parseDouble(sc.nextLine());
            String dt = sc.nextLine();
            int kv = Integer.parseInt(sc.nextLine());
            arr.add(new ThiSinh(i,ten,diem,dt,kv));
        }

        Collections.sort(arr);
        for(ThiSinh x : arr){
            System.out.println(x);
        }
    }
}
