package Assignment4;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Product P = new Product();
        P.input();

        Cart C = new Cart();
        C.nhap();


        C.Add(P);
        C.Print();

    }
}
