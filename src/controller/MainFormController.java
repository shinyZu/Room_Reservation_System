package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class MainFormController {
    public AnchorPane contextMainPage;

    public void signUpOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminSignUpForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMainPage.getChildren().add(load);
    }

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminLoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMainPage.getChildren().add(load);
    }


}
