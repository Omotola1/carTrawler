package com.carTrawlerModel;

import java.io.IOException;

public enum PaymentTypeName {
    AMERICAN_EXPRESS, DELAYED_PAYMENT, MASTER_CARD, VISA;

    public String toValue() {
        switch (this) {
            case AMERICAN_EXPRESS: return "American Express";
            case DELAYED_PAYMENT: return "Delayed Payment";
            case MASTER_CARD: return "MasterCard";
            case VISA: return "Visa";
        }
        return null;
    }

    public static PaymentTypeName forValue(String value) throws IOException {
        if (value.equals("American Express")) return AMERICAN_EXPRESS;
        if (value.equals("Delayed Payment")) return DELAYED_PAYMENT;
        if (value.equals("MasterCard")) return MASTER_CARD;
        if (value.equals("Visa")) return VISA;
        throw new IOException("Cannot deserialize PaymentTypeName");
    }
}
