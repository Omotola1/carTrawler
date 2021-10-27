package com.carTrawlerModel;

import java.io.IOException;

public enum Type {
    DIESEL, PETROL, UNSPECIFIED;

    public String toValue() {
        switch (this) {
            case DIESEL: return "Diesel";
            case PETROL: return "Petrol";
            case UNSPECIFIED: return "Unspecified";
        }
        return null;
    }

    public static Type forValue(String value) throws IOException {
        if (value.equals("Diesel")) return DIESEL;
        if (value.equals("Petrol")) return PETROL;
        if (value.equals("Unspecified")) return UNSPECIFIED;
        throw new IOException("Cannot deserialize Type");
    }
}
