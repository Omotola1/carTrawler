package com.carTrawlerDemo;

import java.io.IOException;

public enum SortOrderingType {
    DEFAULT, VLI_1_VLI_X, VLI_2_VLI_X, VLI_3_VLI_X;

    public String toValue() {
        switch (this) {
            case DEFAULT: return "DEFAULT";
            case VLI_1_VLI_X: return "VLI_1.VLI.X";
            case VLI_2_VLI_X: return "VLI_2.VLI.X";
            case VLI_3_VLI_X: return "VLI_3.VLI.X";
        }
        return null;
    }

    public static SortOrderingType forValue(String value) throws IOException {
        if (value.equals("DEFAULT")) return DEFAULT;
        if (value.equals("VLI_1.VLI.X")) return VLI_1_VLI_X;
        if (value.equals("VLI_2.VLI.X")) return VLI_2_VLI_X;
        if (value.equals("VLI_3.VLI.X")) return VLI_3_VLI_X;
        throw new IOException("Cannot deserialize SortOrderingType");
    }
}
