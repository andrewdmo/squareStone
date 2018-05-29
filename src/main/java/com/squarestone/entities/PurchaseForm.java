package com.squarestone.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class PurchaseForm {

    private long appraisal;

    private long roofInsp;

    private long ph1EnvAssess;

    private long ph2EnvAssess;

    private long attyFee;

    private long survey;

    private long miscCost1;

    private long miscCost2;

    private long addtCostSum;

    private long purchasePrice;

    private long purchaseTotal = addtCostSum + purchasePrice;

    public long getAddtCostSum() {
        addtCostSum = appraisal + roofInsp + ph1EnvAssess + ph2EnvAssess + attyFee + survey + miscCost1 + miscCost2;
        return addtCostSum;
    }

    public long getCostSum() {
        this.purchaseTotal = addtCostSum + purchasePrice;
        return purchaseTotal;
    }

    public long getAppraisal() {
        return appraisal;
    }

    public void setAppraisal(long appraisal) {
        this.appraisal = appraisal;
    }

    public long getRoofInsp() {
        return roofInsp;
    }

    public void setRoofInsp(long roofInsp) {
        this.roofInsp = roofInsp;
    }

    public long getPh1EnvAssess() {
        return ph1EnvAssess;
    }

    public void setPh1EnvAssess(long ph1EnvAssess) {
        this.ph1EnvAssess = ph1EnvAssess;
    }

    public long getPh2EnvAssess() {
        return ph2EnvAssess;
    }

    public void setPh2EnvAssess(long ph2EnvAssess) {
        this.ph2EnvAssess = ph2EnvAssess;
    }

    public long getAttyFee() {
        return attyFee;
    }

    public void setAttyFee(long attyFee) {
        this.attyFee = attyFee;
    }

    public long getSurvey() {
        return survey;
    }

    public void setSurvey(long survey) {
        this.survey = survey;
    }

    public long getMiscCost1() {
        return miscCost1;
    }

    public void setMiscCost1(long miscCost1) {
        this.miscCost1 = miscCost1;
    }

    public long getMiscCost2() {
        return miscCost2;
    }

    public void setMiscCost2(long miscCost2) {
        this.miscCost2 = miscCost2;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}