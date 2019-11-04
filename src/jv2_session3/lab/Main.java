package jv2_session3.lab;

public class Main {
    public static void main(String args[]){
//        Runnable r1 = ()->{
//            for(int i=10;i>0;i--)
//                try {
//                    System.out.println(i);
//                    Thread.sleep(1000);
//                    if(i == 1){
//                        System.out.println("Chuc mung");
//                    }
//                }catch (Exception e){
//
//                }
//        };
//        Thread t =new Thread(r1);
//        t.start();

        Runnable r1 = ()->{
            for(int i=9;i>=0;i--){
                try {
                    for (int j=59;j>=0;j--){
                        try {
                            System.out.println(i+":"+j);
                            Thread.sleep(1000);
                            if(i==0 && j==0){
                                System.out.println("Chuc mung");
                            }
                        }catch (Exception e){

                        }
                    }
                }catch (Exception e){

                }

            }
        };

        Thread t =new Thread(r1);
        t.start();
    }
}
