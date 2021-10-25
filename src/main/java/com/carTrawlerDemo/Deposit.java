package com.carTrawlerDemo;

public class Deposit {
    private String amount;
    private CurrencyCode currencyCode;
    private String minAmount;
    private String maxAmount;

    public String getAmount() { return amount; }
    public void setAmount(String value) { this.amount = value; }

    public CurrencyCode getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(CurrencyCode value) { this.currencyCode = value; }

    public String getMinAmount() { return minAmount; }
    public void setMinAmount(String value) { this.minAmount = value; }

    public String getMaxAmount() { return maxAmount; }
    public void setMaxAmount(String value) { this.maxAmount = value; }
}
