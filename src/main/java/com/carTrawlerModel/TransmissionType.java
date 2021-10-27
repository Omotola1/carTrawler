package com.carTrawlerModel;

import java.io.IOException;

public enum TransmissionType {
    AUTOMATIC, MANUAL;

    public String toValue() {
        switch (this) {
            case AUTOMATIC: return "Automatic";
            case MANUAL: return "Manual";
        }
        return null;
    }

    public static TransmissionType forValue(String value) throws IOException {
        if (value.equals("Automatic")) return AUTOMATIC;
        if (value.equals("Manual")) return MANUAL;
        throw new IOException("Cannot deserialize TransmissionType");
    }
}
