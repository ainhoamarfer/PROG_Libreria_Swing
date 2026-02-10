package com.ainhoamarfer;

import com.ainhoamarfer.componente.BotonPeligro;
import com.ainhoamarfer.componente.BotonPrincipal;
import com.ainhoamarfer.componente.BotonSecundario;
import com.ainhoamarfer.componente.CardPanel;

import javax.swing.*;

public class App 
{
    public static void main(String[] args) {

            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Mi app");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel content = new JPanel();

                content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

                content.add(new BotonPrincipal("Clicame", 200, 50, actionEvent -> {
                    System.out.println("Clicado quedo");
                }));
                content.add(new BotonSecundario("Holi", 200, 50, actionEvent -> {
                    System.out.println("Secundario");
                }));
                content.add(new BotonPeligro("Clic", 200, 50, actionEvent -> {
                    System.out.println("PELIGRO");
                }));

                frame.setContentPane(content); // panel raíz

                frame.pack();
                frame.setLocationRelativeTo(null); // centrar
                frame.setVisible(true);
            });

    }
}

