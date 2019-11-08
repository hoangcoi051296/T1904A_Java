package Jv2_session4.lab;

public class Main {
    public static void main(String args[]){
        SNT s=new SNT();
        new Thread(()->{
            for(int i=0;i<100;i++){
                s.timSoNguyenTotieptheo();
                try{
                    Thread.sleep(1000);
                }catch (Exception e){}
            }

        }).start();
        new Thread(()->{
            for(int i=0;i<100;i++){
                s.binhPhuong();
                try{
                    Thread.sleep(1000);
                }catch (Exception e){}
            }

        }).start();
    }
}
