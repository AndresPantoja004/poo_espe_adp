/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_l1_p8_metodos_parametros_elementos;
import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class POO_L1_P8_METODOS_PARAMETROS_ELEMENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creamos el objeto
        Operaciones op1 = new Operaciones ();
        //pedimos los numeros, se le pide al usuario que ingrese numeros
        int nu1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer numero:"));
        int nu2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo numero:"));
        //vemos que llama las dos variables y eso enviamos como argumento al metodo sumar
        op1.sumar(nu1, nu2);
        //presentamos los resultados
        op1.resultados();
        
    }
    
}
