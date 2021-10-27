package com.carTrawlerModel;

import java.io.IOException;

public enum PickUpLocationName {
    DUBLIN_AIRPORT;

    public String toValue() {
        switch (this) {
            case DUBLIN_AIRPORT: return "Dublin - Airport";
        }
        return null;
    }

    public static PickUpLocationName forValue(String value) throws IOException {
        if (value.equals("Dublin - Airport")) return DUBLIN_AIRPORT;
        throw new IOException("Cannot deserialize PickUpLocationName");
    }
}
