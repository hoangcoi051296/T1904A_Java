package Lab_session6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;


public class ContactDetails implements Initializable {
    public Text txt =new Text();
    public ListView<PhoneNumber> lview =new ListView<>();
    private String sql_txt ="Select * from phone where c_id =?";
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txt.setText(Contact_List.details.getName());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/lab-session-6";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);
            PreparedStatement prstm =conn.prepareStatement(sql_txt);
            prstm.setInt(1,Contact_List.details.getId());
            ResultSet rs= prstm.executeQuery();

            ObservableList<PhoneNumber> list = FXCollections.observableArrayList(

            );
            while (rs.next()){
                Integer id =rs.getInt("id");
                String tel =rs.getString("phone_number");
                String type =rs.getString("type_number");
                PhoneNumber p =new PhoneNumber(id,tel,type);
                list.add(p);
            }
            lview.setItems(list);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void back(){
        try{
            Parent view = FXMLLoader.load(getClass().getResource("contact.fxml"));
            Main.mainStage.getScene().setRoot(view);
        }
        catch (Exception e){

        }
    }
}
