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

public class ReceptionistSignUpFormController {
    public AnchorPane contextReceptionistSignUp;
    public JFXTextField txtSignUpReceptionistFName;
    public JFXTextField txtSignUpReceptionistLName;
    public JFXTextField txtSignUpReceptionistEmail;
    public JFXPasswordField txtSignUpReceptionistPassword;
    public Hyperlink lblLoginReceptionist;
    /*public Label lblLoginReceptionist;*/

    public void signUpAsAdminOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminSignUpForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistSignUp.getChildren().add(load);
    }
    public void signUpReceptionistOnAction(ActionEvent actionEvent) throws IOException { //Sign Up Button
        URL resource = getClass().getResource("../view/ReceptionistDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistSignUp.getChildren().add(load);
    }
    public void goToReceptionistLogin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistLoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistSignUp.getChildren().add(load);
    }

}
