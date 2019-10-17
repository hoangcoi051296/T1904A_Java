package Lab_Session5;

public class Main {
    public static void main(String  args[]){
//        String birthday = "1996-12-05";
//        String[] arr = birthday.split("-");
//        for ( int i=0; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        int year = Integer.parseInt(arr[0]);
        Person p =new Person();
        p.inputInfo();
        p.showInfo();
        Student s =new Student(p.getTen(),p.getGioitinh(),p.getNgaysinh(),p.getDiachi());


    }
}
