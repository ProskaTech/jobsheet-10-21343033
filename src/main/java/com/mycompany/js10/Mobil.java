//Created by 21343033_Nicholas Ryan Jonathan
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js10;

/**
 *
 * @author User
 */
public class Mobil {
    String merk, warna;
    int tahunproduksi;
    
    public void Maju() {
        int kec = 10;
        System.out.println("Mobil maju sejauh " + kec + " meter");
    }
    public void Mundur() {
        int kec = 5;
        System.out.println("Mobil mundur sejauh " + kec + " meter");
    }
}