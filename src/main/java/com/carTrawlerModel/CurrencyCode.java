package com.carTrawlerModel;

import java.io.IOException;

public enum CurrencyCode {
    EUR;

    public String toValue() {
        switch (this) {
            case EUR: return "EUR";
        }
        return null;
    }

    public static CurrencyCode forValue(String value) throws IOException {
        if (value.equals("EUR")) return EUR;
        throw new IOException("Cannot deserialize CurrencyCode");
    }
}
