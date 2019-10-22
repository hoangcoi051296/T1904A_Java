package Lab7;

import java.util.*;

public class Program {

    public static void main(String args[]){
        ArrayList<Students> DS =new ArrayList<>();
    boolean p= true;
    Scanner sc =new Scanner(System.in);
    while (p){
        System.out.println("1. Add student");
        System.out.println("2. Edit student by id");
        System.out.println("3. Delete student by id");
        System.out.println("4. Sort student by gpa");
        System.out.println("5. Sort student by name");
        System.out.println("6. Show student");
        System.out.println("0. Exit");
        int opt = sc.hasNextInt()?sc.nextInt():7;

        switch (opt){
            case 1: DS.add(Program.add());break;
//            case 4:
//                Collections.sort(DS, new Comparator<Students>() {
//                    @Override
//                    public int compare(Students o1, Students o2) {
//                        if (o1.getGpa()>o2.getGpa()){
//                            return -1;
//                        }
//                        return 0;
//                    }
//                });break;
            case 2 : edit(DS);break;
            case 4 :Collections.sort(DS);
            case 5 :
                Collections.sort(DS, new Comparator<Students>() {
                    @Override
                    public int compare(Students o1, Students o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });break;

            case 6 :
                for(Students s : DS){
                    System.out.println(s.getId()+"--"+ s.getName()+"--"+s.getAge()+"--"+s.getAddress()+"--"+s.getGpa());
                }
                break;

            case 0 : p=false;break;

        }

    }

    }

    public static Students add(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap id : ");
        int id =sc.hasNextInt()?sc.nextInt():0;
        sc.nextLine();
        System.out.println("Nhap ten : ");
        String name= sc.nextLine();
        System.out.println("Nhap tuoi : ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi : ");
        String adress=sc.nextLine();
        System.out.println("Nhap gpa : ");
        Float gpa =sc.nextFloat();
        return new Students(id,name,age,adress,gpa);




    }

    public static void edit(ArrayList<Students> studentList){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap id muon sua : ");
        int id =sc.hasNextInt()?sc.nextInt():0;
        sc.nextLine();
        for(Students s: studentList){
            if(s.getId()==id){
                System.out.println("Nhap ten : ");
                String name= sc.nextLine();
                System.out.println("Nhap tuoi : ");
                int age=sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap dia chi : ");
                String adress=sc.nextLine();
                System.out.println("Nhap gpa : ");
                Float gpa =sc.nextFloat();
                return;
            }
        }
        }






}


