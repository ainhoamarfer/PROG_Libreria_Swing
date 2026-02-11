package com.ainhoamarfer;

import com.ainhoamarfer.componente.BotonPeligro;
import com.ainhoamarfer.componente.BotonPrincipal;
import com.ainhoamarfer.componente.BotonSecundario;
import com.ainhoamarfer.componente.CardPanel;
import com.ainhoamarfer.componente.uiState.CardPanelUiState;

import javax.swing.*;

public class App 
{
    public static void main(String[] args) {

            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Mi app");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel content = new JPanel();

                content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

                CardPanelUiState cardState = new CardPanelUiState(0,"Terraria", "Un jueguito", 20.0, 0.0,
                        "español", null, "Comprar", "Info", "No ver", actionEvent -> {
                    System.out.println("Clicado quedo");}, actionEvent -> {
                    System.out.println("Clicado quedo");}, actionEvent -> {
                    System.out.println("Clicado quedo");});

                CardPanel card = new CardPanel(cardState);
                content.add(card);

                JLabel label = new JLabel("<html><strike>Mensage</strike></html>");
                content.add(label);

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

