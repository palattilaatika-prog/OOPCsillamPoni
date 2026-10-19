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
// no set-er for szarnySzin since the execise didn't ask for it ( it would be a good idea)
 public RepuloCsillamPoni(String nev, int csillamPont,
 String szarnySzin) 
 {
 super(nev, csillamPont);
 this.szarnySzin = szarnySzin;
 }
 @Override
 // added every attribute to the overrode bemutatkozas() method
 public String bemutatkozas() 
 {
 return "Repulo poni: " + getPoniNev()+" RepuloPoni pontszam:"+getCsillamPont()+ "Szarnyszin: "+getszarnySzin();
 }
public String getszarnySzin()
{
    return this.szarnySzin;
}

}
