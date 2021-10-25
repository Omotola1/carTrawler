package com.carTrawlerDemo;

import java.io.IOException;

public enum Timezone {
    EUROPE_DUBLIN;

    public String toValue() {
        switch (this) {
            case EUROPE_DUBLIN: return "Europe/Dublin";
        }
        return null;
    }

    public static Timezone forValue(String value) throws IOException {
        if (value.equals("Europe/Dublin")) return EUROPE_DUBLIN;
        throw new IOException("Cannot deserialize Timezone");
    }
}
