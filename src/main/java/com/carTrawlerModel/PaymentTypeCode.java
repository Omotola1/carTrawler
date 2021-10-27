package com.carTrawlerModel;

import java.io.IOException;

public enum PaymentTypeCode {
    AX, DELAYED_PAYMENT, MC, VI;

    public String toValue() {
        switch (this) {
            case AX: return "AX";
            case DELAYED_PAYMENT: return "DELAYED_PAYMENT";
            case MC: return "MC";
            case VI: return "VI";
        }
        return null;
    }

    public static PaymentTypeCode forValue(String value) throws IOException {
        if (value.equals("AX")) return AX;
        if (value.equals("DELAYED_PAYMENT")) return DELAYED_PAYMENT;
        if (value.equals("MC")) return MC;
        if (value.equals("VI")) return VI;
        throw new IOException("Cannot deserialize PaymentTypeCode");
    }
}
