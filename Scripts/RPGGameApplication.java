/*
I am using this file to try and connect our project to the javaFX files.
Just learning how it all works!
 */

//you can add a package, but I am going to see if I have to first.
//All of these imports are on the default application class when making a new javaFX project.

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RPGGameApplication extends Application{

    public void start(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(RPGGameApplication.class.getResource("TitleScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600); //I would prefer to lock the game at 800x600px
        stage.setTitle("Test!");
        stage.setScene(scene);
        stage.show();
    }
}
