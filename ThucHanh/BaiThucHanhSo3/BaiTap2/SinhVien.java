package ThucHanh.BaiThucHanhSo3.BaiTap2;

import java.time.Duration;
import java.time.LocalDateTime;

public class SinhVien implements Comparable<SinhVien> {
    private String name;
    private String timeStart;
    private String timeEnd;

    public SinhVien(String name, String timeStart, String timeEnd) {
        this.name = name;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public long getPhut(){
        int ngay = Integer.parseInt(this.timeStart.substring(0,2));
        int thang = Integer.parseInt(this.timeStart.substring(3,5));
        int nam = Integer.parseInt(this.timeStart.substring(6,10));
        int gio = Integer.parseInt(this.timeStart.substring(11,13));
        int phut = Integer.parseInt(this.timeStart.substring(14,16));
        int giay = Integer.parseInt(this.timeStart.substring(17));

        int ngay1 = Integer.parseInt(this.timeEnd.substring(0,2));
        int thang1 = Integer.parseInt(this.timeEnd.substring(3,5));
        int nam1 = Integer.parseInt(this.timeEnd.substring(6,10));
        int gio1 = Integer.parseInt(this.timeEnd.substring(11,13));
        int phut1 = Integer.parseInt(this.timeEnd.substring(14,16));
        int giay1 = Integer.parseInt(this.timeEnd.substring(17));
        LocalDateTime start = LocalDateTime.of(nam,thang,ngay,gio,phut,giay);
        LocalDateTime end = LocalDateTime.of(nam1,thang1,ngay1,gio1,phut1,giay1);
        Duration dur = Duration.between(start,end);
        long minutes = dur.toMinutes();
        return  minutes;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.getPhut()!=o.getPhut()){
            return -Long.compare(this.getPhut(), o.getPhut());
        }
        else{
            return this.name.compareTo(o.name);
        }
    }

    @Override
    public String toString() {
        return
                 name + ' ' +getPhut();

    }
}
