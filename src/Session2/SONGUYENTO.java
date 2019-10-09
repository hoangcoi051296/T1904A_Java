package Session2;


import java.util.Scanner;

public class SONGUYENTO {
    public  int a=2;

    public  boolean isSoNguyenTo(int x){
        for( int i=2;i<=x/2;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }

    public  int timSoNguyenTotieptheo(){
    for(int i = a+1 ; true ; i++){
        if(isSoNguyenTo(i)){
            return i;
        }
    }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
       if(isSoNguyenTo(a)){
           this.a = a;
           return;
       }
       System.out.print("Day khong phai la so nguyen to");
    }

    public static void  main(String args[]){
    SONGUYENTO snt =new SONGUYENTO();
    for(int i=0 ; i<15;i++){
        int x=snt.timSoNguyenTotieptheo();
        snt.setA(x);
        System.out.println(snt.getA());
    }
    snt.setA(43);
    System.out.println("Next : "+snt.timSoNguyenTotieptheo());
    }
}
