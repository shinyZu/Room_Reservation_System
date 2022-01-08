package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class AdminSignUpFormController {
    public AnchorPane contextAdminSignUp;
    public JFXTextField txtSignUpAdminFName;
    public JFXTextField txtSignUpAdminLName;
    public JFXTextField txtSignUpAdminEmail;
    public JFXPasswordField txtSignUpAdminPassword;
    public Hyperlink lblLoginAdmin;
    /*public Label lblLoginAdmin;*/

    public void signUpAsReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistSignUpForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminSignUp.getChildren().add(load);
    }
    public void signUpAdminOnAction(ActionEvent actionEvent) throws IOException { //Sign Up Button
        URL resource = getClass().getResource("../view/AdminDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminSignUp.getChildren().add(load);
    }

    public void goToAdminLogin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminLoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminSignUp.getChildren().add(load);
    }
}
