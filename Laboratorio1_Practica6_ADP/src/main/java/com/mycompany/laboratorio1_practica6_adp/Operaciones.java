package com.mycompany.laboratorio1_practica6_adp;

/*import javax.swing.JOptionPane;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESPE
 */

import javax.swing.JOptionPane;

public class Operaciones {
    int num1;
    int num2;
    int sumar;
    int resta;
    int mult;
    int division;
    //generamos mettodos
    //pedimos numeros
    //nuestro metodo es publico
    
    public void capturarnumeros(){
        // pedir en pantalla los numeros
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Deme su primer numero:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Deme su segundo numero:"));
    }
    //creamos metodos para sumar numeros tipo public, sin retornar nada void no tiene retorno
    
    public void sumar (){
        sumar=num1+num2;
    }
    public void mult(){
        mult=num1*num2;
    }
    public void resta(){
        resta=num1-num2;
    }
    public void resultados(){
        System.out.println("el resultado de la suma es:"+sumar);
    }
    
}
