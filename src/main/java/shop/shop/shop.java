package shop.shop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class shop extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(shop.class.getResource("loginSystem.fxml"));
        Scene scene = new Scene(fxmlLoader.load());


        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/logo.png")));
        stage.getIcons().add(image);
        stage.setTitle("J Mobile");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
