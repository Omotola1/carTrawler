package com.carTrawlerModel;

import java.io.IOException;

public enum Description {
    ADDITIONAL_DRIVER, BOOSTER_SEAT, CHILD_TODDLER_SEAT, GPS, INFANT_CHILD_SEAT;

    public String toValue() {
        switch (this) {
            case ADDITIONAL_DRIVER: return "Additional Driver";
            case BOOSTER_SEAT: return "Booster seat";
            case CHILD_TODDLER_SEAT: return "Child toddler seat";
            case GPS: return "GPS";
            case INFANT_CHILD_SEAT: return "Infant child seat";
        }
        return null;
    }

    public static Description forValue(String value) throws IOException {
        if (value.equals("Additional Driver")) return ADDITIONAL_DRIVER;
        if (value.equals("Booster seat")) return BOOSTER_SEAT;
        if (value.equals("Child toddler seat")) return CHILD_TODDLER_SEAT;
        if (value.equals("GPS")) return GPS;
        if (value.equals("Infant child seat")) return INFANT_CHILD_SEAT;
        throw new IOException("Cannot deserialize Description");
    }
}
