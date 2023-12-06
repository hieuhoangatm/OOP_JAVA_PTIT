package ThucHanh.BaiThucHanhSo3.QuanLyTeamICPC;

public class Team {
    String tenVT,tenDoiThi,id;
    static int cnt = 1;
    public Team(String tenVT, String tenDoiThi) {
//        this.id = "team"+ String.format("%02d",cnt++);
        this.tenVT = tenVT;
        this.tenDoiThi = tenDoiThi;
    }

    public String getTenVT() {
        return tenVT;
    }

//    public String getId() {
//        return id;
//    }

    public String getTenDoiThi() {
        return tenDoiThi;
    }
}
