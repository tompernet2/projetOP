module sio.op_projet {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.op_projet to javafx.fxml;
    exports sio.op_projet;
}