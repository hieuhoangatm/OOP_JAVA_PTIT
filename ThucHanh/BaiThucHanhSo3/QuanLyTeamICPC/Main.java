package ThucHanh.BaiThucHanhSo3.QuanLyTeamICPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("INSTITUTION.in"));
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<Truong> arr1 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String tmp = sc1.nextLine();
            String[] a = tmp.split("\\s+");
            String tenVT = a[0];
            String name ="";
            for(int k=1;k<a.length;k++) name += a[k]+" ";
            name.trim();
            arr1.add(new Truong(tenVT,name));
        }

        Scanner sc2 = new Scanner(new File("REGISTER.in"));
        int m =Integer.parseInt(sc2.nextLine());
        ArrayList<Team> arr2 = new ArrayList<>();
        for(int i=1;i<=m;i++){
            String tmp = sc2.nextLine();
            String[] a = tmp.split("\\s+");
            String tenVT = a[0];
            int soDoi = Integer.parseInt(a[1]);
            for(int j=0;j<soDoi;j++){
                String tenDoi = sc2.nextLine();
                arr2.add(new Team(tenVT,tenDoi));
            }
        }

        Collections.sort(arr1, new Comparator<Truong>() {
            @Override
            public int compare(Truong o1, Truong o2) {
                return o1.getTenTruong().compareTo(o2.getTenTruong());
            }
        });

        Collections.sort(arr2, new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                return o1.getTenDoiThi().compareTo(o2.getTenDoiThi());
            }
        });
        int cnt = 1;

        for(Truong x : arr1){
            for(Team y : arr2){
                if(x.getVietTat().equals(y.tenVT)){
                    String id = "team" +String.format("%02d",cnt++);
                    System.out.println(id+" "+y.tenDoiThi+" "+x.getTenTruong());
                }
            }
        }
    }
}
