package com.ainhoamarfer.componente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;

public class BotonSecundario extends JButton {

    public BotonSecundario(String texto, int ancho, int alto, Consumer<ActionEvent> accionClickConsumer) {
        this.setText(texto);
        this.setSize(ancho, alto);
        this.setBackground(new Color(127, 55, 200));
        this.setFont(new Font("Arial", Font.PLAIN, 15));
        this.setForeground(new Color(255, 255, 255));

        setContentAreaFilled(false); // Fondo transparente
        setFocusPainted(false); // Quitar borde de foco
        //setBorder(new RoundBorder(15)); // 15 es el radio

        this.addActionListener(e -> {
            accionClickConsumer.accept(e);
        });
    }
}
