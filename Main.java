package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        mainStage=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Listuser.fxml"));
        primaryStage.setTitle("Danh sach");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
