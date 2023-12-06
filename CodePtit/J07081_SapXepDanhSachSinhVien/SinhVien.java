package CodePtit.J07081_SapXepDanhSachSinhVien;

public class SinhVien implements Comparable<SinhVien>{
    private  String id;
    private String ten;
    private String phone;
    private String email;

    public SinhVien(String id, String ten, String phone, String email) {
        this.id = id;
        this.ten = ten;
        this.phone = phone;
        this.email = email;
    }

    public String getHo(){
        String[] arr = this.ten.split("\\s+");
        return arr[0];
    }

    public String getTen(){
        String[] arr = this.ten.split("\\s+");
        return arr[arr.length-1];
    }
    public String getTenDem(){
        String[] arr = this.ten.split("\\s+");
        String tendem = "";
        for(int i=1;i<arr.length-1;i++){
            tendem += arr[i];
        }
        return tendem;
    }

    public String getId(){
        return  this.id;
    }


    @Override
    public int compareTo(SinhVien o) {
        if(!o.getTen().equals(this.getTen())){
            return this.getTen().compareTo(o.getTen());
        }
        else{
            if(!this.getHo().equals(o.getHo())){
                return this.getHo().compareTo(o.getHo());
            }
            else if(this.getHo().equals(o.getHo())){
                if(!this.getTenDem().equals(o.getTenDem())){
                    return this.getTenDem().compareTo(o.getTenDem());
                }
            }
        }
        return this.getId().compareTo(o.getId());
    }

    @Override
    public String toString() {
        return
                 id + ' ' +
                ten + ' ' +
                 phone + ' ' +
               email
                ;
    }
}


