package com.carTrawlerDemo;

public class VehAvailRSCore {
    private VehRentalCore vehRentalCore;
    private VehVendorAvail[] vehVendorAvails;

    public VehRentalCore getVehRentalCore() { return vehRentalCore; }
    public void setVehRentalCore(VehRentalCore value) { this.vehRentalCore = value; }

    public VehVendorAvail[] getVehVendorAvails() { return vehVendorAvails; }
    public void setVehVendorAvails(VehVendorAvail[] value) { this.vehVendorAvails = value; }
}
