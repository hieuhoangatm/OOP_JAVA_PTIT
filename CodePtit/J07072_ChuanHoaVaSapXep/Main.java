package CodePtit.J07072_ChuanHoaVaSapXep;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static String chuanHoa(String s){
        String[] arr = s.trim().split("\\s+");
        String name = "";
        for(String x : arr) {
            name += Character.toUpperCase(x.charAt(0));
            for (int j = 1; j < x.length(); j++) {
                name += Character.toLowerCase(x.charAt(j));
            }
            name += " ";
        }
        return name.trim();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<DanhSachName> arr = new ArrayList<>();
        while (sc.hasNext()){
            String hovaTen = sc.nextLine();
            String[] ds = hovaTen.trim().split("\\s+");
            String Ten = ds[ds.length-1];
            String Ho = ds[0];
            String TenDem = "";
            for(int j=1;j<ds.length-1;j++){
                TenDem+= ds[j]+" ";
            }
            DanhSachName x = new DanhSachName(chuanHoa(Ho),chuanHoa(TenDem),chuanHoa(Ten));
            arr.add(x);
        }
        Collections.sort(arr);
        for(DanhSachName x : arr){
            System.out.println(x);
        }
    }
}
