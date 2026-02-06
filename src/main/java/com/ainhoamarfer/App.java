package com.ainhoamarfer;

import com.ainhoamarfer.componente.BotonPrincipal;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Mi app");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel content = new JPanel();
                content.add(new BotonPrincipal("Clicame", 200, 50, actionEvent -> {
                    System.out.println("Clicado quedo");
                }));
                frame.setContentPane(content); // panel raíz

                frame.pack();
                frame.setLocationRelativeTo(null); // centrar
                frame.setVisible(true);
            });

    }
}

