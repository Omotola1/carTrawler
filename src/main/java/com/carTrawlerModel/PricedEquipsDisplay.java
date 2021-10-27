package com.carTrawlerModel;

public class PricedEquipsDisplay {
    private String equipType;
    private String amount;
    private CurrencyCode currencyCode;
    private RateType rateType;

    public String getEquipType() { return equipType; }
    public void setEquipType(String value) { this.equipType = value; }

    public String getAmount() { return amount; }
    public void setAmount(String value) { this.amount = value; }

    public CurrencyCode getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(CurrencyCode value) { this.currencyCode = value; }

    public RateType getRateType() { return rateType; }
    public void setRateType(RateType value) { this.rateType = value; }
}
