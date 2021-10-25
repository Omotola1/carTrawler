package com.carTrawlerDemo;

import java.io.IOException;

public enum VendorPruningCategoryDescription {
    CORPORATE, LOW, MEDIUM;

    public String toValue() {
        switch (this) {
            case CORPORATE: return "CORPORATE";
            case LOW: return "LOW";
            case MEDIUM: return "MEDIUM";
        }
        return null;
    }

    public static VendorPruningCategoryDescription forValue(String value) throws IOException {
        if (value.equals("CORPORATE")) return CORPORATE;
        if (value.equals("LOW")) return LOW;
        if (value.equals("MEDIUM")) return MEDIUM;
        throw new IOException("Cannot deserialize VendorPruningCategoryDescription");
    }
}
