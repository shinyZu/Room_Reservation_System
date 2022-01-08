package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class MaintenanceFormController {
    public AnchorPane contextMaintenance;

    public void goToPreviousPage(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMaintenance.getChildren().add(load);
    }

    public void goToReceptionistProfile(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistProfileForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMaintenance.getChildren().add(load);
    }

    public void goToReceptionistDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMaintenance.getChildren().add(load);
    }

    public void goToHotelRoomsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMaintenance.getChildren().add(load);
    }

    public void goToGuestsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/GuestForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMaintenance.getChildren().add(load);
    }

    public void gotoReservationsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReservationsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextMaintenance.getChildren().add(load);
    }
}
