package com.carTrawlerDemo;

public class PricedCoverage {
    private Coverage coverage;
    private PricedCoverageCharge charge;
    private Deductible deductible;

    public Coverage getCoverage() { return coverage; }
    public void setCoverage(Coverage value) { this.coverage = value; }

    public PricedCoverageCharge getCharge() { return charge; }
    public void setCharge(PricedCoverageCharge value) { this.charge = value; }

    public Deductible getDeductible() { return deductible; }
    public void setDeductible(Deductible value) { this.deductible = value; }
}
