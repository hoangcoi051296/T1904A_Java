package Practical_Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class List_hotel {
    public static void main(String args[]){
        ArrayList<Hotel> list =new ArrayList<>();
        boolean p= true;
        Scanner sc =new Scanner(System.in);
    while (p){
        System.out.println("1. Add Hotel");
        System.out.println("2. Search Hotel by Owner Name");
        System.out.println("3. Show all hotel");
        int opt = sc.hasNextInt()?sc.nextInt():4;

        switch (opt){
            case 1 : list.add(List_hotel.add());break;
            case 2 :search(list); break;
            case 3 :
                for(Hotel s : list){
                    System.out.println("Name : "+s.getName()+"--"+"Location : "+ s.getLocation()+"--"+"OwnerName : "+s.getOwnerName());
                }
                break;
        }

    }

    }
    public static Hotel add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name =sc.nextLine();
        System.out.println("Enter location : ");
        String location =sc.nextLine();
        System.out.println("Enter ownerName : ");
        String ownerName =sc.nextLine();
        return new Hotel(name,location,ownerName);
    }

    public static void search(ArrayList<Hotel> list){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        for(Hotel s: list){
            if(s.getName().equals(name)){
                System.out.println("Name : "+s.getName()+"--"+ "Location : "+ s.getLocation()+"--"+"OwnerName : "+s.getOwnerName());
                return;
            } else {
            System.out.println("No hotel found!");
            }
        }
        }


}
