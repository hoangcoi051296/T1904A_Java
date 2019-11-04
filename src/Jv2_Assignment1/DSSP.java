package Jv2_Assignment1;

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
import java.util.ResourceBundle;

public class DSSP implements Initializable {
    public static ObservableList<Sp> list = FXCollections.observableArrayList();
    public TableView<Sp> tbView =new TableView<>();
    public TableColumn<Sp,String>xname = new TableColumn<>();
    public TableColumn<Sp,String> xid = new TableColumn<>();
    public TableColumn<Sp,Integer> xprice = new TableColumn<>();
    public TableColumn<Sp,Integer> xsalary = new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        xname.setCellValueFactory(new PropertyValueFactory<>("name"));
        xid.setCellValueFactory(new PropertyValueFactory<>("ID"));
        xprice.setCellValueFactory(new PropertyValueFactory<>("price"));
        xsalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        tbView.setItems(list);
    }
    public void addSP(){
        try{
            Parent form = FXMLLoader.load(getClass().getResource("ThemSP.fxml"));
            Main.mainStage.getScene().setRoot(form);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void sortByname(){

        try {
            Collections.sort(list, new Comparator<Sp>() {

                public int compare(Sp o1, Sp o2) {
                    return o1.getName().compareTo(o2.getName());
                }

            });
            Parent listSP = FXMLLoader.load(getClass().getResource("DSSp.fxml"));
           Main.mainStage.getScene().setRoot(listSP);
        }catch (Exception e){

        }
    }

    public void sortByPrice(){
       try {
           Collections.sort(list, new Comparator<Sp>() {
               @Override
               public int compare(Sp o1, Sp o2) {
                   if (o1.getPrice()>o2.getPrice()){
                       return 1;
                   }
                   return -1;
               }
           });
           Parent listSP = FXMLLoader.load(getClass().getResource("DSSp.fxml"));
           Main.mainStage.getScene().setRoot(listSP);
       }catch (Exception e){

       }

}
    public void sortBySalary(){
        try {
            Collections.sort(list, new Comparator<Sp>() {
                @Override
                public int compare(Sp o1, Sp o2) {
                    if (o1.getSalary()>o2.getSalary()){
                        return 1;
                    }
                    return -1;
                }
            });
            Parent listSP = FXMLLoader.load(getClass().getResource("DSSp.fxml"));
            Main.mainStage.getScene().setRoot(listSP);
        }catch (Exception e){

        }

    }
}
