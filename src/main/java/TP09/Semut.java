/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09;

/**
 *
 * @author rakha_1302223118
 */
 
public class Semut extends Serangga {
    public Semut(String warna, Koordinat k) {
        super(warna, k);
    }
    
    @Override
    public void gerak(Koordinat k) {
        super.setPosisi(k);
    }
    
    @Override
    public void info() {
        System.out.println("Posisi semut: X = " + super.getPosisi().getX());
        System.out.println("              Y = " + super.getPosisi().getY());
    }
}
