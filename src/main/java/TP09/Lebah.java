/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09;

/**
 *
 * @author rakha
 */
public class Lebah extends Serangga {
    
    public Lebah(String warna, Koordinat3D k) {
        super(warna, k);
    }
    
    @Override
    public void gerak(Koordinat k) {
        if(k instanceof Koordinat3D) {
            k.setX(k.getX());
            k.setY(k.getY());
            ((Koordinat3D) k).setZ(((Koordinat3D) k).getZ());
        }
    }
    
    @Override
    public void info() {
        Koordinat3D posisiLebah = (Koordinat3D)super.getPosisi();
        System.out.println("Posisi lebah: X = " + posisiLebah.getX());
        System.out.println("              Y = " + posisiLebah.getY());
        System.out.println("              Z = " + posisiLebah.getZ());
    }
}
