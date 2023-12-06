package CodePtit.J07024_HieuCuaHaiTapTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> se;

    public WordSet(String file) throws FileNotFoundException {
        se = new TreeSet<>();
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNext()){
            se.add(sc.next().toLowerCase());
        }
    }

    public WordSet(TreeSet<String> se) {
        this.se = se;
    }

    public WordSet difference(WordSet o) {
        TreeSet<String> tmp = new TreeSet<>();
        tmp.addAll(se);
        for (String x : o.se) tmp.remove(x);
        return new WordSet(tmp);
    }
    @Override
    public String toString() {
        String s = "";
        for (String x : se) s += (x + " ");
        return s;
    }

}
