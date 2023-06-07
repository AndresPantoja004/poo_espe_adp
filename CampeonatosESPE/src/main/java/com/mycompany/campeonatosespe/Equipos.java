/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatosespe;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Equipos {

    static void ingresoequipos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
    
    public void ingresoEquipos(){
         
        Scanner dls = new Scanner(System.in);
        
        System.out.println("Cuantos equipos desea Ingresar: ");
        int equip = dls.nextInt();
        String[] nombrequi = new String[equip];
        String[] carrera = new String [equip];
         
                       
        
        System.out.println("==MENU EQUIPOS==");
        System.out.println("1: Ingrese nombre de equipo");
        System.out.println("2: Ingrese integrantes");
        System.out.println("3: Salir");
        int selec = dls.nextInt();
        
        switch (selec){
            case 1:
                for (int i = 0; i < equip; i++) {
                        System.out.print("Nombre del equipo " + (i + 1) + ": ");
                        nombrequi[i] = dls.next();
                        System.out.print("Carrera: " + (i + 1) + ": ");
                        carrera[i] = dls.next();
                        
         }
                
        }
    
}
    
}

