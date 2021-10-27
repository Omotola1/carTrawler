package com.carTrawlerModel;

public class Address {
    private String remark;
    private String addressLine;
    private CountryName countryName;

    public String getRemark() { return remark; }
    public void setRemark(String value) { this.remark = value; }

    public String getAddressLine() { return addressLine; }
    public void setAddressLine(String value) { this.addressLine = value; }

    public CountryName getCountryName() { return countryName; }
    public void setCountryName(CountryName value) { this.countryName = value; }
}
