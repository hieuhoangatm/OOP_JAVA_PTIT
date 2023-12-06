package CodePtit.J07053_XetTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<UngVien> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            UngVien x = new UngVien(i,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        for(UngVien x : arr){
            System.out.println(x);
        }
    }
}
