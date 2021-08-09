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
public class Programa5 {
    public static void main(String[] args)
    {
        int parti,parcial1,parcial2,examenf;
        double pond1,pond2,pond3,pond4,total;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la nota de participacion: ");
        parti=Teclado.nextInt();
        System.out.println("Ingrese la nota del primer parcial: ");
        parcial1=Teclado.nextInt();
        System.out.println("Ingrese la nota del segundo parcial: ");
        parcial2=Teclado.nextInt();
        System.out.println("Ingrese la nota del examen final: ");
        examenf=Teclado.nextInt();
        pond1=parti*0.1;
        pond2=parcial1*0.25;
        pond3=parcial2*0.25;
        pond4=examenf*0.4;
        total=pond1+pond2+pond3+pond4;
        System.out.println("La nota final es de:" + total);
        
       
    }
}
