/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TP09;

/**
 *
 * @author rakha_1302223118
 */
public class DriverSerangga {

    public static void main(String[] args) {
        Semut S = new Semut("Merah", new Koordinat(70, 90));
        Lebah L = new Lebah("Oranye", new Koordinat3D(30, 40, 50));
        
        System.out.println("Warna Semut : " + S.getWarna());
        S.info();
        
        S.gerak(new Koordinat(80, 100));
        S.info();
        
        System.out.println("Warna Lebah : " + L.getWarna());
        L.info();
        
        L.gerak(new Koordinat3D(45, 55, 65));
        L.info();
    }
}
