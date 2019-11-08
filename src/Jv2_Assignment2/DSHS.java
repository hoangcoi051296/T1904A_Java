package Jv2_Assignment2;

import Jv2_Assignment1.Sp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DSHS implements Initializable {
    public static ObservableList<Hs> list = FXCollections.observableArrayList();
    public TableView<Hs> tbView =new TableView<Hs>();
    public TableColumn<Sp,String> Tten = new TableColumn<>();
    public TableColumn<Sp,Integer> Ttuoi = new TableColumn<>();
    public TableColumn<Sp,Integer> Tdiemthi = new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       Tten.setCellValueFactory(new PropertyValueFactory<>("ten"));
        Ttuoi.setCellValueFactory(new PropertyValueFactory<>("tuoi"));
        Tdiemthi.setCellValueFactory(new PropertyValueFactory<>("diemthi"));
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1904a";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DSHS.fxml"));
            Statement stm =conn.createStatement();

            String sql = "Select *from student";

            ResultSet rs =stm.executeQuery(sql);

            while (rs.next()){
               String x = rs.getString("student_name");
               int y =rs.getInt("age");
               int z= rs.getInt("mark");
               Hs s =new Hs(x,y,z);
               list.add(s);

            }
            tbView.setItems(list);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void addHs(){
        try{
            Parent form = FXMLLoader.load(getClass().getResource("ThemHs.fxml"));
           Main.mainStage.getScene().setRoot(form);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
