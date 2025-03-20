module edu.pucgoias.aulasjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.pucgoias.aulasjavafx to javafx.fxml;
    exports edu.pucgoias.aulasjavafx;

    opens edu.pucgoias.aulasjavafx.view to javafx.fxml;
    exports edu.pucgoias.aulasjavafx.view;

    opens edu.pucgoias.aulasjavafx.controller to javafx.fxml;
    exports edu.pucgoias.aulasjavafx.controller;

    opens edu.pucgoias.aulasjavafx.util to javafx.fxml;
    exports edu.pucgoias.aulasjavafx.util;
}