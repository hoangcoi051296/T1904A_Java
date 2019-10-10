package Session2;

import java.util.Scanner;

public class Session2 {
    private String name;
    public int age;
    public static  String abc = "Good";

    public Session2(){
//        System.out.println("Vua tao 1 doi tuong ss2 xong");
        inputInfo();
        showInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void  inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten : ");
        setName(sc.nextLine());
        System.out.println("Nhap Tuoi");
        setAge(sc.nextInt());


    }

    public void showInfo(){
        System.out.println("Fullname : " +name);
//    System.out.println("Fullname : " +this.name);
        System.out.println("Age : "+age);


    }

    public static void main(String args[]){
        Session2 ss2 =new Session2();
        Session2 ss3 = new Session2();
        System.out.println("So Sanh");
        System.out.println("SS2 name"+ss2.getName());
        System.out.println(("SS3 name"+ss3.getName()));

    }

    public static void sayHello() {
        System.out.println("Hello world!");
        System.out.println(abc);

    }
}


