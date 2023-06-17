/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_p6_poo_adp;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    String placa;
    int numeroruedas;
    boolean encendido;
    String estado;
    
    public void setNumeroRuedas (int ruedas){
    numeroruedas = ruedas;

}
    public void encendido(){
        encendido = true;
        estado = "Vehiculo encendido";
    }
    public void apagado (){
        encendido = false;
        estado = "Vehiculo apagado";
    }
    
}

