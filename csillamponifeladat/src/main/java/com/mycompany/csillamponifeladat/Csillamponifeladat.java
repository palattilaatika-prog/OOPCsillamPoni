/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csillamponifeladat;

import static com.mycompany.csillamponifeladat.CsillamPoni.leghosszabbCsillamSorozat;

/**
 *
 * @author Denes
 */
public class Csillamponifeladat {

    static int[] napiPontok = {4, 7, 9, 9, 8, 2, 10};
    static int[] napiPontok2={};
    public static void main(String[] args) 
    {
        //init for objects
        CsillamPoni p = new RepuloCsillamPoni
        ("CsillamKapitan", 7, "lila");
        
        p.adjCsillamot(3);
        CsillamPoni x= new CsillamPoni("Csilla",12);
        x.adjCsillamot(8);
        // testing the override "bemutatkozas()" method
        System.out.println(p.bemutatkozas());
        System.out.println(x.bemutatkozas());
        //testing output for the leghoszabbCsillamSorozat() method
        System.out.println(leghosszabbCsillamSorozat(napiPontok,8));
        System.out.println(leghosszabbCsillamSorozat(napiPontok2,5));
}
}
