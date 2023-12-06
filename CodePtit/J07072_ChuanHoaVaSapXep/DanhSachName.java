package CodePtit.J07072_ChuanHoaVaSapXep;

public class DanhSachName implements Comparable<DanhSachName> {
    private String ho,hoDem,ten;

    public DanhSachName(String ho, String hoDem, String ten) {
        this.ho = ho;
        this.hoDem = hoDem;
        this.ten = ten;
    }



    @Override
    public int compareTo(DanhSachName o) {
        if(!this.ten.equals(o.ten)){
            return this.ten.compareTo(o.ten);
        }
        else if(!this.ho.equals(o.ho)){
            return this.ho.compareTo(o.ho);
        }
        else{
            return this.hoDem.compareTo(o.hoDem);
        }
    }

    @Override
    public String toString() {
        return
                 ho + ' ' +
                 hoDem + ' ' + ten
                ;
    }
}
