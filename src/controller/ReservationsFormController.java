package controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model.Reservation;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class ReservationsFormController {
    public AnchorPane contextReservations;

    public TableView<Reservation> tblReservation;
    public TableColumn colResId;
    public TableColumn colGuestName;
    public TableColumn colCheckIn;
    public TableColumn colCheckOut;
    public TableColumn colRoomNo;
    public TableColumn colMealPkg;
    public AnchorPane reservationsContentPane;


    ArrayList<Reservation> reservationsList = new ArrayList<>();

    {
        reservationsList.add(new Reservation("R25001","Derek Arnold","2021-05-06","2021-05-10","01","Chinese"));
        reservationsList.add(new Reservation("R25002","Mary Hudson","2021-05-12","2021-05-15","03","Local"));
        reservationsList.add(new Reservation("R25003","Micheal Watts","2021-04-05","2021-04-10","02","French"));
    }

    public void initialize(){
        colResId.setCellValueFactory(new PropertyValueFactory("resId"));
        colGuestName.setCellValueFactory(new PropertyValueFactory("guestName"));
        colCheckIn.setCellValueFactory(new PropertyValueFactory("checkIn"));
        colCheckOut.setCellValueFactory(new PropertyValueFactory("checkOut"));
        colRoomNo.setCellValueFactory(new PropertyValueFactory("roomNo"));
        colMealPkg.setCellValueFactory(new PropertyValueFactory("mealPkg"));

        tblReservation.setItems(FXCollections.observableArrayList(reservationsList));
    }

    public void goToReceptionistProfile(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistProfileForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReservations.getChildren().add(load);
    }

    public void goToPreviousPage(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReservations.getChildren().add(load);
    }

    public void goToReceptionistDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReservations.getChildren().add(load);
    }

    public void goToHotelRoomsOnActon(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReservations.getChildren().add(load);
    }

    public void goToGuestsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/GuestForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReservations.getChildren().add(load);
    }

    public void goToMaintenanceOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MaintenanceForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReservations.getChildren().add(load);
    }

    public void goToNewReservationFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/NewReservationForm.fxml");
        Parent load = FXMLLoader.load(resource);
        reservationsContentPane.getChildren().clear();
        reservationsContentPane.getChildren().add(load);
    }
}
