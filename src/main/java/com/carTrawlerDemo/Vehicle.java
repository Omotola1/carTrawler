package com.carTrawlerDemo;

public class Vehicle {
    private String airConditionInd;
    private TransmissionType transmissionType;
    private Type fuelType;
    private Type driveType;
    private String passengerQuantity;
    private String baggageQuantity;
    private String code;
    private Context codeContext;
    private VehType vehType;
    private VehClass vehClass;
    private VehMakeModel vehMakeModel;
    private String pictureURL;
    private VehIdentity vehIdentity;
    private String usbConnection;
    private String blueTooth;

    public String getAirConditionInd() { return airConditionInd; }
    public void setAirConditionInd(String value) { this.airConditionInd = value; }

    public TransmissionType getTransmissionType() { return transmissionType; }
    public void setTransmissionType(TransmissionType value) { this.transmissionType = value; }

    public Type getFuelType() { return fuelType; }
    public void setFuelType(Type value) { this.fuelType = value; }

    public Type getDriveType() { return driveType; }
    public void setDriveType(Type value) { this.driveType = value; }

    public String getPassengerQuantity() { return passengerQuantity; }
    public void setPassengerQuantity(String value) { this.passengerQuantity = value; }

    public String getBaggageQuantity() { return baggageQuantity; }
    public void setBaggageQuantity(String value) { this.baggageQuantity = value; }

    public String getCode() { return code; }
    public void setCode(String value) { this.code = value; }

    public Context getCodeContext() { return codeContext; }
    public void setCodeContext(Context value) { this.codeContext = value; }

    public VehType getVehType() { return vehType; }
    public void setVehType(VehType value) { this.vehType = value; }

    public VehClass getVehClass() { return vehClass; }
    public void setVehClass(VehClass value) { this.vehClass = value; }

    public VehMakeModel getVehMakeModel() { return vehMakeModel; }
    public void setVehMakeModel(VehMakeModel value) { this.vehMakeModel = value; }

    public String getPictureURL() { return pictureURL; }
    public void setPictureURL(String value) { this.pictureURL = value; }

    public VehIdentity getVehIdentity() { return vehIdentity; }
    public void setVehIdentity(VehIdentity value) { this.vehIdentity = value; }

    public String getUSBConnection() { return usbConnection; }
    public void setUSBConnection(String value) { this.usbConnection = value; }

    public String getBlueTooth() { return blueTooth; }
    public void setBlueTooth(String value) { this.blueTooth = value; }
}
