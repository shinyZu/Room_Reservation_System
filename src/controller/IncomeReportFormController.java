package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class IncomeReportFormController {
    public AnchorPane contextIncomeReports;

    public void goToAdminProfile(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminProfileForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextIncomeReports.getChildren().add(load);
    }

    public void goToPreviousPage(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextIncomeReports.getChildren().add(load);
    }

    public void goToDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextIncomeReports.getChildren().add(load);
    }

    public void goToRoomsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextIncomeReports.getChildren().add(load);
    }

    public void goToMealPkgOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealPackageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextIncomeReports.getChildren().add(load);
    }
}
