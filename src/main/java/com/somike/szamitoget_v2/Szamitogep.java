/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.somike.szamitoget_v2;

/**
 *
 * @author somike
 */
public class Szamitogep {
    
    private double freeMemInMB = 1024;
    private boolean isOn = false;
    private String pcName = "AlapPC";
    
    Szamitogep(){
        
    }
    
    Szamitogep(String name, double mem, boolean s) {
        pcName = name;
        freeMemInMB = mem;
        isOn = s;
    }
    
    public void kapcsol(){
        isOn = !isOn;
    }
    
    public boolean programMasol(double programMeretInMB) {
        double ujMeret = this.freeMemInMB-programMeretInMB;
        //System.err.println("Új Méret: " + ujMeret + " ("+freeMemInMB+"-"+programMeretInMB+")");
        
        if(ujMeret<0 || !isOn){
            System.out.println(pcName + ": Sajnos a másolás sikertelen.");
            return false;
        }else {
            System.out.println(pcName + ": A másolás sikeres!!");
            freeMemInMB = ujMeret;
            return true;
        }
        
    }
    
    @Override
    public String toString() {
        return "\n"+pcName+":\n Kapcsoló állapota: " + (isOn ? "KI":"BE") + "\n Szabad memória: " + freeMemInMB;
    }
    
}
