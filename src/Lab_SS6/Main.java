package Lab_SS6;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        News  n = new News();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap id : ");
        int id = sc.hasNextInt()?sc.nextInt():0;
        n.setID(id);
        sc.nextLine();
        System.out.println("Nhap tittle : ");
        n.setTittle(sc.nextLine());
        System.out.println("Nhap publishDate : ");
        n.setPublistDate(sc.nextLine());
        System.out.println("Nhap author : ");
        n.setAuthor(sc.nextLine());
        System.out.println("Nhap content : ");
        n.setContent(sc.nextLine());


        System.out.println("Nhap 3 so rateList : ");

        for(int i=0;i<3;i++){
            n.ratelist[i] = sc.hasNextInt()?sc.nextInt():0;

        }
        n.Display();
        n.Caculate();
        n.Display();
    }
}
