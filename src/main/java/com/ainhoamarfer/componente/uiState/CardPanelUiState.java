package com.ainhoamarfer.componente.uiState;

import java.util.function.Consumer;

public class CardPanelUiState {

    //estado de la card
    //si algo puede mutar es parte de su estado

    //textos
    private long id;
    private String textTitle;
    private String textDescription;
    private Double textPrice; //precio sin descuento
    private Double textDiscount; //precio tras el descuento
    private String textLanguage;
    private String textState;


    private String textMainBtn;
    private String textInfoBtn;
    private String textDangerBtn;

    //acciones
    private Consumer<Long> mainAction;
    private Consumer<Long> infoAction;
    private Consumer<Long> dangerAction;

    public CardPanelUiState(long id, String textTitle, String textDescription, Double textPrice, Double textDiscount, String textLanguage, String textState, String textMainBtn, String textInfoBtn, String textDangerBtn, Consumer<Long> mainAction, Consumer<Long> infoAction, Consumer<Long> dangerAction) {

        this.id = id;
        this.textTitle = textTitle;
        this.textDescription = textDescription;
        this.textPrice = textPrice;
        this.textDiscount = textDiscount;
        this.textLanguage = textLanguage;
        this.textState = textState;
        this.textMainBtn = textMainBtn;
        this.textInfoBtn = textInfoBtn;
        this.textDangerBtn = textDangerBtn;
        this.mainAction = mainAction;
        this.infoAction = infoAction;
        this.dangerAction = dangerAction;
    }


    public long getId() {
        return id;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public Double getTextPrice() {
        return textPrice;
    }

    public Double getTextDiscount() {
        return textDiscount;
    }

    public String getTextLanguage() {
        return textLanguage;
    }

    public String getTextState() {
        return textState;
    }

    public String getTextMainBtn() {
        return textMainBtn;
    }

    public String getTextInfoBtn() {
        return textInfoBtn;
    }

    public String getTextDangerBtn() {
        return textDangerBtn;
    }

    public Consumer<Long> getMainAction() {
        return mainAction;
    }

    public Consumer<Long> getInfoAction() {
        return infoAction;
    }

    public Consumer<Long> getDangerAction() {
        return dangerAction;
    }
}
