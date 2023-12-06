package LuyenTap.BookAndAuthors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++) {
            sc.nextLine();
            String tenSach = sc.nextLine();
            double gia = sc.nextDouble();
            int cnt = sc.nextInt();
            int luongTacGia = sc.nextInt();
            sc.nextLine();
            Author b[] = new Author[luongTacGia];
            for (int j = 0; j < luongTacGia; j++) {
                String tenTacGia = sc.nextLine();
                String email = sc.nextLine();
                Character gt = sc.nextLine().charAt(0);
                Author tg = new Author(tenTacGia, email, gt);
                b[j] = tg;
            }
            Book tmp = new Book(tenSach, gia, cnt, luongTacGia, b);
            arr.add(tmp);
        }
        Collections.sort(arr,new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                if(o1.getNameBook().compareTo(o2.getNameBook())<0)
                    return -1;
                else
                    return 1;
            }

        });
        for(Book tmp:arr){
            tmp.display(tmp.getSoTG());
        }


    }
}
