package Assignment3;

import java.util.Scanner;

public class Student {
    public String Masv;
    public int DTB;
    public int Tuoi;
    public String Lop;

    public Student(){

    }

    public Student(String Masv, int DTB, int Tuoi, int Lop){

    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String masv) {
        Masv = masv;
    }

    public int getDTB() {
        return DTB;
    }

    public void setDTB(int DTB) {
        this.DTB = DTB;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public void inputInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma sinh vien : ");
        setMasv(sc.nextLine());
        System.out.println("Nhap diem trung binh : ");
        setDTB(sc.nextInt());
        System.out.println("Nhap tuoi : ");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap lop : ");
        setLop(sc.nextLine());

    }

    public void showInfo(){

        System.out.println("Ma sinh vien : "+getMasv());
        System.out.println("Diem trung binh : "+getDTB());
        System.out.println("Tuoi :  "+getTuoi());
        System.out.println("Lop : "+getLop());
    }

    public boolean kiemTra( ){
        if (DTB>=8){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        Student xx =new Student();
        xx.inputInfo();
        xx.showInfo();
        if (xx.kiemTra()){
        System.out.println("Dat HSG");
        }

    }


    }


