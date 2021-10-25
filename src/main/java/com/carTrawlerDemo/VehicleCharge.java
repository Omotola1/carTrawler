package com.carTrawlerDemo;

public class VehicleCharge {
    private VehicleChargeDescription description;
    private String taxInclusive;
    private String includedInRate;
    private String purpose;
    private String amount;
    private CurrencyCode currencyCode;
    private Calculation calculation;

    public VehicleChargeDescription getDescription() { return description; }
    public void setDescription(VehicleChargeDescription value) { this.description = value; }

    public String getTaxInclusive() { return taxInclusive; }
    public void setTaxInclusive(String value) { this.taxInclusive = value; }

    public String getIncludedInRate() { return includedInRate; }
    public void setIncludedInRate(String value) { this.includedInRate = value; }

    public String getPurpose() { return purpose; }
    public void setPurpose(String value) { this.purpose = value; }

    public String getAmount() { return amount; }
    public void setAmount(String value) { this.amount = value; }

    public CurrencyCode getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(CurrencyCode value) { this.currencyCode = value; }

    public Calculation getCalculation() { return calculation; }
    public void setCalculation(Calculation value) { this.calculation = value; }
}
