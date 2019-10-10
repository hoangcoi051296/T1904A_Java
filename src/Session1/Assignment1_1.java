package Session1;

import java.util.Scanner;

public class Assignment1_1 {

   public static void main( String args[]){
        int n;
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap 1 so n tu ban phim : ");
       n = sc.nextInt();
    for(int i=2; i<n; i++){
        if(checkSNT(i)){
            System.out.println(i+ "La so nguyen to");
        }
    }


   }
    public static boolean checkSNT(int n){
        for( int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }

}
