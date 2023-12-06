package CodePtit.J07059_DanhSachCaThi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(new CaThi(i,sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for(CaThi x : arr){
            System.out.println(x);
        }
    }
}
