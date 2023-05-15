/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_l1_p7_retorno_valores;

/**
 *
 * @author ESPE
 */

public class Operaciones {

    
    public int sumar(int nu1, int nu2){
    int suma=nu1+nu2;
    //retorna el resultado
    return suma;
    
}

    
    public int resta(int nu1, int nu2){
        int resta=nu1-nu2;
        //retorna el resultado
        return resta;
    }

    public void resultados(int suma,int resta){
        System.out.println("el resultado de la suma es: "+suma);
        System.out.println("el resultado de la resta es: "+resta);
        
    }
}
