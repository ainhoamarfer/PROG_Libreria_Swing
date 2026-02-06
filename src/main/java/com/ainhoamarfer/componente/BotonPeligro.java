package com.ainhoamarfer.componente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;

public class BotonPeligro extends JButton {

    public BotonPeligro(String texto, int ancho, int alto, Consumer<ActionEvent> accionClickConsumer) {
        this.setText(texto);
        this.setSize(ancho, alto);
        this.setBackground(new Color(165, 31, 47));
        this.setFont(new Font("Arial", Font.BOLD, 15));
        this.setForeground(new Color(255, 255, 255));
        this.addActionListener(e -> {
            accionClickConsumer.accept(e);
        });
    }
}
