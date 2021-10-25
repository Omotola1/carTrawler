package com.carTrawlerDemo;

public class LocationDetails {
    private String code;
    private PickUpLocationName name;
    private String atAirport;
    private String extendedLocationCode;
    private Address address;
    private Telephone telephone;
    private AdditionalInfo additionalInfo;

    public String getCode() { return code; }
    public void setCode(String value) { this.code = value; }

    public PickUpLocationName getName() { return name; }
    public void setName(PickUpLocationName value) { this.name = value; }

    public String getAtAirport() { return atAirport; }
    public void setAtAirport(String value) { this.atAirport = value; }

    public String getExtendedLocationCode() { return extendedLocationCode; }
    public void setExtendedLocationCode(String value) { this.extendedLocationCode = value; }

    public Address getAddress() { return address; }
    public void setAddress(Address value) { this.address = value; }

    public Telephone getTelephone() { return telephone; }
    public void setTelephone(Telephone value) { this.telephone = value; }

    public AdditionalInfo getAdditionalInfo() { return additionalInfo; }
    public void setAdditionalInfo(AdditionalInfo value) { this.additionalInfo = value; }
}
