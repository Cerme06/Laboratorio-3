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
public class Programa1 {
    public static void main(String[] args)
    {
        int n1,n2,n3,suma,total;
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Ingrese la primer nota: ");
        n1=Teclado.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        n2=Teclado.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        n3=Teclado.nextInt();
        suma = n1 + n2 +n3;
        total = suma/3;
        System.out.println("El promedio es de: " + total);   
       
    }
}
