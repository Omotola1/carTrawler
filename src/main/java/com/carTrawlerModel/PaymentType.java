package com.carTrawlerModel;

public class PaymentType {
    private PaymentTypeType type;
    private PaymentTypeCode code;
    private PaymentTypeName name;

    public PaymentTypeType getType() { return type; }
    public void setType(PaymentTypeType value) { this.type = value; }

    public PaymentTypeCode getCode() { return code; }
    public void setCode(PaymentTypeCode value) { this.code = value; }

    public PaymentTypeName getName() { return name; }
    public void setName(PaymentTypeName value) { this.name = value; }
}
