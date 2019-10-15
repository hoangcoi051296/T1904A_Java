package Assignment4;

import java.util.Scanner;

public class Product {
    public int id;
    public String Productname;
    public int qty;
    public int price;

    public Product(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductname() {
        return Productname;
    }

    public void setProductname(String productname) {
        Productname = productname;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int id, String Productname, int qty, int price){
    if(qty>0){
        System.out.println("Con hang!");
    }else {
        System.out.println("Het hang!");
    }
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID San Pham : ");
        setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap Ten San Pham: ");
        setProductname(sc.nextLine());
        System.out.println("Nhap SL : ");
        setQty(sc.nextInt());
        System.out.println("Nhap Gia San Pham: ");
        setPrice(sc.nextInt());
    }

}
