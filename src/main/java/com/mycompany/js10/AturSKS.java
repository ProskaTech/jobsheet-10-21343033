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
public class AturSKS {
    String nama, nim, semester;
    int sks;
    double ip;
    
    AturSKS (String a, String b, String c, double e) {
        nama = a;
        nim = b;
        semester = c;
        ip = e;
    }
    
    public void SKS() {
        if (ip >= 3.5) {
            sks = 24;
        }
        else if ((ip >= 3.0) && (ip < 3.5)) {
            sks = 22;
        }
        else if ((ip >= 2.5) && (ip < 3.0) ) {
            sks = 20;
        }
        else if ((ip >= 2.0) && (ip < 2.5) ) {
            sks = 18;
        }
        else if (ip < 2.0) {
            sks = 15;
        }
    }
    
    public void tampilIdentitas() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Semester\t: " + semester);
        System.out.println("IP Semester ini\t: " + ip);
        System.out.println("Anda berhak mengontrak " + sks + " SKS pada Semester " + semester);
    }
       
    public static void main(String [] args) {
        AturSKS A;
        
        A = new AturSKS("Joni", "12345", "V", 1.20); 
        A.SKS();
        A.tampilIdentitas();
    }
}
