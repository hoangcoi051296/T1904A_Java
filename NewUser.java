package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.jws.soap.SOAPBinding;

public class NewUser {
    public TextField txtFullname = new TextField();
    public TextField txtEmail =new TextField();
    public TextField txtAge = new TextField();
    public TextArea  txtAddress = new TextArea();

    public void submitUser(){
        try{
            String fn =txtFullname.getText();
            String em =txtEmail.getText();
            Integer ag ;
            try{
              ag=  Integer.parseInt(txtAge.getText());
            }catch (Exception e){
                ag=0;
            }
            String add =txtAddress.getText();
            User u =new User(fn,em,ag,add);
            ListUser.list.add(u);

            Parent listUser = FXMLLoader.load(getClass().getResource("Listuser.fxml"));
            Main.mainStage.getScene().setRoot(listUser);
        }catch (Exception e){

        }
    }
}

