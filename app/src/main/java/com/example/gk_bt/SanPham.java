package com.example.gk_bt;

import java.io.Serializable;

public class SanPham implements Serializable {

    private  String maSP, tenSP,giaSP, loaiSP;
    public SanPham() {
    }
    public SanPham(String maSP, String tenSP, String giaSP, String loaiSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.loaiSP = loaiSP;
    }
    public String getMaSP() {
        return maSP;
    }
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }
    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public String getGiaSP() {
        return giaSP;
    }
    public void setGiaSP(String giaSP) {
        this.giaSP = giaSP;
    }
    public String getLoaiSP() {
        return loaiSP;
    }
    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }
    @Override
    public String toString() {
        return "SanPham{" +
                "maSP='" + maSP + '\''+
                "tenSP='" + tenSP +'\''+
                ", giaSP='" + giaSP + '\'' +
                ", loaiSP='" + loaiSP + '\'' +
                '}';
    }
}
