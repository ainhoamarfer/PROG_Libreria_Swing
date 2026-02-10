package com.ainhoamarfer.componente.uiState;

import java.util.function.Consumer;

public class CardPanelUiState {

    private long id;
    private String title;
    private String description;
    private String price;
    private String discount;
    private String language;
    private String state;

    private Consumer<Long> mainAction;
    private Consumer<Long> infoAction;
    private Consumer<Long> dangerAction;

    public CardPanelUiState(long id, String title, String description, String price, String discount, String language, String state, Consumer<Long> mainAction, Consumer<Long> infoAction, Consumer<Long> dangerAction) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.discount = discount;
        this.language = language;
        this.state = state;
        this.mainAction = mainAction;
        this.infoAction = infoAction;
        this.dangerAction = dangerAction;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

    public String getLanguage() {
        return language;
    }

    public String getState() {
        return state;
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
