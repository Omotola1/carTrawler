package com.carTrawlerModel;

public class TotalCharge {
    private String rateTotalAmount;
    private String estimatedTotalAmount;
    private CurrencyCode currencyCode;

    public String getRateTotalAmount() { return rateTotalAmount; }
    public void setRateTotalAmount(String value) { this.rateTotalAmount = value; }

    public String getEstimatedTotalAmount() { return estimatedTotalAmount; }
    public void setEstimatedTotalAmount(String value) { this.estimatedTotalAmount = value; }

    public CurrencyCode getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(CurrencyCode value) { this.currencyCode = value; }
}
