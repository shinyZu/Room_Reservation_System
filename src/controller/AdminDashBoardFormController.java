package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class AdminDashBoardFormController {
    public AnchorPane contextAdminDashboard;
    public ImageView adminProfile;

    public void goToRoomsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminDashboard.getChildren().add(load);
    }

    public void goToMealPkgOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealPackageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminDashboard.getChildren().add(load);
    }

    public void goToIncomeReportsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/IncomeReportForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminDashboard.getChildren().add(load);
    }

    public void goToAdminProfile(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminProfileForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminDashboard.getChildren().add(load);
    }
}
