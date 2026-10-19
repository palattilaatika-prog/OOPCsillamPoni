/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csillamponifeladat;

/**
 *
 * @author Denes
 */
public class RepuloCsillamPoni extends CsillamPoni{
    private String szarnySzin;
 public RepuloCsillamPoni(String nev, int csillamPont,
 String szarnySzin) 
 {
 super(nev, csillamPont);
 this.szarnySzin = szarnySzin;
 }
 @Override
 public String bemutatkozas() 
 {
 return "Repulo poni: " + getPoniNev()+" RepuloPoni pontszam:"+getCsillamPont()+ "Szarnyszin: "+this.szarnySzin;
 }

}
