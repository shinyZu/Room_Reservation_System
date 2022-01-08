package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class AdminProfileFormController {
    public AnchorPane contextAdminProfile;
    public ImageView adminProfileBtnBack;
    public JFXButton btnAdminLogout;

    public void goToPreviousPage(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminProfile.getChildren().add(load);
    }

    public void logOutAdminOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminProfile.getChildren().add(load);
    }
}
