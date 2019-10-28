package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.Observable;
import java.util.ResourceBundle;

public class ListUser implements Initializable{
    public static  ObservableList<User> list = FXCollections.observableArrayList();
    public TableView<User> tbView =new TableView<>();
    public TableColumn<User,String> fullname= new TableColumn<>();
    public TableColumn<User,String> email = new TableColumn<>();
    public TableColumn<User,Integer> age = new TableColumn<>();
    public TableColumn<User,String> address = new TableColumn<>();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        fullname.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));
        age.setCellValueFactory(new PropertyValueFactory<>("age"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));

//        User u1 =new User("DTH","DTH@gmail.com",20,"YN,HN");
//        User u2 =new User("NVA","NVA@gmail.com",19,"DD,HN");
//        ObservableList<User> list = FXCollections.observableArrayList();
//        list.add(u1);
//        list.add(u2);
        tbView.setItems(list);
    }
    public void addUser(){
       try {
           Parent newuser = FXMLLoader.load(getClass().getResource("Newuser.fxml"));
           Main.mainStage.getScene().setRoot(newuser);
       }catch (Exception e){

       }
    }
    public void aZ(){

        try {
            Collections.sort(list, new Comparator<User>() {

                public int compare(User o1, User o2) {
                    return o1.getFullName().compareTo(o2.getFullName());
                }

            });
            Parent listUser = FXMLLoader.load(getClass().getResource("Listuser.fxml"));
            Main.mainStage.getScene().setRoot(listUser);
        }catch (Exception e){

        }
    }


    public void zA(){
        try {
            Collections.sort(list, new Comparator<User>() {

                public int compare(User o1, User o2) {
                    return o2.getFullName().compareTo(o1.getFullName());
                }

            });
            Parent listUser = FXMLLoader.load(getClass().getResource("Listuser.fxml"));
            Main.mainStage.getScene().setRoot(listUser);
        }catch (Exception e){

        }
    }
}
