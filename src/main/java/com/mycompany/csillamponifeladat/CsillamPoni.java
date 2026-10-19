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
    //made the string private (class only)
    private String nev;
 private int csillamPont;
 public CsillamPoni(String nev, int csillamPont) {
     //adde this.nev since nev=nev wouldn't change the objects attribute
     //added validation to constructor
     if(nev==null||"".equals(nev))
     {throw new IllegalArgumentException("A nev nem lehet null vagy ures");}
 this.nev = nev;
 if(csillamPont<0)
    {throw new IllegalArgumentException("A csillamPont csak pozitiv egesz szam lehet");}
    this.csillamPont += csillamPont;
 }
 public void adjCsillamot(int mennyiseg) 
 {
     //Added  validation to the set-er
    if(mennyiseg<0)
    {throw new IllegalArgumentException("A csillamPont csak pozitiv egesz szam lehet");}
    csillamPont += mennyiseg;
 }
 public int getCsillamPont() {
 return csillamPont;
 }
 // added get-er fot the "nev" attribute
 public String getPoniNev()
 {
     return this.nev;
 }
 public String bemutatkozas() {
 return nev + ": " + csillamPont;
 }
 //leghoszabbCsillamSorozat implemented 
 public static int leghosszabbCsillamSorozat(int[] napiPontok, int minimum)
{
    int ujeredmeny=0;
    int regieredmeny=0;
    if(napiPontok==null)
    {return 0;}
    for(int i=0;i<napiPontok.length;i++)
    {
        
        if(minimum<=napiPontok[i])
        {
            ujeredmeny+=1;
        }
        else 
        {
            regieredmeny=ujeredmeny;
            ujeredmeny=0;
        }
        
    }
    if(ujeredmeny>regieredmeny)
    {return ujeredmeny;}
    else if(ujeredmeny<regieredmeny)
    {return regieredmeny;}
    else return regieredmeny;
}

}
