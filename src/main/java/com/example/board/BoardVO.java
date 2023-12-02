package com.example.board;

import java.util.Date;

public class BoardVO
{
        private String prfpdfrom; // Assuming this is a date field
        private String prfpdto;   // Assuming this is a date field
        private String fcltynm;
        private String prfcast; // Text in SQL usually maps to String in Java
        private String prfruntime;
        private String prfage;
        private String pcseguidance;
        private String poster;  // Same here
        private String prfnm;


    public String getPrfpdfrom() {
        return prfpdfrom;
    }

    public void setPrfpdfrom(String prfpdfrom) {
        this.prfpdfrom = prfpdfrom;
    }

    public String getPrfpdto() {
        return prfpdto;
    }

    public void setPrfpdto(String prfpdto) {
        this.prfpdto = prfpdto;
    }

    public String getFcltynm() {
        return fcltynm;
    }

    public void setFcltynm(String fcltynm) {
        this.fcltynm = fcltynm;
    }

    public String getPrfcast() {
        return prfcast;
    }

    public void setPrfcast(String prfcast) {
        this.prfcast = prfcast;
    }


    public String getPrfruntime() {
        return prfruntime;
    }

    public void setPrfruntime(String prfruntime) {
        this.prfruntime = prfruntime;
    }

    public String getPrfage() {
        return prfage;
    }

    public void setPrfage(String prfage) {
        this.prfage = prfage;
    }

    public String getPcseguidance() {
        return pcseguidance;
    }

    public void setPcseguidance(String pcseguidance) {
        this.pcseguidance = pcseguidance;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }


    public String getPrfnm() {
        return prfnm;
    }

    public void setPrfnm(String prfnm) {
        this.prfnm = prfnm;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    private int bid;


}


