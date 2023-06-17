/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadradoareaperimetro_adp;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Area {
    
    
  static void Ingreselados (){
      double area;
      String Nombref;
      int la;
      
     Scanner dls = new Scanner(System.in);    
      System.out.println("Ingrese que figura desea sacar el area: ");
       Nombref = dls.nextLine();
      System.out.println("Cuantos lados tiene su figura: ");
      la = dls.nextInt();
      String[] lados = new String[la];
      
     
       for (int i = 0; i < la; i++) {
                 System.out.print("Ingrese el lado " + (i + 1) + ": ");
                 lados[i] = dls.next(); 
                 
                } 
  }
  
   
}
