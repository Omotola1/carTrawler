package com.carTrawlerModel;

import java.time.OffsetDateTime;

public class VehRentalCore {
    private OffsetDateTime pickUpDateTime;
    private OffsetDateTime returnDateTime;
    private Location pickUpLocation;
    private Location returnLocation;

    public OffsetDateTime getPickUpDateTime() { return pickUpDateTime; }
    public void setPickUpDateTime(OffsetDateTime value) { this.pickUpDateTime = value; }

    public OffsetDateTime getReturnDateTime() { return returnDateTime; }
    public void setReturnDateTime(OffsetDateTime value) { this.returnDateTime = value; }

    public Location getPickUpLocation() { return pickUpLocation; }
    public void setPickUpLocation(Location value) { this.pickUpLocation = value; }

    public Location getReturnLocation() { return returnLocation; }
    public void setReturnLocation(Location value) { this.returnLocation = value; }
}
