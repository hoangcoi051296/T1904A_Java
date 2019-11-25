package Jv2_Practical;

        import java.io.DataOutputStream;
        import java.io.File;
        import java.io.FileOutputStream;
        import java.util.ArrayList;
        import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        ArrayList<Student> DS =new ArrayList<>();
        boolean p= true;
        Scanner sc =new Scanner(System.in);
        while (p){
            System.out.println("1. Add student records");
            System.out.println("2. Display student records");
            System.out.println("3. Save");
            System.out.println("4. Exit");

            int opt = sc.hasNextInt()?sc.nextInt():5;

            switch (opt){
                case 1: DS.add(Program.Add());break;
                case 2 :Display(DS);break;
                case 3 :
                    Program.Save(DS);break;
                case 4 : p=false;break;

            }

        }
    }

    public static Student Add() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap id : ");
        int id =sc.hasNextInt()?sc.nextInt():0;
        sc.nextLine();
        System.out.println("Nhap ten : ");
        String name= sc.nextLine();
        System.out.println("Nhap dia chi : ");
        String adress=sc.nextLine();
        System.out.println("Nhap so dien thoai : ");
        String phone =sc.nextLine();
        return new Student(id,name,adress,phone);
    }

    public static void Display(ArrayList<Student> studentList){
        for(Student s : studentList){
            System.out.println(s.getStudenID()+"--"+ s.getStudentName()+"--"+s.getAddress()+"--"+s.getPhone());
        }

    }

    public static void Save(ArrayList<Student> studentList){
        File f = new File("C:\\Users\\thaih\\OneDrive\\Desktop\\practical.txt");
        String ftxt = "";
        for(Student s : studentList){
            if (f.canWrite()){
                String v = s.getStudenID()+"--"+ s.getStudentName()+"--"+s.getAddress()+"--"+s.getPhone()+"\n";
                try {
                    FileOutputStream fos = new FileOutputStream(f);
                    DataOutputStream dos = new DataOutputStream(fos);
                    dos.writeBytes(ftxt + v);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }
}
