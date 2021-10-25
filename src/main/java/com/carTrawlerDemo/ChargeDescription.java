package com.carTrawlerDemo;

import java.io.IOException;

public enum ChargeDescription {
    COLLISION_DAMAGE_WAIVER_CDW, COMPLETE_COVER_PACKAGE, EXTRA_INSURANCE, THEFT_WAIVER_TW, THIRD_PARTY_LIABILITY_PROTECTION_TP;

    public String toValue() {
        switch (this) {
            case COLLISION_DAMAGE_WAIVER_CDW: return "Collision damage waiver (CDW)";
            case COMPLETE_COVER_PACKAGE: return "Complete cover package";
            case EXTRA_INSURANCE: return "Extra insurance";
            case THEFT_WAIVER_TW: return "Theft waiver (TW)";
            case THIRD_PARTY_LIABILITY_PROTECTION_TP: return "Third party liability protection (TP)";
        }
        return null;
    }

    public static ChargeDescription forValue(String value) throws IOException {
        if (value.equals("Collision damage waiver (CDW)")) return COLLISION_DAMAGE_WAIVER_CDW;
        if (value.equals("Complete cover package")) return COMPLETE_COVER_PACKAGE;
        if (value.equals("Extra insurance")) return EXTRA_INSURANCE;
        if (value.equals("Theft waiver (TW)")) return THEFT_WAIVER_TW;
        if (value.equals("Third party liability protection (TP)")) return THIRD_PARTY_LIABILITY_PROTECTION_TP;
        throw new IOException("Cannot deserialize ChargeDescription");
    }
}
