module io.dbc.github.mybill {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;


    opens io.dbc.github.mybill to javafx.fxml;
    exports io.dbc.github.mybill;
}