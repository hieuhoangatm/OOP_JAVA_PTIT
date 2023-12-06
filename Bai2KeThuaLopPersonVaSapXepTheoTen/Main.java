package Bai2KeThuaLopPersonVaSapXepTheoTen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String lop = sc.nextLine();
            double diem = sc.nextDouble();

            Student sinhVien = new Student(i + 1, lop, diem, ten, ngaySinh, diaChi);
            sinhVien.chuanHoa();
            arr.add(sinhVien);
        }
        Collections.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSortedName().compareTo(o2.getSortedName());
            }
        });
        for(Student x : arr){
            System.out.println(x);
        }
    }
}

