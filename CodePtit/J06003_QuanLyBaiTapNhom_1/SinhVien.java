package CodePtit.J06003_QuanLyBaiTapNhom_1;

public class SinhVien {
    private String id;
    private String name;
    private String phone;
    private int sttNhom;

    public SinhVien(String id, String name, String phone, int sttNhom) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.sttNhom = sttNhom;
    }

    public int getSttNhom() {
        return sttNhom;
    }

    @Override
    public String toString() {
    return   id + " " +
                name + " " +
                phone + " " +
                sttNhom;
    }
}
