package com.carTrawlerDemo;

public class SupplierLocation {
    private Timezone timezone;
    private String timeZoneAdjustmentMins;

    public Timezone getTimezone() { return timezone; }
    public void setTimezone(Timezone value) { this.timezone = value; }

    public String getTimeZoneAdjustmentMins() { return timeZoneAdjustmentMins; }
    public void setTimeZoneAdjustmentMins(String value) { this.timeZoneAdjustmentMins = value; }
}
