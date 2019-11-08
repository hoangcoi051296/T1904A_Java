package Jv2_session4.lab;

public class SNT {
    public int n=2;


    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if(n<=3)return true;
        for (int i = 2; i <=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public  synchronized void timSoNguyenTotieptheo(){
        for(int i = n+1 ; true ; i++){
            if(isPrime(i)){
                n=i;

                System.out.println("next : "+i);
                return ;
            }
        }
    }
    public void binhPhuong(){

        System.out.println(n*n);

    }
}
