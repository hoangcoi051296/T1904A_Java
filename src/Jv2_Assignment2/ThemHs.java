package Jv2_Assignment2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class ThemHs {
    public TextField Ten=new TextField();
    public TextField Tuoi =new TextField();
    public TextField Diemthi =new TextField();

    public void submit(){
        ArrayList<Hs> arr = new ArrayList<>();
        File f = new File("C:\\Users\\thaih\\OneDrive\\Desktop\\demo.txt");
        String ftxt = "";

       try {
           String te = Ten.getText();
           Integer tu;
           try {
               tu=Integer.parseInt(Tuoi.getText());
           }catch (Exception e){
               tu=0;
           }
           Integer di;
           try {
               di=Integer.parseInt(Diemthi.getText());
           }catch (Exception e){
               di=0;
           }
           Hs h =new Hs(te,tu,di);
           DSHS.list.add(h);

           Class.forName("com.mysql.jdbc.Driver");
           String url = "jdbc:mysql://localhost:3306/t1904a";
           String username = "root";
           String password = "";
           Connection conn = DriverManager.getConnection(url,username,password);

           Statement stm =conn.createStatement();

           String ins_sql ="Insert into student(student_name, age ,mark)  values ('"+te+"',"+tu+","+di+");";
           stm.executeUpdate(ins_sql);

           Parent lisths = FXMLLoader.load(getClass().getResource("DSHS.fxml"));
           Main.mainStage.getScene().setRoot(lisths);
           if (f.canWrite()) {
               String u = te + "-" + tu + "-" + di + "\n";
               try {
                   FileOutputStream fos = new FileOutputStream(f);
                   DataOutputStream dos = new DataOutputStream(fos);
                   dos.writeBytes(ftxt + u);
               } catch (IOException e) {
                   System.out.println(e.getMessage());
               }
           }
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
