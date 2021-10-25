package com.carTrawlerDemo;

import java.time.OffsetDateTime;

public class Welcome {
    private String xmlns;
    private String xmlnsXsi;
    private String xsiSchemaLocation;
    private String version;
    private String target;
    private String primaryLangID;
    private OffsetDateTime timeStamp;
    private Object[] success;
    private VehAvailRSCore vehAvailRSCore;

    public String getXmlns() { return xmlns; }
    public void setXmlns(String value) { this.xmlns = value; }

    public String getXmlnsXsi() { return xmlnsXsi; }
    public void setXmlnsXsi(String value) { this.xmlnsXsi = value; }

    public String getXsiSchemaLocation() { return xsiSchemaLocation; }
    public void setXsiSchemaLocation(String value) { this.xsiSchemaLocation = value; }

    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    public String getTarget() { return target; }
    public void setTarget(String value) { this.target = value; }

    public String getPrimaryLangID() { return primaryLangID; }
    public void setPrimaryLangID(String value) { this.primaryLangID = value; }

    public OffsetDateTime getTimeStamp() { return timeStamp; }
    public void setTimeStamp(OffsetDateTime value) { this.timeStamp = value; }

    public Object[] getSuccess() { return success; }
    public void setSuccess(Object[] value) { this.success = value; }

    public VehAvailRSCore getVehAvailRSCore() { return vehAvailRSCore; }
    public void setVehAvailRSCore(VehAvailRSCore value) { this.vehAvailRSCore = value; }
}
