package com.carTrawlerDemo;

import java.io.IOException;

public enum LocationEnum {
    VWF_1_VWF_X, VWF_2_VWF_X, VWF_3_VWF_X;

    public String toValue() {
        switch (this) {
            case VWF_1_VWF_X: return "VWF_1.VWF.X";
            case VWF_2_VWF_X: return "VWF_2.VWF.X";
            case VWF_3_VWF_X: return "VWF_3.VWF.X";
        }
        return null;
    }

    public static LocationEnum forValue(String value) throws IOException {
        if (value.equals("VWF_1.VWF.X")) return VWF_1_VWF_X;
        if (value.equals("VWF_2.VWF.X")) return VWF_2_VWF_X;
        if (value.equals("VWF_3.VWF.X")) return VWF_3_VWF_X;
        throw new IOException("Cannot deserialize LocationEnum");
    }
}
