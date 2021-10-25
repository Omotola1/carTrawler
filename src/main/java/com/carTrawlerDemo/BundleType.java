package com.carTrawlerDemo;

import java.io.IOException;

public enum BundleType {
    RATE_IN;

    public String toValue() {
        switch (this) {
            case RATE_IN: return "Rate_IN";
        }
        return null;
    }

    public static BundleType forValue(String value) throws IOException {
        if (value.equals("Rate_IN")) return RATE_IN;
        throw new IOException("Cannot deserialize BundleType");
    }
}
