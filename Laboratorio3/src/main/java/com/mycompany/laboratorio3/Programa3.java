/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio3;

import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author Jose David
 */
public class Programa3 {
    public static void main (String[] args)
    {
        int r,a,e,total;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingrese los dolares que tiene Rodrigo: ");
        r=Teclado.nextInt();
        a = r/2;
        e = (r+a)/2;
        total = r+a+e;
        System.out.println("Rodrigo tiene: " + r + "dolares");
        System.out.println("Andrea tiene: " + a + "dolares");
        System.out.println("Esteban tiene: " + e + "dolares");
        System.out.println("En total juntos poseen: " +total + "dolares");
        
    }
}
