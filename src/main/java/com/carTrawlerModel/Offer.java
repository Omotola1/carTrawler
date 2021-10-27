package com.carTrawlerModel;

public class Offer {
    private UITokenEnum type;
    private UITokenEnum uiToken;
    private ShortText shortText;
    private String index;
    private String seFree;
    private String text;

    public UITokenEnum getType() { return type; }
    public void setType(UITokenEnum value) { this.type = value; }

    public UITokenEnum getUIToken() { return uiToken; }
    public void setUIToken(UITokenEnum value) { this.uiToken = value; }

    public ShortText getShortText() { return shortText; }
    public void setShortText(ShortText value) { this.shortText = value; }

    public String getIndex() { return index; }
    public void setIndex(String value) { this.index = value; }

    public String getSEFree() { return seFree; }
    public void setSEFree(String value) { this.seFree = value; }

    public String getText() { return text; }
    public void setText(String value) { this.text = value; }
}
