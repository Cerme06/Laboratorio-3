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
public class Programa4 {
    public static void main(String[] args)
    {
        int cant, mont;
        double comision, salario;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidada de carros vendidos: ");
        cant = Teclado.nextInt();
        System.out.println("Ingrese el monto total por los carros vendidos: ");
        mont = Teclado.nextInt();
        comision = mont * 0.05;
        salario = 1000 + (150 * cant) + comision;
        System.out.println("El salario a cobrar total es de: " + salario);
        
    }
}
