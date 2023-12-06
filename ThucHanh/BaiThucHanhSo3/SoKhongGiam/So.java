package ThucHanh.BaiThucHanhSo3.SoKhongGiam;

import java.util.Collections;

public class So implements Comparable<So> {
    private int number;
    private int soLanXH;

    public So(int number, int soLanXH) {
        this.number = number;
        this.soLanXH = soLanXH;
    }

    @Override
    public int compareTo(So o) {
//        if(this.soLanXH!=o.soLanXH){
            return -Integer.compare(this.soLanXH,o.soLanXH);

    }

    @Override
    public String toString() {
        return
                 number +" "+
                 soLanXH;

    }
}
