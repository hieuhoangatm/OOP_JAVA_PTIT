package CodePtit.J07073_DangKyHinhThucGiangDay;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BoMon> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new BoMon(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for (BoMon x : arr){
            if( !x.getHinhThucdayTH().equals("Truc tiep")){
                System.out.println(x);
            }
        }
    }
}
