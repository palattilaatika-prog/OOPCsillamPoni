/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csillamponifeladat;

/**
 *
 * @author Denes
 */
public class Csillamponifeladat {

    public static void main(String[] args) 
    {
        CsillamPoni p = new RepuloCsillamPoni(
        "CsillamKapitan", 7, "lila");
        p.adjCsillamot(3);
        System.out.println(p.bemutatkozas());
 }

    }
}
