package com.ainhoamarfer.componente;

import com.ainhoamarfer.componente.uiState.CardPanelUiState;

import javax.swing.*;
import java.util.function.Consumer;

public class CardPanel extends JPanel {

    //Panels
    private JPanel mainPanel, extrasPanel, pricePanel, titlePanel, buttonsPanel;

    //Labels
    private JLabel titleLabel, stateLabel, descriptionLabel, priceLabel, discountLabel, languageLabel;

    //dejamos la imagen para hacer en otro componente
    private ImageLabel imgLabel;

    private BotonPrincipal mainBtn;
    private BotonSecundario infoBtn;
    private BotonPeligro dangerBtn;


    //atributos del estado del componente
    private CardPanelUiState UiState;

    //long = id del juego que quieres consumir en la accion de los botones
    public CardPanel(CardPanelUiState UiState) {

        this.UiState = UiState;
        initComponents();

        setButtonActions();
    }

    private void setButtonActions() {
        mainBtn.addActionListener(e -> {
            UiState.getMainAction().accept(UiState.getId());
        });
        infoBtn.addActionListener(e -> {
            UiState.getInfoAction().accept(UiState.getId());
        });
        dangerBtn.addActionListener(e -> {
            UiState.getDangerAction().accept(UiState.getId());
        });
    }

    public void initComponents() {
        titlePanel = new JPanel();
        mainPanel = new JPanel();
        extrasPanel = new JPanel();
        pricePanel = new JPanel();
        buttonsPanel = new JPanel();

        imgLabel = new ImageLabel();
        titleLabel = new JLabel();
        stateLabel = new JLabel();
        descriptionLabel = new JLabel();
        priceLabel = new JLabel();
        discountLabel = new JLabel();
        languageLabel = new JLabel();
    }
}
