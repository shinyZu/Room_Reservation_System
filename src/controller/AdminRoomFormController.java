package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
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

import static controller.NewRoomFormController.roomArrayList;
import static javafx.collections.FXCollections.observableArrayList;

public class AdminRoomFormController {
    public AnchorPane contextAdminRoom;
    public AnchorPane roomContentPane;

    public TableColumn columnFloorNo;
    public TableColumn columnRoomNo;
    public TableColumn columnRoomType;
    public TableColumn columnCapacity;
    public TableColumn columnBedType;
    public TableColumn columnNoOfBeds;
    public TableColumn columnRoomStatus;
    public TableColumn columnRoomPrice;
    public TableColumn columnSpecialOffer;
    public TableColumn columnRemoveRoom;

    public TableView<RoomTM> tblRoom = new TableView<>();
    public JFXComboBox cmbRoomNoA;
    public JFXComboBox cmbRoomTypeA;
    public JFXComboBox cmbCapacityA;
    public JFXComboBox cmbRoomStatusA;
    public JFXButton btnSearchRoom;
    public JFXButton btnRefresh;

    public AdminRoomFormController() {
        tblRoom = new TableView<>();
        columnFloorNo = new TableColumn();
        columnRoomNo = new TableColumn();
        columnRoomType = new TableColumn();
        columnCapacity = new TableColumn();
        columnBedType = new TableColumn();
        columnNoOfBeds = new TableColumn();
        columnRoomStatus = new TableColumn();
        columnRoomPrice = new TableColumn();
        columnSpecialOffer = new TableColumn();
        columnRemoveRoom = new TableColumn();
    }

    public void goToAdminProfile(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminProfileForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminRoom.getChildren().add(load);
    }

    public void goToIncomeReportsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/IncomeReportForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminRoom.getChildren().add(load);
    }

    public void goToMealPkgOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealPackageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminRoom.getChildren().add(load);
    }

    public void goToDashboardOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminRoom.getChildren().add(load);
    }

    public void goToPreviousPage(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminRoom.getChildren().add(load);
    }

    public void openNewRoomDetailFormOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/NewRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        roomContentPane.getChildren().clear();
        roomContentPane.getChildren().add(load);
    }

    ObservableList<RoomTM> roomList = FXCollections.observableArrayList();

    public void loadAllRooms(){
        ObservableList<RoomTM> tmObservableList = FXCollections.observableArrayList();

        for ( Room temp : roomArrayList) {
            Button btnRemove = new Button("Remove");
            tmObservableList.add(new RoomTM(temp.getFloorNo(),temp.getRoomNo(),temp.getRoomType(),temp.getCapacity(),temp.getBedType(),temp.getNoOfBeds(),temp.getRoomStatus(),temp.getRoomPrice(),temp.getSpecialOffer(),btnRemove));

            btnRemove.setOnAction((e) -> {
                ButtonType yes= new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
                ButtonType no= new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION
                        ,"Are you sure you want to delete this Room?",yes,no);
                alert.setTitle("Confirmation Alert");

                Optional<ButtonType> result = alert.showAndWait();

                if (result.orElse(no)==yes){
                    roomList.remove(temp);
                    loadAllRooms();
                }else{

                }
            });

        }
        //tblRoom.setItems(tmObservableList);
        tblRoom.setItems(roomList);
    }

    /*ArrayList<RoomTM> roomList = new ArrayList<>();*/

    {
        //Button btn = new Button("Remove");

        roomList.add(new RoomTM("01", "01", "Single", "01", "Single", "01", "Available", "USD 42", "NA", new Button("Remove")));
        roomList.add(new RoomTM("01", "02", "Single", "01", "Twin", "01", "Reserved", "USD 50", "NA", new Button("Remove")));
        roomList.add(new RoomTM("01", "03", "Double", "02", "Double", "01", "Not Available", "USD 65", "NA", new Button("Remove")));
        roomList.add(new RoomTM("01", "04", "Double", "02", "Twin", "02", "Occupied", "USD 70", "NA", new Button("Remove")));
        roomList.add(new RoomTM("02", "05", "Double", "02", "Queen-sized", "02", "Under Maintenance", "USD 70", "NA", new Button("Remove")));
        roomList.add(new RoomTM("02", "06", "Triple", "03", "Single,Double", "02", "Available", "USD 80", "NA", new Button("Remove")));
        roomList.add(new RoomTM("02", "07", "Triple", "03", "Twin,Double", "02", "Available", "USD 82", "NA", new Button("Remove")));
        roomList.add(new RoomTM("02", "08", "Quad", "04", "Double", "02", "Available", "USD 85", "NA", new Button("Remove")));
        roomList.add(new RoomTM("03", "09", "Quad", "04", "Twin,Double", "03", "Available", "USD 90", "NA", new Button("Remove")));
        roomList.add(new RoomTM("03", "10", "Quad", "04", "Twin", "04", "Available", "USD 95", "NA", new Button("Remove")));

        for (RoomTM r : roomList) {
            r.getBtnRemoveA().setOnAction((e) -> {
                ButtonType yes= new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
                ButtonType no= new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION
                        ,"Are you sure you want to delete this Room?",yes,no);
                alert.setTitle("Confirmation Alert");

                Optional<ButtonType> result = alert.showAndWait();

                if (result.orElse(no)==yes){
                    roomList.remove(r);
                        loadAllRooms();
                }else{

                }
            });
            tblRoom.setItems(roomList);
        }
    }

    public void initialize () {

        columnFloorNo.setCellValueFactory(new PropertyValueFactory<>("floorNoA"));
        columnRoomNo.setCellValueFactory(new PropertyValueFactory<>("roomNoA"));
        columnRoomType.setCellValueFactory(new PropertyValueFactory<>("roomTypeA"));
        columnCapacity.setCellValueFactory(new PropertyValueFactory<>("capacityA"));
        columnBedType.setCellValueFactory(new PropertyValueFactory<>("bedTypeA"));
        columnNoOfBeds.setCellValueFactory(new PropertyValueFactory<>("noOfBedsA"));
        columnRoomStatus.setCellValueFactory(new PropertyValueFactory<>("roomStatusA"));
        columnRoomPrice.setCellValueFactory(new PropertyValueFactory<>("roomPriceA"));
        columnSpecialOffer.setCellValueFactory(new PropertyValueFactory<>("specialOfferA"));
        columnRemoveRoom.setCellValueFactory(new PropertyValueFactory<>("btnRemoveA"));

        tblRoom.setItems(FXCollections.observableArrayList(roomList));

        for (int i = 0; i < 25; i++) {
            String s = String.valueOf(i);
            cmbRoomNoA.getItems().addAll(s);
        }

        cmbRoomTypeA.getItems().addAll(
                "Single",
                "Double",
                "Triple",
                "Quad"
        );

        cmbCapacityA.getItems().addAll("01", "02", "03", "04", "05", "06");

        cmbRoomStatusA.getItems().addAll(
                "Available",
                "Not Available",
                "Reserved",
                "Occupied",
                "Under Maintenance"
        );

    }

    public void searchRoomOnAction(ActionEvent actionEvent) {
        ObservableList<RoomTM> tmFilterList = observableArrayList();

        for (RoomTM r : roomList) {
            if(r.getRoomNoA().equals(cmbRoomNoA.getValue()) || r.getRoomTypeA().equals(cmbRoomTypeA.getValue()) ||r.getCapacityA().equals(cmbCapacityA.getValue())
                    || r.getRoomStatusA().equals(cmbRoomStatusA.getValue()))
            /*if(r.getRoomNo().contains((CharSequence) hrdRoomNo.getValue()) || r.getRoomType().contains((CharSequence) hrdRoomType.getValue()) ||r.getCapacity().contains((CharSequence) hrdCapacity.getValue())
                    || r.getRoomStatus().contains((CharSequence) hrdRoomStatus.getValue()) || r.getRoomPrice().contains(hrdPrice.getText()))*/
            {
                Button btn = new Button("Remove");
                tmFilterList.add(new RoomTM(r.getFloorNoA(),r.getRoomNoA(), r.getRoomTypeA(), r.getCapacityA(),r.getBedTypeA(),r.getNoOfBedsA(), r.getRoomStatusA(),r.getRoomPriceA(),r.getSpecialOfferA(),btn));
                tblRoom.setItems(tmFilterList);
                /*hrdRoomNo.setValue(null);
                hrdRoomType.setValue(null);
                hrdCapacity.setValue(null);
                hrdRoomStatus.setValue(null);
                hrdPrice.clear();*/
            }

            for (RoomTM rtm:tmFilterList) {
                rtm.getBtnRemoveA().setOnAction((e) -> {
                    ButtonType yes= new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
                    ButtonType no= new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION
                            ,"Are you sure you want to delete this Room?",yes,no);
                    alert.setTitle("Confirmation Alert");

                    Optional<ButtonType> result = alert.showAndWait();

                    if (result.orElse(no)==yes){
                        roomList.remove(rtm);
                        loadAllRooms();
                    }else{

                    }
                });
                tblRoom.setItems(tmFilterList);
            }
        }
    }

    public void refreshPageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdminRoom.getChildren().add(load);
    }
 /*   new Button("Remove").setOnAction((e) -> {

        ButtonType yes= new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no= new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION
                ,"Are you sure whether you want to delete this Student?",yes,no);
        alert.setTitle("Confirmation Alert");
        1.8-->(windows null pointer exception)-->java-1.8
        Optional<ButtonType> result = alert.showAndWait();

        if (result.orElse(no)==yes){
            studentList.remove(temp);
            loadAllStudents();
        }else{

        }
    });*/

}