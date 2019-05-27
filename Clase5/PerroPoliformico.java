/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.micurso.curso_java;

/**
 *
 * @author MB84608
 */
public class PerroPoliformico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro elvis = new Perro();
        PerroChihuahua frank = new PerroChihuahua();
        
        System.out.println(elvis.ladrar());
        System.out.println(frank.ladrar());
        System.out.println(frank.ladrar("Frank"));
        
       
        
        
    }
    
}
