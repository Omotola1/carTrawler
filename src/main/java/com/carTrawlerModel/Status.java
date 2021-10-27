package com.carTrawlerModel;

import java.io.IOException;

public enum Status {
    AVAILABLE, ON_REQUEST;

    public String toValue() {
        switch (this) {
            case AVAILABLE: return "Available";
            case ON_REQUEST: return "OnRequest";
        }
        return null;
    }

    public static Status forValue(String value) throws IOException {
        if (value.equals("Available")) return AVAILABLE;
        if (value.equals("OnRequest")) return ON_REQUEST;
        throw new IOException("Cannot deserialize Status");
    }
}
