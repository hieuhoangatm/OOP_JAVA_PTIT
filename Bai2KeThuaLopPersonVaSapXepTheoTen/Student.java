package Bai2KeThuaLopPersonVaSapXepTheoTen;

public class Student extends Person{
    private String maSinhVien,lop;
    private double gpa;

    public Student(int maSinhVien, String lop, double gpa, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.maSinhVien = String.format("%04d", maSinhVien);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return this.maSinhVien + " " + super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }

}
