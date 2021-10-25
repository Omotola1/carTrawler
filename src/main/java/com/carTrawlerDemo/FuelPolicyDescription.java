package com.carTrawlerDemo;

import java.io.IOException;

public enum FuelPolicyDescription {
    FUEL_PICK_UP_AND_RETURN_FULL, SEE_TERMS_AND_CONDITIONS;

    public String toValue() {
        switch (this) {
            case FUEL_PICK_UP_AND_RETURN_FULL: return "Fuel: Pick up and return full.";
            case SEE_TERMS_AND_CONDITIONS: return "See Terms and Conditions.";
        }
        return null;
    }

    public static FuelPolicyDescription forValue(String value) throws IOException {
        if (value.equals("Fuel: Pick up and return full.")) return FUEL_PICK_UP_AND_RETURN_FULL;
        if (value.equals("See Terms and Conditions.")) return SEE_TERMS_AND_CONDITIONS;
        throw new IOException("Cannot deserialize FuelPolicyDescription");
    }
}
