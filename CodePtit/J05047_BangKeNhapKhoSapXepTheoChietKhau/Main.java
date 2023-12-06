package CodePtit.J05047_BangKeNhapKhoSapXepTheoChietKhau;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static String getMa(String s){
        String[] arr = s.split("\\s+");
        String ten ="";
        for(int i=0;i<2;i++){
            ten += Character.toUpperCase(arr[i].charAt(0));
        }
        return  ten+"0";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        HashMap<String,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ten = sc.nextLine();
            int sl = sc.nextInt();
            int gia = sc.nextInt();
            String tmp = getMa(ten);
            if(mp.containsKey(tmp)){
                mp.put(tmp,mp.get(tmp)+1);
            }
            else{
                mp.put(tmp,1);
            }
            String id = tmp+ mp.get(tmp).toString();
            arr.add(new MatHang(id,ten,sl,gia));
        }
        Collections.sort(arr);
        for(MatHang x : arr){
            System.out.println(x);
        }
    }
}
