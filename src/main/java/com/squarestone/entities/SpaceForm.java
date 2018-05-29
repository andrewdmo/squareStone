package com.squarestone.entities;

import org.springframework.stereotype.Component;

@Component
public class SpaceForm {


    //simple FOR loop should work for unlimited variables:
//simple FOR loop should work


    private long tenantSpace1 = 0;
    private long tenantSpace2 = 2;
    private long tenantSpace3 = 3;
    private long tenantSpace4 = 4;

    private long commonSpace1 = 1;
    private long commonSpace2 = 1;

    private long totalSqFt = tenantSpace1 + tenantSpace2 + tenantSpace3 + tenantSpace4 + commonSpace1 + commonSpace2;
    private long tenantSqFt = tenantSpace1 + tenantSpace2 + tenantSpace3 + tenantSpace4;
    private long commonSqFt = commonSpace1 + commonSpace2;

    //throw divZero Exception in different method OR have values above
    private long tenantPercentOfTotal1 = (tenantSpace1 / totalSqFt);
    private long tenantPercentOfTotal2 = (tenantSpace2 / totalSqFt);
    private long tenantPercentOfTotal3 = (tenantSpace3 / totalSqFt);
    private long tenantPercentOfTotal4 = (tenantSpace4 / totalSqFt);

    private long commonPercentofTotal1 = (tenantSpace1 / totalSqFt);
    private long commonPercentofTotal2 = (tenantSpace2 / totalSqFt);

    //exception if not 100?
    private long percentSum = tenantPercentOfTotal1 + tenantPercentOfTotal2 + tenantPercentOfTotal3 + tenantPercentOfTotal4;


    private long tenantOnlyPercent1 = (tenantSpace1 / tenantSqFt);
    private long tenantOnlyPercent2 = (tenantSpace2 / tenantSqFt);
    private long tenantOnlyPercent3 = (tenantSpace3 / tenantSqFt);
    private long tenantOnlyPercent4 = (tenantSpace4 / tenantSqFt);

    private Long tenantOnlyPercentSum = tenantOnlyPercent1 + tenantOnlyPercent2 + tenantOnlyPercent3 + tenantOnlyPercent4;

    public long getTenantSpace1() {
        return tenantSpace1;
    }

    public void setTenantSpace1(long tenantSpace1) {
        this.tenantSpace1 = tenantSpace1;
    }

    public long getTenantSpace2() {
        return tenantSpace2;
    }

    public void setTenantSpace2(long tenantSpace2) {
        this.tenantSpace2 = tenantSpace2;
    }

    public long getTenantSpace3() {
        return tenantSpace3;
    }

    public void setTenantSpace3(long tenantSpace3) {
        this.tenantSpace3 = tenantSpace3;
    }

    public long getTenantSpace4() {
        return tenantSpace4;
    }

    public void setTenantSpace4(long tenantSpace4) {
        this.tenantSpace4 = tenantSpace4;
    }

    public long getCommonSpace1() {
        return commonSpace1;
    }

    public void setCommonSpace1(long commonSpace1) {
        this.commonSpace1 = commonSpace1;
    }

    public long getCommonSpace2() {
        return commonSpace2;
    }

    public void setCommonSpace2(long commonSpace2) {
        this.commonSpace2 = commonSpace2;
    }

    public long getTotalSqFt() {
        return totalSqFt;
    }

    public void setTotalSqFt(long totalSqFt) {
        this.totalSqFt = totalSqFt;
    }

    public long getTenantSqFt() {
        return tenantSqFt;
    }

    public void setTenantSqFt(long tenantSqFt) {
        this.tenantSqFt = tenantSqFt;
    }

    public long getCommonSqFt() {
        return commonSqFt;
    }

    public void setCommonSqFt(long commonSqFt) {
        this.commonSqFt = commonSqFt;
    }

    public long getTenantPercentOfTotal1() {
        return tenantPercentOfTotal1;
    }

    public void setTenantPercentOfTotal1(long tenantPercentOfTotal1) {
        this.tenantPercentOfTotal1 = tenantPercentOfTotal1;
    }

    public long getTenantPercentOfTotal2() {
        return tenantPercentOfTotal2;
    }

    public void setTenantPercentOfTotal2(long tenantPercentOfTotal2) {
        this.tenantPercentOfTotal2 = tenantPercentOfTotal2;
    }

    public long getTenantPercentOfTotal3() {
        return tenantPercentOfTotal3;
    }

    public void setTenantPercentOfTotal3(long tenantPercentOfTotal3) {
        this.tenantPercentOfTotal3 = tenantPercentOfTotal3;
    }

    public long getTenantPercentOfTotal4() {
        return tenantPercentOfTotal4;
    }

    public void setTenantPercentOfTotal4(long tenantPercentOfTotal4) {
        this.tenantPercentOfTotal4 = tenantPercentOfTotal4;
    }

    public long getCommonPercentofTotal1() {
        return commonPercentofTotal1;
    }

    public void setCommonPercentofTotal1(long commonPercentofTotal1) {
        this.commonPercentofTotal1 = commonPercentofTotal1;
    }

    public long getCommonPercentofTotal2() {
        return commonPercentofTotal2;
    }

    public void setCommonPercentofTotal2(long commonPercentofTotal2) {
        this.commonPercentofTotal2 = commonPercentofTotal2;
    }

    public long getPercentSum() {
        return percentSum;
    }

    public void setPercentSum(long percentSum) {
        this.percentSum = percentSum;
    }

    public long getTenantOnlyPercent1() {
        return tenantOnlyPercent1;
    }

    public void setTenantOnlyPercent1(long tenantOnlyPercent1) {
        this.tenantOnlyPercent1 = tenantOnlyPercent1;
    }

    public long getTenantOnlyPercent2() {
        return tenantOnlyPercent2;
    }

    public void setTenantOnlyPercent2(long tenantOnlyPercent2) {
        this.tenantOnlyPercent2 = tenantOnlyPercent2;
    }

    public long getTenantOnlyPercent3() {
        return tenantOnlyPercent3;
    }

    public void setTenantOnlyPercent3(long tenantOnlyPercent3) {
        this.tenantOnlyPercent3 = tenantOnlyPercent3;
    }

    public long getTenantOnlyPercent4() {
        return tenantOnlyPercent4;
    }

    public void setTenantOnlyPercent4(long tenantOnlyPercent4) {
        this.tenantOnlyPercent4 = tenantOnlyPercent4;
    }

    public Long getTenantOnlyPercentSum() {
        return tenantOnlyPercentSum;
    }

    public void setTenantOnlyPercentSum(Long tenantOnlyPercentSum) {
        this.tenantOnlyPercentSum = tenantOnlyPercentSum;
    }
}