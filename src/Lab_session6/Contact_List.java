package Lab_session6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Contact_List implements Initializable {
    public ListView<Contact> lview = new ListView();
    public static Contact details;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/lab-session-6";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement stm =conn.createStatement();
            String sql = "Select *from person";
            ResultSet rs =stm.executeQuery(sql);

            ObservableList<Contact> list = FXCollections.observableArrayList(

            );
            while (rs.next()){
                Integer id =rs.getInt("id");
                String contact_name =rs.getString("name");
                String company =rs.getString("company_name");
                String address =rs.getString("address");
                Contact c =new Contact(id,contact_name,company,address);
                list.add(c);
            }
            lview.setItems(list);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void viewContact(){
        details =lview.getSelectionModel().getSelectedItem();
        try{
            Parent view = FXMLLoader.load(getClass().getResource("details.fxml"));
            Main.mainStage.getScene().setRoot(view);
        }
        catch (Exception e){}
    }
}
