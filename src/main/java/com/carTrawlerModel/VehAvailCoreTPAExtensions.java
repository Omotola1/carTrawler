package com.carTrawlerModel;

public class VehAvailCoreTPAExtensions {
    private String pictureURLHD;
    private UpSell upSell;
    private DebitCard debitCard;
    private PPDep ppDep;
    private ZeroDeposit zeroDeposit;
    private FuelPolicy fuelPolicy;
    private Config config;
    private OrderBy orderBy;
    private Indexation indexation;
    private FlightDetails ccInfo;
    private SpecialOffersUnion specialOffers;
    private Duration duration;
    private Deposit deposit;
    private PricedEquipsDisplay[] pricedEquipsDisplay;
    private Fleet fleet;
    private Fee[] fees;

    public String getPictureURLHD() { return pictureURLHD; }
    public void setPictureURLHD(String value) { this.pictureURLHD = value; }

    public UpSell getUpSell() { return upSell; }
    public void setUpSell(UpSell value) { this.upSell = value; }

    public DebitCard getDebitCard() { return debitCard; }
    public void setDebitCard(DebitCard value) { this.debitCard = value; }

    public PPDep getPpDep() { return ppDep; }
    public void setPpDep(PPDep value) { this.ppDep = value; }

    public ZeroDeposit getZeroDeposit() { return zeroDeposit; }
    public void setZeroDeposit(ZeroDeposit value) { this.zeroDeposit = value; }

    public FuelPolicy getFuelPolicy() { return fuelPolicy; }
    public void setFuelPolicy(FuelPolicy value) { this.fuelPolicy = value; }

    public Config getConfig() { return config; }
    public void setConfig(Config value) { this.config = value; }

    public OrderBy getOrderBy() { return orderBy; }
    public void setOrderBy(OrderBy value) { this.orderBy = value; }

    public Indexation getIndexation() { return indexation; }
    public void setIndexation(Indexation value) { this.indexation = value; }

    public FlightDetails getCcInfo() { return ccInfo; }
    public void setCcInfo(FlightDetails value) { this.ccInfo = value; }

    public SpecialOffersUnion getSpecialOffers() { return specialOffers; }
    public void setSpecialOffers(SpecialOffersUnion value) { this.specialOffers = value; }

    public Duration getDuration() { return duration; }
    public void setDuration(Duration value) { this.duration = value; }

    public Deposit getDeposit() { return deposit; }
    public void setDeposit(Deposit value) { this.deposit = value; }

    public PricedEquipsDisplay[] getPricedEquipsDisplay() { return pricedEquipsDisplay; }
    public void setPricedEquipsDisplay(PricedEquipsDisplay[] value) { this.pricedEquipsDisplay = value; }

    public Fleet getFleet() { return fleet; }
    public void setFleet(Fleet value) { this.fleet = value; }

    public Fee[] getFees() { return fees; }
    public void setFees(Fee[] value) { this.fees = value; }
}
