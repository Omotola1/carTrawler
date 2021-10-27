package com.carTrawlerModel;

public class Deductible {
    private String amount;
    private CurrencyCode currencyCode;

    public String getAmount() { return amount; }
    public void setAmount(String value) { this.amount = value; }

    public CurrencyCode getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(CurrencyCode value) { this.currencyCode = value; }
}
