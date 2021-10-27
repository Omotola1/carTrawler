package com.carTrawlerModel;

import java.io.IOException;

public enum PaymentTypeType {
    ALTERNATIVE, CARD;

    public String toValue() {
        switch (this) {
            case ALTERNATIVE: return "Alternative";
            case CARD: return "Card";
        }
        return null;
    }

    public static PaymentTypeType forValue(String value) throws IOException {
        if (value.equals("Alternative")) return ALTERNATIVE;
        if (value.equals("Card")) return CARD;
        throw new IOException("Cannot deserialize PaymentTypeType");
    }
}
