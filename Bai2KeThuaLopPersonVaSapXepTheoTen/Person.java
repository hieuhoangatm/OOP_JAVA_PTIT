package Bai2KeThuaLopPersonVaSapXepTheoTen;

public class Person {
    private String ten, ngaySinh, diaChi;
    public Person() {
        ten = ngaySinh = diaChi = "";
    }
    public Person(String ten, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    public void chuanHoa(){
        String[] arr = this.ten.split("\\s+");
        String res = "";
        for(String x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for(int j = 1; j < x.length(); j++){
                res += Character.toLowerCase(x.charAt(j));
            }
            res += " ";
        }
        this.ten = res.substring(0, res.length() - 1);
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }


    public String getSortedName(){
        String[] arr = this.ten.split("\\s+");
        String res = arr[arr.length - 1];
        for(int i = 0; i < arr.length - 1; i++){
            res += arr[i] + " ";
        }
        return res;
    }

    @Override
    public String toString() {
        return ten  + " " + ngaySinh  + " " + diaChi + " ";
    }
}
