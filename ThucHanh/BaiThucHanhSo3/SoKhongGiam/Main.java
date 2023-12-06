package ThucHanh.BaiThucHanhSo3.SoKhongGiam;


import java.util.*;

public class Main {
    public static boolean khongGiam(int n){
        String s = n+"";
        if(s.length()<2) return false;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) < s.charAt(i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer,Integer> mp = new LinkedHashMap<>();
        while(sc.hasNext()){
            int x = sc.nextInt();
            if(khongGiam(x)) {
                if (!mp.containsKey(x)) {
                    mp.put(x, 1);
                } else {
                    mp.put(x, mp.get(x) + 1);
                }
            }
        }
        ArrayList<So> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            int x = entry.getKey();
            int xh = entry.getValue();
            arr.add(new So(x,xh));
        }
        Collections.sort(arr);
        for(So x : arr){
            System.out.println(x);
        }
    }
}
