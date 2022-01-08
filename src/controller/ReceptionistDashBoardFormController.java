package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class ReceptionistDashBoardFormController {
    public AnchorPane contextReceptionistDashboard;
    public ImageView receptionistProfile;

    public void goToReceptionistProfile(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistProfileForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistDashboard.getChildren().add(load);
    }

    public void goToHotelRoomsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistDashboard.getChildren().add(load);
    }

    public void goToGuestsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/GuestForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistDashboard.getChildren().add(load);
    }

    public void goToReservationsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReservationsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistDashboard.getChildren().add(load);
    }

    public void goToMaintenanceOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MaintenanceForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistDashboard.getChildren().add(load);
    }
}
