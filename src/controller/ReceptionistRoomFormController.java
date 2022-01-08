package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model.Room;
import view.tm.AvailableRoomTM;
import view.tm.RoomTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

import static javafx.collections.FXCollections.observableArrayList;

public class ReceptionistRoomFormController {
    public AnchorPane contextReceptionistRooms;

    public TableView<AvailableRoomTM> tblReceptionistRoom;
    public TableColumn colRoomNo;
    public TableColumn colRoomType;
    public TableColumn colFloorNo;
    public TableColumn colCapacity;
    public TableColumn colBedType;
    public TableColumn colNoOfBeds;
    public TableColumn colRoomStatus;
    public TableColumn colRoomPrice;
    public TableColumn colSpecialOffer;

    //public JFXTextField hrdRoomStatus;
    public JFXTextField hrdPrice;
    public JFXComboBox hrdRoomType;
    public JFXComboBox hrdRoomNo;
    public JFXComboBox hrdCapacity;
    public JFXComboBox hrdRoomStatus;
    public JFXButton btnCheckAvailability;
    public JFXButton btnRefresh;


    public void goToReceptionistProfile(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistProfileForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistRooms.getChildren().add(load);
    }
    /*public void goToPreviousPage(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("view/ReceptionistDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistRooms.getChildren().add(load);
    }*/
    public void goToRecPreviousPage(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistRooms.getChildren().add(load);
    }

    public void goToReceptionistDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistRooms.getChildren().add(load);
    }

    public void goToGuestsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/GuestForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistRooms.getChildren().add(load);
    }

    public void goToReservationsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReservationsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistRooms.getChildren().add(load);
    }

    public void goToMaintenanceOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MaintenanceForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistRooms.getChildren().add(load);
    }

    ArrayList<Room> roomList = new ArrayList<>();

    {
        roomList.add(new Room("01","01","Single","01","Single","01","Available","USD 42","NA"));
        roomList.add(new Room("01","02","Single","01","Twin","01","Reserved","USD 50","NA"));
        roomList.add(new Room("01","03","Double","02","Double","01","Not Available","USD 65","NA"));
        roomList.add(new Room("01","04","Double","02","Twin","02","Occupied","USD 70","NA"));
        roomList.add(new Room("02","05","Double","02","Queen-sized","02","Under Maintenance","USD 70","NA"));
        roomList.add(new Room("02","06","Triple","03","Single,Double","02","Available","USD 80","NA"));
        roomList.add(new Room("02","07","Triple","03","Twin,Double","02","Reserved","USD 82","NA"));
        roomList.add(new Room("02","08","Quad","04","Double","02","Available","USD 85","NA"));
        roomList.add(new Room("03","09","Quad","04","Twin,Double","03","Occupied","USD 90","NA"));
        roomList.add(new Room("03","10","Quad","04","Twin","04","Available","USD 95","NA"));

    }

    public void initialize(){

        ObservableList<AvailableRoomTM> tmInitialList = observableArrayList();

        colFloorNo.setCellValueFactory(new PropertyValueFactory<>("floorNo"));
        colRoomNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        colRoomType.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colCapacity.setCellValueFactory(new PropertyValueFactory<>("capacity"));
        colBedType.setCellValueFactory(new PropertyValueFactory<>("bedType"));
        colNoOfBeds.setCellValueFactory(new PropertyValueFactory<>("noOfBeds"));
        colRoomStatus.setCellValueFactory(new PropertyValueFactory<>("roomStatus"));
        colRoomPrice.setCellValueFactory(new PropertyValueFactory<>("roomPrice"));
        colSpecialOffer.setCellValueFactory(new PropertyValueFactory<>("specialOffer"));

        for ( Room r : roomList) {
            //tmInitialList.add(new AvailableRoomTM(room));
            tmInitialList.add(new AvailableRoomTM(r.getFloorNo(),r.getRoomNo(), r.getRoomType(), r.getCapacity(),r.getBedType(),r.getNoOfBeds(), r.getRoomStatus(),r.getRoomPrice(),r.getSpecialOffer()));
            tblReceptionistRoom.setItems(tmInitialList);
        }


        for (int i = 1; i <= 25; i++){
            String s = String.valueOf(i);
            hrdRoomNo.getItems().addAll(s);
        };

        hrdRoomType.getItems().addAll(
                "Single",
                "Double",
                "Triple",
                "Quad",
                "none"
        );

        hrdCapacity.getItems().addAll("01","02","03","04","05","06");

       hrdRoomStatus.getItems().addAll(
                "Available",
                "Not Available",
                "Reserved",
                "Occupied",
                "Under Maintenance",
               "none"
        );

    }
    public void checkAvailabilityOnAction(ActionEvent actionEvent) {
        ObservableList<AvailableRoomTM> tmFilterList = observableArrayList();

         for (Room r : roomList) {
            if(r.getRoomNo().equals(hrdRoomNo.getValue()) || r.getRoomType().equals(hrdRoomType.getValue()) ||r.getCapacity().equals(hrdCapacity.getValue())
                    || r.getRoomStatus().equals(hrdRoomStatus.getValue()) || r.getRoomPrice().equals(hrdPrice.getText()) )
            /*if(r.getRoomNo().contains((CharSequence) hrdRoomNo.getValue()) || r.getRoomType().contains((CharSequence) hrdRoomType.getValue()) ||r.getCapacity().contains((CharSequence) hrdCapacity.getValue())
                    || r.getRoomStatus().contains((CharSequence) hrdRoomStatus.getValue()) || r.getRoomPrice().contains(hrdPrice.getText()))*/
            {
                tmFilterList.add(new AvailableRoomTM(r.getFloorNo(),r.getRoomNo(), r.getRoomType(), r.getCapacity(),r.getBedType(),r.getNoOfBeds(), r.getRoomStatus(),r.getRoomPrice(),r.getSpecialOffer()));
                tblReceptionistRoom.setItems(tmFilterList);
                /*hrdRoomNo.setValue(null);
                hrdRoomType.setValue(null);
                hrdCapacity.setValue(null);
                hrdRoomStatus.setValue(null);
                hrdPrice.clear();*/
            }
         }
    }

    public void refreshPageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextReceptionistRooms.getChildren().add(load);
    }
}
