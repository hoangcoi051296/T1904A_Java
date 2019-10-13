package Lab_SS3;

import java.util.Scanner;

public class Fraction {
    public  int TuSo;
    public  int Mauso;

    public Fraction(){

    }

    public Fraction(int x, int y){
      this.setTuSo(x);
      this.setMauso(y);
    }

    public int getTuSo() {
        return TuSo;
    }

    public void setTuSo(int tuSo) {
        TuSo = tuSo;
    }

    public int getMauso() {
        return Mauso;
    }

    public void setMauso(int mauso) {
        Mauso = mauso;
    }
    public void input(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Nhap tu so : ");
    setTuSo(sc.nextInt());
        do{
            System.out.println("Nhap mau so: ");
            setMauso(sc.nextInt());
            if(this.Mauso == 0) System.out.println("Mau so phai khac 0 ");
        }while(this.Mauso == 0);
    }



    public void print(){
    System.out.println("Phan so : "+getTuSo()+ "/" + getMauso());

    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void Rutgon(){
        int i=timUSCLN(this.getTuSo(),this.getMauso());
        this.setTuSo(this.getTuSo() / i);
        this.setMauso(this.getMauso() / i);
    }

    public void Add(Fraction ps) {
        int ts = this.getTuSo() * ps.getMauso() + ps.getTuSo() * this.getMauso();
        int ms = this.getMauso() * ps.getMauso();
        Fraction phanSoTong = new Fraction(ts, ms);
        phanSoTong.Rutgon();
        System.out.println("Tổng hai phân số = " + phanSoTong.getTuSo() + "/" + phanSoTong.getMauso());
    }
    public void Sub(Fraction ps) {
        int ts = this.getTuSo() * ps.getMauso() - ps.getTuSo() * this.getMauso();
        int ms = this.getMauso() * ps.getMauso();
        Fraction phanSoHieu = new Fraction(ts, ms);
        phanSoHieu.Rutgon();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.getTuSo() + "/" + phanSoHieu.getMauso());
    }

    public void Mul(Fraction ps) {
        int ts = this.getTuSo() * ps.getTuSo();
        int ms = this.getMauso() * ps.getMauso();
        Fraction phanSoTich = new Fraction(ts, ms);
        phanSoTich.Rutgon();
        System.out.println("Tích hai phân số = " + phanSoTich.getTuSo() + "/" + phanSoTich.getMauso());
    }

    public void Div(Fraction ps) {
        int ts = this.getTuSo() * ps.getMauso();
        int ms = this.getMauso() * ps.getTuSo();
        Fraction phanSoThuong = new Fraction(ts, ms);
        phanSoThuong.Rutgon();
        System.out.println("Thương hai phân số = " + phanSoThuong.getTuSo() + "/" + phanSoThuong.getMauso());
    }



    public static void main (String args[]){
        Fraction xx1= new Fraction(1,3);
        Fraction xx2= new Fraction(5,8);
        xx1.input();
        xx2.input();
        xx1.Add(xx2);
        xx1.Sub(xx2);
        xx1.Mul(xx2);
        xx1.Div(xx2);
    }
}


