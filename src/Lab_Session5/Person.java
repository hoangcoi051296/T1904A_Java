package Lab_Session5;

import java.util.Scanner;

public class Person {
    public String ten;
    public String gioitinh;
    public String ngaysinh;
    public String diachi;

    public Person(){

    }

    public Person(String ten, String gioitinh, String ngaysinh, String diachi) {
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void inputInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten : ");
        setTen(sc.nextLine());
        System.out.println("Nhap gioi tinh : ");
        setGioitinh(sc.nextLine());
        System.out.println("Nhap ngay sinh : ");
        setNgaysinh(sc.nextLine());
        System.out.println("Nhap dia chi : ");
        setDiachi(sc.nextLine());
    }

    public void showInfo(){
        System.out.println("Ten : "+getTen());
        System.out.println("Ngay sinh : "+getNgaysinh());
        System.out.println("Gioi tinh : "+getGioitinh());
        System.out.println("Dia chi : "+getDiachi());
    }
}
