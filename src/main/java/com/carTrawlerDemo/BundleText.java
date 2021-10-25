package com.carTrawlerDemo;

import java.io.IOException;

public enum BundleText {
    STANDARD;

    public String toValue() {
        switch (this) {
            case STANDARD: return "Standard";
        }
        return null;
    }

    public static BundleText forValue(String value) throws IOException {
        if (value.equals("Standard")) return STANDARD;
        throw new IOException("Cannot deserialize BundleText");
    }
}
