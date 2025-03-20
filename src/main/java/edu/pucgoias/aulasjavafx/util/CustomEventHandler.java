package edu.pucgoias.aulasjavafx.util;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CustomEventHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        event.consume();
        System.out.println("Evento tratado por uma classe externa");
    }
}