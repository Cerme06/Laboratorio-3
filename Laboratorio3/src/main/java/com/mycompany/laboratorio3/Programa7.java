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
public class Programa7 {
    public static void main(String[] args)
    {
       int totalh,s,d,h;
       Scanner Teclado= new Scanner(System.in);
       System.out.println("Ingrese el total de horas");
       totalh=Teclado.nextInt();
       s=totalh/(24*7);
       d=totalh % (24*7)/24;
       h=totalh % 24;
       System.out.println("las horas totales son: " + s + " semanas " + d + " dias y " + h + " horas");
       
    }
}
