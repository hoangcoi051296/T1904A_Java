package Session1;

public class Assignment1_2 {
    public static void main(String args[]) {
       int x=0 , y=1 , z=0 , Tong=0;
       for( int i=0;i<20;i++){
           x=y;
           y=z;
           z=x+y;
           Tong=Tong+z;
       }
       System.out.println("Tong 20 so dau tien trong day fibonacy la : "+Tong);
    }
}
