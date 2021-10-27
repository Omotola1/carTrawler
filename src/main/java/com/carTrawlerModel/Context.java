package com.carTrawlerModel;

import java.io.IOException;

public enum Context {
    CARTRAWLER;

    public String toValue() {
        switch (this) {
            case CARTRAWLER: return "CARTRAWLER";
        }
        return null;
    }

    public static Context forValue(String value) throws IOException {
        if (value.equals("CARTRAWLER")) return CARTRAWLER;
        throw new IOException("Cannot deserialize Context");
    }
}
