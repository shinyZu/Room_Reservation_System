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

public class AdminLoginFormController {
    public AnchorPane contextAdminLogin;
    public JFXTextField txtLoginAdminFName;
    public JFXTextField txtLoginAdminLName;
    public JFXTextField txtLoginAdminEmail;
    public JFXPasswordField txtLoginAdminPassword;
    public Hyperlink lblSignUpAdmin;
    /*public Label lblSignUpAdmin;*/

    public void loginAsReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistLoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminLogin.getChildren().add(load);
    }
    public void loginAdminOnAction(ActionEvent actionEvent) throws IOException { //Login Button
        URL resource = getClass().getResource("../view/AdminDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminLogin.getChildren().add(load);
    }

    public void goToAdminSignUp(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminSignUpForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminLogin.getChildren().add(load);
    }
    /*public void goToAdminSignUp(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminSignUpForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminLogin.getChildren().add(load);
    }*/
}
