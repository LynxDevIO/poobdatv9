package edu.pucgoias.aulasjavafx.controller;

import edu.pucgoias.aulasjavafx.util.CustomAlert;
import edu.pucgoias.aulasjavafx.util.CustomEventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import java.util.Optional;

public class MainController {
    @FXML private Label mensagem;
    @FXML private Button btnOne;
    @FXML private Button btnTwo;
    @FXML private Button btnThree;

    public void initialize() {
        btnTwo.setOnAction(event -> {
                Alert alert = new Alert(Alert.AlertType.NONE);
                Optional<ButtonType> result;

                alert.setTitle("Confirmação");
                alert.setHeaderText(null);
                alert.setContentText("Deseja alterar a mensagem?");
                alert.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);
                result = alert.showAndWait();

                if (result.isPresent() && result.get() == ButtonType.YES) {
                    mensagem.setText("Evento tratado via expressão Lambda!");
                }
            }
        );
    }

    @FXML
    private void btnOneOnAction() {
        CustomAlert.showQuestion(
                "Confirmação",
                null,
                "Deseja alterar a mensagem?",
                () -> {
                    mensagem.setText("Evento tratado por um controlador externo!");
                }
        );
    }

    @FXML
    private void btnThreeOnAction() {
        Alert alert = new Alert(Alert.AlertType.NONE);
        Optional<ButtonType> result;

        alert.setTitle("Confirmação");
        alert.setHeaderText(null);
        alert.setContentText("Deseja alterar a mensagem?");
        alert.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO);
        result = alert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.YES) {
            mensagem.setText("Evento tratado na própria classe controladora!");
        }
    }
}
