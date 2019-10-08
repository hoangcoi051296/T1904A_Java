package Session1;

import java.util.Scanner;

public class Session1 {
    int age = 20;
    static String say = "hello";

    public static void main(String args[]){
        int x;
        x = 10;
        System.out.println("x = "+x);
        System.out.println(say);
        //System.out.println(Session1.say);
        System.out.println("Nhap 1 so tu ban phim");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Sau khi nhap x = "+x);
        Session1 ss1 = new Session1();
        System.out.println("Age = "+ ss1.age);
        int[] ary = {1,2,3,4,5};
        // int[] arr = new int[5]
        for (int i =0;i<3;i++){
            System.out.println(ary[i]);
        }
        for(int z:ary){
            System.out.println(z);
        }
    }

}
