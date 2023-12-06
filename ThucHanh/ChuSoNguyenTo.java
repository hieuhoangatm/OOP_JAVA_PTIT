package ThucHanh;

import java.util.*;

public class ChuSoNguyenTo {
    public static int n;
    public static  int[] a = {2,3,5,7};
    public  static ArrayList<Long> kqua = new ArrayList<>();
    public static  boolean check(String s){
        if(s.charAt(s.length()-1)=='2'){
            return false;
        }
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size() == 4;
    }
    public  static void Try(String s){
        if(s.length()>n){
            return;
        }
        if(s.length()>=4 && check(s)) kqua.add(Long.parseLong(s));
        for(int i:a) Try(s+Integer.toString(i));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Try("");
        Collections.sort(kqua);
        for (Long i : kqua){
            System.out.println(i);
        }
    }
}
