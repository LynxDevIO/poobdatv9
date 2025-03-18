package edu.pucgoias.aulasjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private Button btnUm;

    @FXML
    private Button btnDois;

    @FXML
    private Button btnTres;

    @FXML
    private void botaoUmClicado(ActionEvent evento) {
        System.out.println("Evento tratado por um controlador externo!");
    }

    @FXML
    private void botaoDoisClicado(ActionEvent evento) {
        System.out.println("Evento tratado via expressão Lambda!");
    }

    @FXML
    private void botaoTresClicado(ActionEvent evento) {
        System.out.println("Evento tratado na própria classe controladora!");
    }
}
