package com.carTrawlerModel;

import java.io.IOException;

public enum UITokenEnum {
    PRE_REGISTRATION, SANITIZED_CAR;

    public String toValue() {
        switch (this) {
            case PRE_REGISTRATION: return "pre_registration";
            case SANITIZED_CAR: return "sanitized_car";
        }
        return null;
    }

    public static UITokenEnum forValue(String value) throws IOException {
        if (value.equals("pre_registration")) return PRE_REGISTRATION;
        if (value.equals("sanitized_car")) return SANITIZED_CAR;
        throw new IOException("Cannot deserialize UITokenEnum");
    }
}
