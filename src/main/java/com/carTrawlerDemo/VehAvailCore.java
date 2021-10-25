package com.carTrawlerDemo;

public class VehAvailCore {
    private Status status;
    private Vehicle vehicle;
    private RentalRate rentalRate;
    private TotalCharge totalCharge;
    private PricedEquip[] pricedEquips;
    private Fee[] fees;
    private Reference reference;
    private VehAvailCoreTPAExtensions tpaExtensions;

    public Status getStatus() { return status; }
    public void setStatus(Status value) { this.status = value; }

    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle value) { this.vehicle = value; }

    public RentalRate getRentalRate() { return rentalRate; }
    public void setRentalRate(RentalRate value) { this.rentalRate = value; }

    public TotalCharge getTotalCharge() { return totalCharge; }
    public void setTotalCharge(TotalCharge value) { this.totalCharge = value; }

    public PricedEquip[] getPricedEquips() { return pricedEquips; }
    public void setPricedEquips(PricedEquip[] value) { this.pricedEquips = value; }

    public Fee[] getFees() { return fees; }
    public void setFees(Fee[] value) { this.fees = value; }

    public Reference getReference() { return reference; }
    public void setReference(Reference value) { this.reference = value; }

    public VehAvailCoreTPAExtensions getTpaExtensions() { return tpaExtensions; }
    public void setTpaExtensions(VehAvailCoreTPAExtensions value) { this.tpaExtensions = value; }
}
