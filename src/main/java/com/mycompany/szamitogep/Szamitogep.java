/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.szamitogep;

/**
 *
 * @author somike
 */
public class Szamitogep {
    
    private double freeMemInMB = 1024;
    private boolean isOn = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Szamitogep pc01 = new Szamitogep();
        Szamitogep pc02 = new Szamitogep(1024, false);
        
        pc01.kapcsol();
        pc01.programMasol(800);
        pc01.programMasol(400);
        pc02.programMasol(1);
        
        System.out.println("PC01: " + pc01.toString());
        System.out.println("PC02: " + pc02.toString());
    }
    
    Szamitogep(){
        
    }
    
    Szamitogep(double mem, boolean s) {
        freeMemInMB = mem;
        isOn = s;
    }
    
    private void kapcsol(){
        isOn = !isOn;
    }
    
    private boolean programMasol(double programMeretInMB) {
        double ujMeret = this.freeMemInMB-programMeretInMB;
        //System.err.println("Új Méret: " + ujMeret + " ("+freeMemInMB+"-"+programMeretInMB+")");
        
        if(ujMeret<0 || !isOn){
            System.out.println("Sajnos a másolás sikertelen.");
            return false;
        }else {
            System.out.println("A másolás sikeres!!");
            freeMemInMB = ujMeret;
            return true;
        }
        
    }

    @Override
    public String toString() {
        //String s = isOn ? "GG":"HH";
        return "\n Kapcsoló állapota: " + (isOn ? "KI":"BE") + "\n Szabad memória: " + freeMemInMB + "\n";
    }
    
    
}
