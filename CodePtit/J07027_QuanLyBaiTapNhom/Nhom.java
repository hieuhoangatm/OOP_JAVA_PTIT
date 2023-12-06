package CodePtit.J07027_QuanLyBaiTapNhom;

public class Nhom implements Comparable<Nhom>{
    private String maSV;
    private int stt;

    public Nhom(String maSV, int stt) {
        this.maSV = maSV;
        this.stt = stt;
    }

    public String getMaSV() {
        return maSV;
    }

    public int getStt() {
        return stt;
    }

    @Override
    public int compareTo(Nhom o) {
        return this.getMaSV().compareTo(o.getMaSV());
    }
}
