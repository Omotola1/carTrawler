package com.carTrawlerDemo;

public class RentalRate {
    private VehicleCharge[] vehicleCharges;
    private RateQualifier rateQualifier;
    private RateDistance rateDistance;

    public VehicleCharge[] getVehicleCharges() { return vehicleCharges; }
    public void setVehicleCharges(VehicleCharge[] value) { this.vehicleCharges = value; }

    public RateQualifier getRateQualifier() { return rateQualifier; }
    public void setRateQualifier(RateQualifier value) { this.rateQualifier = value; }

    public RateDistance getRateDistance() { return rateDistance; }
    public void setRateDistance(RateDistance value) { this.rateDistance = value; }
}
