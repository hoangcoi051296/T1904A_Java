package Session2;

import java.util.Scanner;

public class Tamgiac {
    public int a,b,c;

    public Tamgiac(){
    System.out.println("Tam Giac : ");
    }
    public Tamgiac( int a, int b,int c){
        if(a<0){
           System.out.println("Canh phai >0");
            return;
        }
        if(b<0){
            System.out.println("Canh phai >0");
            return;
        }
        if(c<0){
            System.out.println("Canh phai >0");
            return;
        }
        if(a+b<=c||a+c<=b||b+c<=a){
            System.out.println("Khong phai 3 canh tam giac");
            return ;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean laTamGiac(){
        return(a+b>c && a+c>b && b+c>a);
    }

    public int getChuvi(){
        return a+b+c;
    }
    public double getDienTich(){
        double p=(double)(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a");
        setA(sc.nextInt());
        System.out.println("Nhap canh b");
        setB(sc.nextInt());
        System.out.println("Nhap canh c");
        setC(sc.nextInt());
    }
    public static void main(String args[]){
        System.out.println("Nhap 3 canh cua tam giac : ");
        Tamgiac tg1 = new Tamgiac();
        tg1.input();
        if ( tg1.laTamGiac()){
            System.out.println("Chu vi: "+tg1.getChuvi());
            System.out.println("Dien tich: "+tg1.getDienTich());
        }
    }
}
