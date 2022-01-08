package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class ReceptionistLoginFormController {
    public AnchorPane contextReceptionistLogin;
    public JFXTextField txtLoginReceptionistFName;
    public JFXTextField txtLoginReceptionistLName;
    public JFXTextField txtLoginReceptionistEmail;
    public JFXPasswordField txtLoginReceptionistPassword;
    public Hyperlink lblSignUpReceptionist;
    /*public Label lblSignUpReceptionist;*/

    public void loginAsAdminOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminLoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistLogin.getChildren().add(load);
    }

    public void loginReceptionistOnAction(ActionEvent actionEvent) throws IOException { //Login Button
        URL resource = getClass().getResource("../view/ReceptionistDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistLogin.getChildren().add(load);
    }

    public void goToReceptionistSignUp(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistSignUpForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistLogin.getChildren().add(load);
    }
   /* public void goToReceptionistSignUp(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistSignUpForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistLogin.getChildren().add(load);
    }*/
}
