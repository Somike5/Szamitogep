/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.somike.szamitoget_v2;

/**
 *
 * @author somike
 */
public class Kezelo {
    Szamitogep pc01, pc02;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kezelo kezelo = new Kezelo();
    }

    public Kezelo() {
        pc01 = new Szamitogep();
        pc02 = new Szamitogep("PC02", 1024, false);
        
        pc01.kapcsol();
        pc01.programMasol(800);
        pc01.programMasol(400);
        pc02.programMasol(1);
        
        System.out.println(pc01.toString());
        System.out.println(pc02.toString());
    
    }
    
    
}
