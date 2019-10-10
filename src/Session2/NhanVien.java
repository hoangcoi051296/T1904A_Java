package Session2;

import java.util.Scanner;

public class NhanVien {
    public String ten;
    public int tuoi;
    public String diachi;
    public double tienluong;
    public int giolam;

    public NhanVien() {
        inputInfo();
        printInfo();
    }

    public NhanVien(String ten , int tuoi , String diachi, double tienluong, int  giolam) {
    
    }

    public int getGiolam() {
        return giolam;
    }

    public void setGiolam(int giolam) {
        this.giolam = giolam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten : ");
        setTen(sc.nextLine());
        System.out.println("Nhap Tuoi");
        setTuoi(sc.nextInt());
        System.out.println("Nhap dia chi : ");
        setDiachi(sc.nextLine());
        System.out.println("Nhap so gio lam : ");
        setGiolam(sc.nextInt());
        System.out.println("Nhap tien luong : " + tienluong);
        setTienluong(sc.nextInt());
    }


    void printInfo() {
        System.out.println("Ten : " + ten);
        System.out.println("Tuoi : " + tuoi);
        System.out.println("Dia chi : " + diachi);
        System.out.println("So gio lam : " + giolam);
        System.out.println("Tien luong : " + tienluong);
        System.out.println("Tien thuong : " + tinhThuong());
    }

    double tinhThuong() {
        double thuong;
        if (giolam >= 200) {
            thuong = (int) (tienluong * 20 / 100);
        } else if (giolam < 100) {
            thuong = 0;
        } else {
            thuong = (int) (tienluong * 10 / 100);
        }
        return thuong;
    }

    public static void main(String args[]) {
     NhanVien nv1 = new NhanVien();
     nv1.inputInfo();
     nv1.printInfo();
    }
}
