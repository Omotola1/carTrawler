package com.carTrawlerDemo;

public class InfoTPAExtensions {
    private SortOrdering sortOrdering;
    private VendorPruningCategory vendorPruningCategory;
    private VendorPictureURL vendorPictureURL;
    private CustomerReviews customerReviews;
    private Obfuscation obfuscation;
    private Ranking ranking;
    private PaymentType[] paymentTypes;
    private Features features;
    private FlightDetails flightDetails;
    private String totalVendorOffers;

    public SortOrdering getSortOrdering() { return sortOrdering; }
    public void setSortOrdering(SortOrdering value) { this.sortOrdering = value; }

    public VendorPruningCategory getVendorPruningCategory() { return vendorPruningCategory; }
    public void setVendorPruningCategory(VendorPruningCategory value) { this.vendorPruningCategory = value; }

    public VendorPictureURL getVendorPictureURL() { return vendorPictureURL; }
    public void setVendorPictureURL(VendorPictureURL value) { this.vendorPictureURL = value; }

    public CustomerReviews getCustomerReviews() { return customerReviews; }
    public void setCustomerReviews(CustomerReviews value) { this.customerReviews = value; }

    public Obfuscation getObfuscation() { return obfuscation; }
    public void setObfuscation(Obfuscation value) { this.obfuscation = value; }

    public Ranking getRanking() { return ranking; }
    public void setRanking(Ranking value) { this.ranking = value; }

    public PaymentType[] getPaymentTypes() { return paymentTypes; }
    public void setPaymentTypes(PaymentType[] value) { this.paymentTypes = value; }

    public Features getFeatures() { return features; }
    public void setFeatures(Features value) { this.features = value; }

    public FlightDetails getFlightDetails() { return flightDetails; }
    public void setFlightDetails(FlightDetails value) { this.flightDetails = value; }

    public String getTotalVendorOffers() { return totalVendorOffers; }
    public void setTotalVendorOffers(String value) { this.totalVendorOffers = value; }
}
