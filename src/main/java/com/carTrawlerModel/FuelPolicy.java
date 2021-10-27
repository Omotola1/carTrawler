package com.carTrawlerModel;

public class FuelPolicy {
    private FuelPolicyType type;
    private FuelPolicyDescription description;

    public FuelPolicyType getType() { return type; }
    public void setType(FuelPolicyType value) { this.type = value; }

    public FuelPolicyDescription getDescription() { return description; }
    public void setDescription(FuelPolicyDescription value) { this.description = value; }
}
