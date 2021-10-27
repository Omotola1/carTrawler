package com.carTrawlerModel;

public class Fee {
    private String amount;
    private CurrencyCode currencyCode;
    private String purpose;

    public String getAmount() { return amount; }
    public void setAmount(String value) { this.amount = value; }

    public CurrencyCode getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(CurrencyCode value) { this.currencyCode = value; }

    public String getPurpose() { return purpose; }
    public void setPurpose(String value) { this.purpose = value; }
}
