package com.carTrawlerDemo;

import java.io.IOException;

public enum CountryNameCode {
    IE;

    public String toValue() {
        switch (this) {
            case IE: return "IE";
        }
        return null;
    }

    public static CountryNameCode forValue(String value) throws IOException {
        if (value.equals("IE")) return IE;
        throw new IOException("Cannot deserialize CountryNameCode");
    }
}
