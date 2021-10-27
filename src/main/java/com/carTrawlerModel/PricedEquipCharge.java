package com.carTrawlerModel;

public class PricedEquipCharge {
    private String amount;
    private CurrencyCode currencyCode;
    private String taxInclusive;
    private String includedInRate;

    public String getAmount() { return amount; }
    public void setAmount(String value) { this.amount = value; }

    public CurrencyCode getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(CurrencyCode value) { this.currencyCode = value; }

    public String getTaxInclusive() { return taxInclusive; }
    public void setTaxInclusive(String value) { this.taxInclusive = value; }

    public String getIncludedInRate() { return includedInRate; }
    public void setIncludedInRate(String value) { this.includedInRate = value; }
}
