package com.ainhoamarfer.componente;

import com.ainhoamarfer.componente.uiState.CardPanelUiState;

import javax.swing.*;
import java.awt.*;

public class CardPanel extends JPanel {

    //Panels
    private JPanel mainPanel, extrasPanel, pricePanel, titlePanel, buttonsPanel;

    //Labels
    private JLabel titleLabel, stateLabel, descriptionLabel, priceLabel, discountLabel, languageLabel;

    //dejamos la imagen para hacer en otro componente
    private ImageLabel imgLabel;

    //Botones
    private BotonPrincipal mainBtn;
    private BotonSecundario infoBtn;
    private BotonPeligro dangerBtn;

    //atributos del estado del componente
    private CardPanelUiState uiState;

    //long = id del juego que quieres consumir en la accion de los botones
    public CardPanel(CardPanelUiState UiState) {

        this.uiState = UiState;

        initComponents();
        pintarTarjeta();
    }

    public void pintarTarjeta (){
        titleLabel.setText(this.uiState.getTextTitle());
        descriptionLabel.setText(this.uiState.getTextDescription());

        if(this.uiState.getTextLanguage() == null || this.uiState.getTextLanguage().isBlank()){
            languageLabel.setVisible(false);
        }else {
            languageLabel.setVisible(true);
            languageLabel.setText(this.uiState.getTextLanguage());
        }

        if(this.uiState.getTextState() == null || this.uiState.getTextState().isBlank()){
            stateLabel.setVisible(false);
        }else{
            stateLabel.setVisible(true);
            stateLabel.setText(this.uiState.getTextState());
        }

        if(this.uiState.getTextDiscount() != this.uiState.getTextPrice()){
            priceLabel.setText(String.format("<html><strike>%.2f $</strike></html>"));
            discountLabel.setVisible(true);
            discountLabel.setText(String.format("%.2f $", this.uiState.getTextDiscount()));
        }else {
            priceLabel.setText(String.format("%.2f $", this.uiState.getTextPrice()));
            discountLabel.setVisible(false);
        }


        if(this.uiState.getTextDiscount() == null || this.uiState.getTextDiscount() >= 0){
            discountLabel.setVisible(false);
        }else{

            discountLabel.setVisible(true);
            discountLabel.setText(String.format("%.2f", this.uiState.getTextDiscount()));
        }

        if(this.uiState.getTextInfoBtn() == null){
            infoBtn.setVisible(false);
        }else{
            infoBtn.setVisible(true);
            infoBtn.setText(this.uiState.getTextInfoBtn());
        }

        mainBtn.setText(this.uiState.getTextMainBtn());
        dangerBtn.setText(this.uiState.getTextDangerBtn());

        this.add(imgLabel);

        titlePanel.add(titleLabel);
        titlePanel.add(stateLabel);
        mainPanel.add(titlePanel);
        mainPanel.add(descriptionLabel);

        buttonsPanel.add(mainBtn);
        buttonsPanel.add(infoBtn);
        buttonsPanel.add(dangerBtn);
        mainPanel.add(buttonsPanel);

        pricePanel.add(priceLabel);
        pricePanel.add(discountLabel);
        extrasPanel.add(pricePanel, BorderLayout.NORTH);
        extrasPanel.add(discountLabel, BorderLayout.NORTH);
        extrasPanel.add(languageLabel, BorderLayout.SOUTH);
        mainPanel.add(extrasPanel);

        this.add(mainPanel);
        this.add(extrasPanel);

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

        mainBtn = new BotonPrincipal("", 400, 200, (e) -> {
            this.uiState.getMainAction().accept(uiState.getId());
        });
        infoBtn = new BotonSecundario("", 400, 200, (e) -> {
            this.uiState.getInfoAction().accept(uiState.getId());
        });
        dangerBtn = new BotonPeligro("", 400, 200, (e) -> {
            this.uiState.getDangerAction().accept(uiState.getId());
        });
    }
}
