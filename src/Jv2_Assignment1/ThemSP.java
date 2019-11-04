package Jv2_Assignment1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class ThemSP {
    public TextField Tname =new TextField();
    public TextField Tid =new TextField();
    public TextField Tprice =new TextField();
    public TextField Tsalary =new TextField();

    public void submitSP(){
        try{
            String fn =Tname.getText();
            String em =Tid.getText();
//            Integer pr=  Integer.parseInt(Tprice.getText());
//            Integer sl=  Integer.parseInt(Tsalary.getText());
            Integer pr ;
            try{
                pr=  Integer.parseInt(Tprice.getText());
            }catch (Exception e){
                pr=0;
            }
            Integer sl ;
            try{
                sl=  Integer.parseInt(Tsalary.getText());
            }catch (Exception e){
                sl=0;
            }
            Sp u =new Sp(fn,em,pr,sl);
            DSSP.list.add(u);

            Parent listsp = FXMLLoader.load(getClass().getResource("DSSp.fxml"));
            Main.mainStage.getScene().setRoot(listsp);
        }catch (Exception e){
        System.out.println(e.getMessage());
        }
    }
}
