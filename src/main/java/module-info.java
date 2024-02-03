module com.example.studyat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studyat to javafx.fxml;
    exports com.example.studyat;
}