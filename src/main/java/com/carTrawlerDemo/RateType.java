package com.carTrawlerDemo;

import java.io.IOException;

public enum RateType {
    POSTPAID;

    public String toValue() {
        switch (this) {
            case POSTPAID: return "POSTPAID";
        }
        return null;
    }

    public static RateType forValue(String value) throws IOException {
        if (value.equals("POSTPAID")) return POSTPAID;
        throw new IOException("Cannot deserialize RateType");
    }
}
