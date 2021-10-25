package com.carTrawlerDemo;

import java.io.IOException;

public enum FuelPolicyType {
    FULLFULL, UNKNOWN;

    public String toValue() {
        switch (this) {
            case FULLFULL: return "FULLFULL";
            case UNKNOWN: return "UNKNOWN";
        }
        return null;
    }

    public static FuelPolicyType forValue(String value) throws IOException {
        if (value.equals("FULLFULL")) return FULLFULL;
        if (value.equals("UNKNOWN")) return UNKNOWN;
        throw new IOException("Cannot deserialize FuelPolicyType");
    }
}
