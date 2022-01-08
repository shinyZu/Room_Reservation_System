package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Room;
import view.tm.RoomTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

public class NewRoomFormController extends AdminRoomFormController{
    public AnchorPane contextNewRoom;
    public JFXButton btnAddRoom;
    public JFXButton btnCancel;
    public TextField txtFloorNo;
    public TextField txtRoomNo;
   /* public TextField txtRoomType;
    public TextField txtCapacity;*/

    public JFXComboBox<String> cmbRoomType;
    public JFXComboBox<String> cmbCapacity;

    public JFXComboBox<String> cmbBedType;
    public JFXComboBox<String> cmbNoOfBeds;
    /*public ComboBox cmbBedType2;
    public ComboBox cmbNoOfBeds2;*/
    public ComboBox<String> cmbRoomStatus;
    public TextField txtRoomPrice;
    public TextField txtSpecialOffer;

    static ArrayList<Room> roomArrayList = new ArrayList<>();


    public void initialize() {

        cmbRoomType.getItems().addAll(
            "Single",
            "Double",
            "Triple",
            "Quad"
        );

        cmbCapacity.getItems().addAll(
                "01", "02", "03", "04", "05", "06");

        cmbBedType.getItems().addAll(
                "Single",
                "Twin",
                "Double",
                "Queen-sized",
                "King-sized"
        );

        cmbNoOfBeds.getItems().addAll("01","02","03","04");

        cmbRoomStatus.getItems().addAll(
                "Available",
                "Not Available",
                "Occupied",
                "Reserved",
                "Under Maintenance"
        );
    }
    public boolean isExists(Room room) {
        for (Room r : roomArrayList) {
            if (r.getRoomNo().equalsIgnoreCase(room.getRoomNo())) { // C001,c001 --> ignore case sensitiveness, equals()--> consider case sensitivity
                return true;
            }
        }
        return false;
    }

    {
        AdminRoomFormController adminRoomFormController = new AdminRoomFormController();
    }
    public void addRoomOnAction(ActionEvent actionEvent) {
        Room room = new Room(txtFloorNo.getText(),txtRoomNo.getText(),cmbRoomType.getValue(),cmbCapacity.getValue(),
                cmbBedType.getValue(),cmbNoOfBeds.getValue(),cmbRoomStatus.getValue(),txtRoomPrice.getText(),txtSpecialOffer.getText());

        if (isExists(room)){
            new Alert(Alert.AlertType.WARNING, "This Room Already Exists..", ButtonType.CLOSE).show();
        }else{
            if (roomArrayList.add(room)){
                // alert --> add room

                loadAllRooms();

                new Alert(Alert.AlertType.CONFIRMATION,"Room Added Successfully...", ButtonType.CLOSE).show();
                txtFloorNo.clear();
                txtRoomNo.clear();
                cmbRoomType.getSelectionModel().clearSelection();
                cmbCapacity.getSelectionModel().clearSelection();
                cmbBedType.getSelectionModel().clearSelection();
                cmbNoOfBeds.getSelectionModel().clearSelection();
                cmbRoomStatus.getSelectionModel().clearSelection();
               // cmbRoomType.clear();
               // cmbCapacity.clear();
                txtRoomPrice.clear();
                txtSpecialOffer.clear();
            }else{
                // alert --> try again
                new Alert(Alert.AlertType.WARNING,"Try Again...",ButtonType.CLOSE).show();
            }
        }
    }
    /*private void loadAllRooms(){
        ObservableList<RoomTM> tmObservableList = FXCollections.observableArrayList();

        for ( Room temp : roomArrayList) {
            Button btnRemove = new Button("Remove");
            tmObservableList.add(new RoomTM(temp.getFloorNo(),temp.getRoomNo(),temp.getRoomType(),temp.getCapacity(),temp.getBedType(),temp.getNoOfBeds(),temp.getRoomStatus(),temp.getRoomPrice(),temp.getSpecialOffer(),btnRemove));
        }
        tblRoom.setItems(tmObservableList);
    }*/

    public void cancelOnAction(ActionEvent actionEvent) throws IOException {
        btnCancel.setOnAction((e) -> {
            ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
            ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION
                    , "Are you sure you want to cancel?", yes, no);
            alert.setTitle("Confirmation Alert");
            /*1.8-->(windows null pointer exception)-->java-1.8*/
            Optional<ButtonType> result = alert.showAndWait();

            if (result.orElse(no) == yes) {
                Stage window = (Stage) contextNewRoom.getScene().getWindow();
                try {
                    window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminRoomForm.fxml"))));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            } /*else {
               *//* URL resource = getClass().getResource("../view/NewRoomForm.fxml");
                Parent load = FXMLLoader.load(resource);
                roomContentPane.getChildren().clear();
                roomContentPane.getChildren().add(load);*//*

                Stage window = (Stage) contextNewRoom.getScene().getWindow();
                try {
                    window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminRoomForm.fxml"))));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }*/
        });
    }

    public void closeContextNewRoom(MouseEvent mouseEvent) throws IOException {
        /*URL resource = getClass().getResource("../view/AdminRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextNewRoom.getChildren().add(load);*/
        Stage window = (Stage) contextNewRoom.getScene().getWindow();
        /*contextNewRoom.getChildren().clear();*/
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminRoomForm.fxml"))));
    }
}
