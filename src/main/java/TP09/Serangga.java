/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09;

/**
 *
 * @author rakha_1302223118
 */
public abstract class Serangga {

    private final Koordinat posisi;
    private String warna;

    public Serangga(String warna, Koordinat k) {
        this.warna = warna;
        this.posisi = k;
    }

    public abstract void gerak(Koordinat k);

    public abstract void info();

    public Koordinat getPosisi() {
        return posisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
