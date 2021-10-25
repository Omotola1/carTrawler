package com.carTrawlerDemo;

public class AdditionalInfo {
    private VehRentLOCInfos vehRentLOCInfos;
    private CounterLocation counterLocation;
    private AdditionalInfoTPAExtensions tpaExtensions;

    public VehRentLOCInfos getVehRentLOCInfos() { return vehRentLOCInfos; }
    public void setVehRentLOCInfos(VehRentLOCInfos value) { this.vehRentLOCInfos = value; }

    public CounterLocation getCounterLocation() { return counterLocation; }
    public void setCounterLocation(CounterLocation value) { this.counterLocation = value; }

    public AdditionalInfoTPAExtensions getTpaExtensions() { return tpaExtensions; }
    public void setTpaExtensions(AdditionalInfoTPAExtensions value) { this.tpaExtensions = value; }
}
