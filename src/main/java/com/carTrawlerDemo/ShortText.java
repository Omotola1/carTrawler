package com.carTrawlerDemo;

import java.io.IOException;

public enum ShortText {
    PRE_REGISTRATION_AVAILABLE, SANITISED_CAR;

    public String toValue() {
        switch (this) {
            case PRE_REGISTRATION_AVAILABLE: return "Pre-Registration available";
            case SANITISED_CAR: return "Sanitised car";
        }
        return null;
    }

    public static ShortText forValue(String value) throws IOException {
        if (value.equals("Pre-Registration available")) return PRE_REGISTRATION_AVAILABLE;
        if (value.equals("Sanitised car")) return SANITISED_CAR;
        throw new IOException("Cannot deserialize ShortText");
    }
}
