package com.carTrawlerDemo;

import java.io.IOException;

public enum RateQualifierEnum {
    PARTPAID_IN, POSTPAID_IN, PREPAID_IN;

    public String toValue() {
        switch (this) {
            case PARTPAID_IN: return "PARTPAID-IN";
            case POSTPAID_IN: return "POSTPAID-IN";
            case PREPAID_IN: return "PREPAID-IN";
        }
        return null;
    }

    public static RateQualifierEnum forValue(String value) throws IOException {
        if (value.equals("PARTPAID-IN")) return PARTPAID_IN;
        if (value.equals("POSTPAID-IN")) return POSTPAID_IN;
        if (value.equals("PREPAID-IN")) return PREPAID_IN;
        throw new IOException("Cannot deserialize RateQualifierEnum");
    }
}
