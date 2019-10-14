package Lab4;

import java.util.Scanner;

public class User {
    public String Ten;
    public int Tuoi;
    public int CMND;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public void nhapThongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten : ");
        setTen(sc.nextLine());
        System.out.println("Nhap tuoi : ");
        setTuoi(sc.nextInt());
        System.out.println("Nhap CMND : ");
        setCMND(sc.nextInt());
    }

    public void inThongtin(){
    System.out.println("Ten : "+getTen());
    System.out.println("Tuoi : "+getTuoi());
    System.out.println("CMND : "+getCMND());
    }
}
