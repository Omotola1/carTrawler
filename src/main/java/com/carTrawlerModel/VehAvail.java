package com.carTrawlerModel;

public class VehAvail {
    private VehAvailCore vehAvailCore;
    private VehAvailInfoUnion vehAvailInfo;

    public VehAvailCore getVehAvailCore() { return vehAvailCore; }
    public void setVehAvailCore(VehAvailCore value) { this.vehAvailCore = value; }

    public VehAvailInfoUnion getVehAvailInfo() { return vehAvailInfo; }
    public void setVehAvailInfo(VehAvailInfoUnion value) { this.vehAvailInfo = value; }
}
