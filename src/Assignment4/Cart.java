package Assignment4;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public int id;
    public String customer;
    public int gandTotal;
    public String city;
    public ArrayList<Product> productsList;

    public Cart(){
        productsList=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getGandTotal() {
        return gandTotal;
    }

    public void setGandTotal(int gandTotal) {
        this.gandTotal = gandTotal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Id Don Hang : ");
        setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap Ten Don Hang : ");
        setCustomer(sc.nextLine());
        System.out.println("Nhap Tong Tien: ");
        setGandTotal(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap Dia Chi : ");
        setCity(sc.nextLine());
    }

    public void Add (Product H){
        this.productsList.add(H);
    }

    public void Remove(Product H){
        this.productsList.remove(H);
    }

    public int Calculate(int Tong){
    if(getCity().equals("HN") && getCity().equals("HCM")){
        Tong= getGandTotal()*101/100;
    }else {
        Tong=getGandTotal()*102/100;
    }
    return Tong;
    }
    public void Print(){
        System.out.println("ID_cart : "+this.getId());
        System.out.println("Customer : "+this.getCustomer());
        System.out.println("Grandtotal : "+this.getGandTotal());
        System.out.println("City : "+this.getCity());
        System.out.println("Tong Tien : "+Calculate(getGandTotal()));

        for(Product H : this.productsList){
            System.out.println("ID_product : "+H.getId());
            System.out.println("Ten SP :"+H.getProductname());
            System.out.println("Gia : "+H.getPrice());
            System.out.println("So luong : "+H.getQty());
        }

}

}
