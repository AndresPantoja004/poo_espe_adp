/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_l1_p7_retorno_valores;
import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class POO_L1_P7_RETORNO_VALORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones op1 = new Operaciones ();
       int nu1 = Integer.parseInt(JOptionPane.showInputDialog("Deme su primer numero:"));
       int nu2 = Integer.parseInt(JOptionPane.showInputDialog("Deme su segundo numero:"));
       op1.resultados(op1.sumar(nu1, nu2),op1.resta(nu1, nu2));
       
    }
    
}
