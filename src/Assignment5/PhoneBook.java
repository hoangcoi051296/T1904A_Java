package Assignment5;

import java.util.ArrayList;

public  abstract class PhoneBook extends Phone {
    ArrayList<User> Phonelist = new ArrayList<>();
    public void insertPhone(String name, String phone){
    for(User u : Phonelist){
        if(u.name.equals(name)){
            if(!u.phone.contains(phone)){
                u.phone= u.phone+":"+ phone;
            }
        }else {
            u.name= name;
            u.phone= phone;
            Phonelist.add(u);
        }
    }
    }

    public void removePhone(String name){
        for(User u : Phonelist){
            if(u.name.equals(name)){
                Phonelist.remove(u);
                System.out.println("Xoa thanh cong");
            }
            System.out.println("Khong tim thay ten trong danh ba");
        }
    }

    public void updatePhone(String name, String newphone){
        for(User u :Phonelist){
            if(u.name.equals(name)){
                u.phone=newphone;
                System.out.println("Cap nhat thanh cong");
            }
            System.out.println("Khong tim thay ten trong danh ba");
        }
    }

    public void seachPhone(String name){
        for (User u : Phonelist){
            if(u.name.equals(name)){
                System.out.println(u.name + "co so dien thoai la"+u.phone);
            }
            System.out.println("Khong tim thay");
        }
    }

    public void sort(){

    }
}
