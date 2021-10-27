package com.carTrawlerModel;

public class Location {
    private Context codeContext;
    private String locationCode;
    private PickUpLocationName name;

    public Context getCodeContext() { return codeContext; }
    public void setCodeContext(Context value) { this.codeContext = value; }

    public String getLocationCode() { return locationCode; }
    public void setLocationCode(String value) { this.locationCode = value; }

    public PickUpLocationName getName() { return name; }
    public void setName(PickUpLocationName value) { this.name = value; }
}
