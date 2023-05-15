/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_l1_p8_metodos_parametros_elementos;

/**
 *
 * @author ESPE
 */
public class Operaciones {
    int suma; int resta; int mult; int divi;
    //generamos metodos
    //nuestro metodo es publico
    //vreamos metodos para sumar numeros tipo public, sin retornar void no tiene retorno
    //metodo suma
    
    public void sumar(int nu1, int nu2){
        suma=nu1+nu2;
    }
    // creamos un metodo para sumar
    public void resultados(){
        System.out.println("el resultado de la suma es: "+suma);
    }
}
