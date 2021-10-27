package com.carTrawlerModel;

public class PricedCoverageCharge {
    private ChargeDescription description;
    private String taxInclusive;
    private String includedInRate;

    public ChargeDescription getDescription() { return description; }
    public void setDescription(ChargeDescription value) { this.description = value; }

    public String getTaxInclusive() { return taxInclusive; }
    public void setTaxInclusive(String value) { this.taxInclusive = value; }

    public String getIncludedInRate() { return includedInRate; }
    public void setIncludedInRate(String value) { this.includedInRate = value; }
}
