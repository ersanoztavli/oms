/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oms.models;

/**
 *
 * @author ersan
 */
public class TanimliSatinAlmaFiyati {
    
    private double fiyat;
    private int teklifSatirId;
    private boolean secildiMi;
    private int sanalId;

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public boolean isSecildiMi() {
        return secildiMi;
    }

    public void setSecildiMi(boolean secildiMi) {
        this.secildiMi = secildiMi;
    }

    public int getTeklifSatirId() {
        return teklifSatirId;
    }

    public void setTeklifSatirId(int teklifSatirId) {
        this.teklifSatirId = teklifSatirId;
    }

    public int getSanalId() {
        return sanalId;
    }

    public void setSanalId(int sanalId) {
        this.sanalId = sanalId;
    }
    
}
