package CodePtit.J07027_QuanLyBaiTapNhom;

public class SinhVien {
    private String id;
    private String name,phone;

    public SinhVien(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
