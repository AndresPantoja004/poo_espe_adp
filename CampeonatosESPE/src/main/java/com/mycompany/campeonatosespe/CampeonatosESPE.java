/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.campeonatosespe;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CampeonatosESPE {

    public static void main(String[] args) {
        int selec;
        Scanner dls = new Scanner(System.in);
        
        System.out.println("===MENU CAMPEONATOS==");
        System.out.println("1: Ingrese equipos");
        System.out.println("2: Mostrar Equipos");
        System.out.println("3: Salir");
        selec = dls.nextInt();
        
        switch (selec){
            case 1:
                Equipos.ingresoequipos();
        }
        
    }
}
