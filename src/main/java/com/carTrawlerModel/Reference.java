package com.carTrawlerModel;

import java.time.OffsetDateTime;

public class Reference {
    private String type;
    private String id;
    private Context idContext;
    private OffsetDateTime dateTime;
    private String url;

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public Context getIDContext() { return idContext; }
    public void setIDContext(Context value) { this.idContext = value; }

    public OffsetDateTime getDateTime() { return dateTime; }
    public void setDateTime(OffsetDateTime value) { this.dateTime = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
}
