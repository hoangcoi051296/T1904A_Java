package Session1;

import java.util.Scanner;

public class Assignment1_1 {

   public static void main( String args[]){
        int n,i,j, dem=0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap 1 so n tu ban phim : ");
       n = sc.nextInt();
       for (i=2;i<=n;i++)
       {
           for (j=1;j<=i;j++)
           {
               if(i%j==0)
                   dem++;
           }
           if(dem==2)
               System.out.println("So nguyen to nho hon n la : "+i);
           dem=0;
       }

   }
}
