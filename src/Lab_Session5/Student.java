package Lab_Session5;

public class Student extends Person {
    public Student(String ten, String gioitinh, String ngaysinh, String diachi) {
        super(ten, gioitinh, ngaysinh, diachi);
    if(!check18tuoi()){
        System.out.println("SV chua du 18 tuoi");
    }else {
        System.out.println("Sv du 18 tuoi");
    }
    }
    String birthday= getNgaysinh();
    String[] arr = birthday.split("-");

    public boolean check18tuoi(){
//        for ( int i=0; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        int year = Integer.parseInt(arr[0]);
        if(2019-year>=18){
            return true;
        }
        return false;
    }
}
