/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_3;

import java.time.LocalDateTime;

/**
 *
 * @author andri
 */
public abstract class Affichage{
    public void debut(){
        System.out.println(LocalDateTime.now() + " : Début de uneMethodeMetier ");
    }
    
    public void fin(){
        System.out.println(LocalDateTime.now() + " : Fin de uneMethodeMetier");
    }
}
