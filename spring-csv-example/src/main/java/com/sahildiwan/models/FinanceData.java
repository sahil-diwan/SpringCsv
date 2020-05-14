package com.sahildiwan.models;

import com.opencsv.bean.CsvBindByPosition;

public class FinanceData {

    @CsvBindByPosition(position = 0)
    private String policyID;

    @CsvBindByPosition(position = 1)
    private String statecode;

    @CsvBindByPosition(position = 2)
    private String county;

    @CsvBindByPosition(position = 3)
    private String eq_site_limit;

    @CsvBindByPosition(position = 4)
    private String hu_site_limit;

    @CsvBindByPosition(position = 5)
    private String fl_site_limit;

    @CsvBindByPosition(position = 6)
    private String fr_site_limit;

    @CsvBindByPosition(position = 7)
    private String tiv_2011;

    @CsvBindByPosition(position = 7)
    private String tiv_2012;

    @CsvBindByPosition(position = 8)
    private String eq_site_deductible;

    @CsvBindByPosition(position = 9)
    private String hu_site_deductible;

    @CsvBindByPosition(position = 10)
    private String fl_site_deductible;

    @CsvBindByPosition(position = 11)
    private String fr_site_deductible;

    @CsvBindByPosition(position = 12)
    private String point_latitude;

    @CsvBindByPosition(position = 13)
    private String point_longitude;

    @CsvBindByPosition(position = 14)
    private String line;

    @CsvBindByPosition(position = 15)
    private String construction;

    @CsvBindByPosition(position = 16)
    private String point_granularity;

    public FinanceData(){

    }

    public FinanceData(String policyID, String statecode, String county, String eq_site_limit, String hu_site_limit, String fl_site_limit, String fr_site_limit, String tiv_2011, String tiv_2012, String eq_site_deductible, String hu_site_deductible, String fl_site_deductible, String fr_site_deductible, String point_latitude, String point_longitude, String line, String construction, String point_granularity) {
        this.policyID = policyID;
        this.statecode = statecode;
        this.county = county;
        this.eq_site_limit = eq_site_limit;
        this.hu_site_limit = hu_site_limit;
        this.fl_site_limit = fl_site_limit;
        this.fr_site_limit = fr_site_limit;
        this.tiv_2011 = tiv_2011;
        this.tiv_2012 = tiv_2012;
        this.eq_site_deductible = eq_site_deductible;
        this.hu_site_deductible = hu_site_deductible;
        this.fl_site_deductible = fl_site_deductible;
        this.fr_site_deductible = fr_site_deductible;
        this.point_latitude = point_latitude;
        this.point_longitude = point_longitude;
        this.line = line;
        this.construction = construction;
        this.point_granularity = point_granularity;
    }

    public String getPolicyID() {
        return policyID;
    }

    public void setPolicyID(String policyID) {
        this.policyID = policyID;
    }

    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getEq_site_limit() {
        return eq_site_limit;
    }

    public void setEq_site_limit(String eq_site_limit) {
        this.eq_site_limit = eq_site_limit;
    }

    public String getHu_site_limit() {
        return hu_site_limit;
    }

    public void setHu_site_limit(String hu_site_limit) {
        this.hu_site_limit = hu_site_limit;
    }

    public String getFl_site_limit() {
        return fl_site_limit;
    }

    public void setFl_site_limit(String fl_site_limit) {
        this.fl_site_limit = fl_site_limit;
    }

    public String getFr_site_limit() {
        return fr_site_limit;
    }

    public void setFr_site_limit(String fr_site_limit) {
        this.fr_site_limit = fr_site_limit;
    }

    public String getTiv_2011() {
        return tiv_2011;
    }

    public void setTiv_2011(String tiv_2011) {
        this.tiv_2011 = tiv_2011;
    }

    public String getTiv_2012() {
        return tiv_2012;
    }

    public void setTiv_2012(String tiv_2012) {
        this.tiv_2012 = tiv_2012;
    }

    public String getEq_site_deductible() {
        return eq_site_deductible;
    }

    public void setEq_site_deductible(String eq_site_deductible) {
        this.eq_site_deductible = eq_site_deductible;
    }

    public String getHu_site_deductible() {
        return hu_site_deductible;
    }

    public void setHu_site_deductible(String hu_site_deductible) {
        this.hu_site_deductible = hu_site_deductible;
    }

    public String getFl_site_deductible() {
        return fl_site_deductible;
    }

    public void setFl_site_deductible(String fl_site_deductible) {
        this.fl_site_deductible = fl_site_deductible;
    }

    public String getFr_site_deductible() {
        return fr_site_deductible;
    }

    public void setFr_site_deductible(String fr_site_deductible) {
        this.fr_site_deductible = fr_site_deductible;
    }

    public String getPoint_latitude() {
        return point_latitude;
    }

    public void setPoint_latitude(String point_latitude) {
        this.point_latitude = point_latitude;
    }

    public String getPoint_longitude() {
        return point_longitude;
    }

    public void setPoint_longitude(String point_longitude) {
        this.point_longitude = point_longitude;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public String getPoint_granularity() {
        return point_granularity;
    }

    public void setPoint_granularity(String point_granularity) {
        this.point_granularity = point_granularity;
    }

    @Override
    public String toString() {
        return "FinanceData{" +
                "policyID='" + policyID + '\'' +
                ", statecode='" + statecode + '\'' +
                ", county='" + county + '\'' +
                ", eq_site_limit='" + eq_site_limit + '\'' +
                ", hu_site_limit='" + hu_site_limit + '\'' +
                ", fl_site_limit='" + fl_site_limit + '\'' +
                ", fr_site_limit='" + fr_site_limit + '\'' +
                ", tiv_2011='" + tiv_2011 + '\'' +
                ", tiv_2012='" + tiv_2012 + '\'' +
                ", eq_site_deductible='" + eq_site_deductible + '\'' +
                ", hu_site_deductible='" + hu_site_deductible + '\'' +
                ", fl_site_deductible='" + fl_site_deductible + '\'' +
                ", fr_site_deductible='" + fr_site_deductible + '\'' +
                ", point_latitude='" + point_latitude + '\'' +
                ", point_longitude='" + point_longitude + '\'' +
                ", line='" + line + '\'' +
                ", construction='" + construction + '\'' +
                ", point_granularity='" + point_granularity + '\'' +
                '}';
    }
}
