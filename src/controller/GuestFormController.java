package controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model.Guest;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class GuestFormController {
    public AnchorPane contextGuests;

    public TableView<Guest> tblGuests;
    public TableColumn colGuestNo;
    public TableColumn colGuestName;
    public TableColumn colNIC;
    public TableColumn colContact;
    public TableColumn colEmail;
    public TableColumn colAddress;
    public TableColumn colResID;
    public TableColumn colRoomNo;

    ArrayList<Guest> guestsList = new ArrayList<>();

    {
        guestsList.add(new Guest("01","Richard Clark","MS1234","234 432","richard@gmail.com","New York","R25001","01"));
        guestsList.add(new Guest("02","Wilma Leon","MS2345","239 932","wilma@gmail.com","Florida","R25002","05"));
        guestsList.add(new Guest("03","Linda Odem","MS3456","229 922","linda@gmail.com","Georgia","R25003","04"));
        guestsList.add(new Guest("04","Timon Bird","MS4567","201 551","timon@gmail.com","New Jersey","R25004","03"));
        guestsList.add(new Guest("05","Jena Palmer","MS5678","972 945","jena@gmail.com","Texas","R2500","06"));
        guestsList.add(new Guest("06","Kylee Cruz","MS6789","206 253","kylee@gmail.com","Washington","R25006","04"));
        guestsList.add(new Guest("07","Edward Adams","MS7891","216 612","edward@gmail.com","Ohio","R25007","02"));
        guestsList.add(new Guest("08","David Obrien","MS8912","505 575","david@gmail.com","New Mexico","R25008","08"));
        guestsList.add(new Guest("09","James Strickland","MS9123","301 240","james@gmail.com","Maryland","R25009","10"));
        guestsList.add(new Guest("10","Cameron Joseph","MS9510","620 785","cameron@gmail.com","Kansas","R25010","10"));
    }

    public void initialize(){
        colGuestNo.setCellValueFactory(new PropertyValueFactory("guestNo"));
        colGuestName.setCellValueFactory(new PropertyValueFactory("guestName"));
        colNIC.setCellValueFactory(new PropertyValueFactory("NIC"));
        colContact.setCellValueFactory(new PropertyValueFactory("contactNo"));
        colEmail.setCellValueFactory(new PropertyValueFactory("guestEmail"));
        colAddress.setCellValueFactory(new PropertyValueFactory("guestAddress"));
        colResID.setCellValueFactory(new PropertyValueFactory("resID"));
        colRoomNo.setCellValueFactory(new PropertyValueFactory("roomNo"));

        tblGuests.setItems(FXCollections.observableArrayList(guestsList));
    }

    public void goToReceptionistProfile(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistProfileForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextGuests.getChildren().add(load);
    }

    public void goToPreviousPage(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextGuests.getChildren().add(load);
    }

    public void goToReceptionistDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextGuests.getChildren().add(load);
    }

    public void goToHotelRoomsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextGuests.getChildren().add(load);
    }

    public void goToReservationsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReservationsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextGuests.getChildren().add(load);
    }

    public void goToMaintenanceOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MaintenanceForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextGuests.getChildren().add(load);
    }


}
