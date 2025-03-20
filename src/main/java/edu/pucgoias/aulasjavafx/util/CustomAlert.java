package edu.pucgoias.aulasjavafx.util;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public final class CustomAlert {
    private CustomAlert() {
        // empty
    }

    public static void showConfirmation(String title, String headerWhichCanBeNull, String content) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(headerWhichCanBeNull);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void showQuestion(String title, String headerWhichCanBeNull, String content, Runnable onYes) {
        Alert alert = new Alert(Alert.AlertType.NONE);
        Optional<ButtonType> result;

        alert.setTitle(title);
        alert.setHeaderText(headerWhichCanBeNull);
        alert.setContentText(content);
        alert.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);

        result = alert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.YES) {
            onYes.run();
        }
    }
}
