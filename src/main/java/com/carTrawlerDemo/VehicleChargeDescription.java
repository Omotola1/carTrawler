package com.carTrawlerDemo;

import java.io.IOException;

public enum VehicleChargeDescription {
    ADDITIONAL_DISTANCE, AIRPORT_FEE, BREAKDOWN_ASSISTANCE, LIMITED_MILEAGE_MILES_INCLUDED_PER_RENTAL_0, ROAD_TAX, TAX, UNLIMITED_MILEAGE;

    public String toValue() {
        switch (this) {
            case ADDITIONAL_DISTANCE: return "Additional distance";
            case AIRPORT_FEE: return "Airport fee";
            case BREAKDOWN_ASSISTANCE: return "Breakdown assistance";
            case LIMITED_MILEAGE_MILES_INCLUDED_PER_RENTAL_0: return "Limited Mileage:Miles included per rental: 0";
            case ROAD_TAX: return "Road tax";
            case TAX: return "Tax";
            case UNLIMITED_MILEAGE: return "Unlimited mileage";
        }
        return null;
    }

    public static VehicleChargeDescription forValue(String value) throws IOException {
        if (value.equals("Additional distance")) return ADDITIONAL_DISTANCE;
        if (value.equals("Airport fee")) return AIRPORT_FEE;
        if (value.equals("Breakdown assistance")) return BREAKDOWN_ASSISTANCE;
        if (value.equals("Limited Mileage:Miles included per rental: 0")) return LIMITED_MILEAGE_MILES_INCLUDED_PER_RENTAL_0;
        if (value.equals("Road tax")) return ROAD_TAX;
        if (value.equals("Tax")) return TAX;
        if (value.equals("Unlimited mileage")) return UNLIMITED_MILEAGE;
        throw new IOException("Cannot deserialize VehicleChargeDescription");
    }
}
