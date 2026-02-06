package com.ainhoamarfer.componente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;

public class BotonPrincipal extends JButton {

    public BotonPrincipal(String texto, int ancho, int alto, Consumer<ActionEvent> accionClickConsumer) {
        this.setText(texto);
        this.setSize(ancho, alto);
        this.addActionListener(e -> {
            accionClickConsumer.accept(e);
        });
    }
}
