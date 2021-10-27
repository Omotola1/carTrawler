package com.carTrawlerModel;

public class VehVendorAvail {
    private Vendor vendor;
    private VehAvail[] vehAvails;
    private Info info;

    public Vendor getVendor() { return vendor; }
    public void setVendor(Vendor value) { this.vendor = value; }

    public VehAvail[] getVehAvails() { return vehAvails; }
    public void setVehAvails(VehAvail[] value) { this.vehAvails = value; }

    public Info getInfo() { return info; }
    public void setInfo(Info value) { this.info = value; }
}
