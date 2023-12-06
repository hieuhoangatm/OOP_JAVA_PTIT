package CodePtit.J07073_DangKyHinhThucGiangDay;

public class BoMon implements Comparable<BoMon>{
    private String id;
    private String tenMH;
    private int soTinChi;
    private String hinhThucdayLT;
    private String hinhThucdayTH;

    public BoMon(String id, String tenMH, int soTinChi, String hinhThucdayLT, String hinhThucdayTH) {
        this.id = id;
        this.tenMH = tenMH;
        this.soTinChi = soTinChi;
        this.hinhThucdayLT = hinhThucdayLT;
        this.hinhThucdayTH = hinhThucdayTH;
    }

    public String getHinhThucdayTH() {
        return hinhThucdayTH;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(BoMon o) {
        return this.getId().compareTo(o.getId());
    }

    @Override
    public String toString() {
        return
                id + ' ' +
                tenMH + ' ' +
                soTinChi +' '+
                 hinhThucdayLT + ' ' +
                 hinhThucdayTH
                ;
    }
}
