/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csillamponifeladat;

/**
 *
 * @author Denes
 */
public class CsillamPoni {
    public String nev;
 private int csillamPont;
 public CsillamPoni(String nev, int csillamPont) {
 nev = nev;
 this.csillamPont = csillamPont;
 }
 public void adjCsillamot(int mennyiseg) {
 csillamPont += mennyiseg;
 }
 public int getCsillamPont() {
 return csillamPont;
 }
 public String bemutatkozas() {
 return nev + ": " + csillamPont;
 }

}
